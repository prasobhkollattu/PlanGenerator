package com.company.plangenerator.services;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.OffsetDateTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.company.plangenerator.models.LoanDetails;
import com.company.plangenerator.models.RepaymentPlan;
import com.company.plangenerator.models.RepaymentPlans;
import com.company.plangenerator.utils.Constants;

/**
 * Service to handle PlanGenerator
 * 
 * @author PRASOBH KOLLATTU
 *
 */
@Service
public class PlanGeneratorService {

	Logger logger = LoggerFactory.getLogger(PlanGeneratorService.class);

	public RepaymentPlans getRepaymentPlans(LoanDetails loanDetails) {
		return generateRepaymentPlans(loanDetails);
	}

	private RepaymentPlans generateRepaymentPlans(LoanDetails loanDetails) {

		final double nominalRate = loanDetails.getNominalRate();
		double loanAmount = loanDetails.getLoanAmount();
		final int loanDuration = loanDetails.getDuration();
		final double monthlyRate = (nominalRate / Constants.NO_OF_MONTHS_IN_A_YEAR) / Constants.HUNDRED;
		final RepaymentPlans repaymentPlans = new RepaymentPlans();
		final List<RepaymentPlan> repaymentPlansList = new ArrayList<>();
		OffsetDateTime paymentDate = loanDetails.getStartDate();
		repaymentPlans.setRepaymentPlans(repaymentPlansList);
		generateRepaymentPlanForPendingDurations(loanDetails, nominalRate, loanAmount, loanDuration, monthlyRate,
				repaymentPlansList, paymentDate);

		return repaymentPlans;
	}

	private void generateRepaymentPlanForPendingDurations(LoanDetails loanDetails, final double nominalRate,
			double loanAmount, final int loanDuration, final double monthlyRate,
			final List<RepaymentPlan> repaymentPlansList, OffsetDateTime paymentDate) {
		for (int pendingPaymentInMonth = loanDuration; pendingPaymentInMonth > Constants.ZERO; pendingPaymentInMonth--) {
			final RepaymentPlan repaymentPlan = new RepaymentPlan();
			final double interest = ((nominalRate / Constants.HUNDRED * Constants.NO_OF_DAYS_IN_A_MONTH * loanAmount)
					/ Constants.NO_OF_DAYS_IN_A_YEAR);
			logger.debug("interest " + roundVal(interest));
			repaymentPlan.setInterest(roundVal(interest));
			repaymentPlan.setInitialOutstandingPrincipal(roundVal(loanAmount));
			repaymentPlan.setDate(paymentDate);
			final double futureValue = calculateFutureValueOfTheLoanAmount(loanAmount, nominalRate / Constants.HUNDRED,
					loanDetails.getDuration());
			final double presentValue = calculatePresentValueOfLoanAmount(futureValue, nominalRate / Constants.HUNDRED,
					loanDetails.getDuration());

			logger.debug("presentValue  " + presentValue);

			final double borrowerPaymentAmount = roundVal((loanAmount * monthlyRate)
					/ (Constants.ONE - Math.pow(Constants.ONE + monthlyRate, -pendingPaymentInMonth)));
			repaymentPlan.setBorrowerPaymentAmount(borrowerPaymentAmount);
			logger.debug("borrowerPaymentAmount " + borrowerPaymentAmount);

			final double remainingOutstandingPrincipal = (loanAmount + interest) - borrowerPaymentAmount;
			logger.debug("remainingOutstandingPrincipal " + remainingOutstandingPrincipal);
			repaymentPlan.setRemainingOutstandingPrincipal(roundVal(remainingOutstandingPrincipal));

			final double interestAmount = loanAmount * monthlyRate;
			final double principal = roundVal(borrowerPaymentAmount - interestAmount);
			logger.debug("principal " + principal);
			repaymentPlan.setPrincipal(principal);
			logger.debug("repaymentPlan " + repaymentPlan);

			repaymentPlansList.add(repaymentPlan);

			loanAmount = remainingOutstandingPrincipal;
			paymentDate = paymentDate.plus(Constants.ONE, ChronoUnit.MONTHS);
		}
	}

	private double roundVal(double val) {
		return new BigDecimal(val).setScale(Constants.TWO, RoundingMode.HALF_UP).doubleValue();
	}

	private double calculateFutureValueOfTheLoanAmount(double investmentAmount, double annualInterestRate,
			double months) {
		return investmentAmount
				* Math.pow(Constants.ONE + (annualInterestRate / Constants.NO_OF_MONTHS_IN_A_YEAR), months);
	}

	public double calculatePresentValueOfLoanAmount(double futureValue, double annualInterestRate, int months) {
		return futureValue / Math.pow(Constants.ONE + annualInterestRate, months / Constants.NO_OF_MONTHS_IN_A_YEAR);
	}
}
