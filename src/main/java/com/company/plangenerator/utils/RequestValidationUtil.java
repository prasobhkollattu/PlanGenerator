package com.company.plangenerator.utils;

import com.company.plangenerator.exceptions.InvalidInputException;
import com.company.plangenerator.models.LoanDetails;

/**
 * Util to validate requests
 * 
 * @author PRASOBH KOLLATTU
 *
 */
public class RequestValidationUtil {
	public static void validdateLoanDetails(final LoanDetails lonDetails) {
		if (lonDetails.getLoanAmount() < Constants.MIN_LOAN_AMOUNT) {
			throw new InvalidInputException(Messages.MINIMUM_LOAN_AMOUNT_ERROR);
		} else if (lonDetails.getNominalRate() < Constants.ONE) {
			throw new InvalidInputException(Messages.MINIMUM_NOMINALRATE_ERROR);
		} else if (lonDetails.getDuration() <= Constants.ZERO
				|| lonDetails.getDuration() > Constants.MAX_LOAN_DURATION_IN_MONTHS) {
			throw new InvalidInputException(Messages.LOAN_DURATION_ERROR);
		}
	}
}
