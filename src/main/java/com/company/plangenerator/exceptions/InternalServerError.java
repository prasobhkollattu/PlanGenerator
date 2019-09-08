package com.company.plangenerator.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.company.plangenerator.utils.Messages;

@ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
public class InternalServerError extends PlanGeneratorException {
	private static final long serialVersionUID = 8481507757899949243L;

	public InternalServerError(String msg) {
		super(msg, Messages.INTERNAL_SERVER_ERROR, 500);

	}
}
