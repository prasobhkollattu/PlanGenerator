package com.company.plangenerator.contollers.util;

import com.company.plangenerator.exceptions.InvalidInputException;
import com.company.plangenerator.models.LoanDetails;

/**
 * Util to validate inputs
 * 
 * @author PRASOBH KOLLATTU
 *
 */
public class RequestValidationUtil {
	public static void validdateLoanDetails(final LoanDetails lonDetails) {
		if (lonDetails.getLoanAmount() < 500) {
			throw new InvalidInputException(Messages.MINIMUM_LOAN_AMOUNT_ERROR);
		} else if (lonDetails.getNominalRate() < 1) {
			throw new InvalidInputException(Messages.MINIMUM_NOMINALRATE_ERROR);
		} else if (lonDetails.getDuration() < 0 || lonDetails.getDuration() > 360) {
			throw new InvalidInputException(Messages.LOAN_DURATION_ERROR);
		}

	}
}
