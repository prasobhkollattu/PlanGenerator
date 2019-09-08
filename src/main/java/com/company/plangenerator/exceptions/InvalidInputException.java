package com.company.plangenerator.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.company.plangenerator.utils.Messages;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class InvalidInputException extends PlanGeneratorException {
	private static final long serialVersionUID = 8481507757899949243L;

	public InvalidInputException(String msg) {
		super(msg, Messages.BAD_INPUT, 400);

	}
}
