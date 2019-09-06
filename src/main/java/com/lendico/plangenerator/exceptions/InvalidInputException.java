package com.lendico.plangenerator.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class InvalidInputException extends PlanGeneratorException {
	private static final long serialVersionUID = 8481507757899949243L;

	public InvalidInputException(String msg) {
		super(msg, "The given input has not the right format", 400);

	}
}
