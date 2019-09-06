package com.lendico.plangenerator.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.UNAUTHORIZED)
public class UnauthorizedException extends PlanGeneratorException {
	private static final long serialVersionUID = 8481507757899949243L;

	public UnauthorizedException(String msg) {
		super(msg, "Unauthorized", 401);

	}
}
