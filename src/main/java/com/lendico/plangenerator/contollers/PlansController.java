package com.lendico.plangenerator.contollers;

import javax.validation.Valid;

import org.springframework.http.ResponseEntity;

import com.lendico.plangenerator.apis.GeneratePlanApi;
import com.lendico.plangenerator.models.LoanDetails;
import com.lendico.plangenerator.models.RepaymentPlans;

/**
 * controller to handle reinstallment plans
 * 
 * @author Prasobh Kollattu
 *
 */

public class PlansController implements GeneratePlanApi {

	@Override
	public ResponseEntity<RepaymentPlans> preCalculateRepaymentPlans(@Valid LoanDetails body) {
		// TODO Auto-generated method stub
		return null;
	}

}
