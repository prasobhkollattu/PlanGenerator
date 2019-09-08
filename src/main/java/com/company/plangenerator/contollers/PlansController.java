package com.company.plangenerator.contollers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import com.company.plangenerator.apis.GeneratePlanApi;
import com.company.plangenerator.contollers.util.RequestValidationUtil;
import com.company.plangenerator.models.LoanDetails;
import com.company.plangenerator.models.RepaymentPlans;
import com.company.plangenerator.services.PlanGeneratorService;

/**
 * controller to handle reinstallment plans
 * 
 * @author Prasobh Kollattu
 *
 */
@RestController
public class PlansController implements GeneratePlanApi {

	@Autowired
	private PlanGeneratorService planGeneratorService;

	@Override
	public ResponseEntity<RepaymentPlans> preCalculateRepaymentPlans(@Valid LoanDetails loanDetails) {
		System.out.println(loanDetails);
		RequestValidationUtil.validdateLoanDetails(loanDetails);
		return new ResponseEntity<RepaymentPlans>(planGeneratorService.getRepaymentPlans(loanDetails), HttpStatus.OK);
	}

}
