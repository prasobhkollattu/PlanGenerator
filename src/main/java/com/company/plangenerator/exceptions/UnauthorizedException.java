package com.company.plangenerator.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.company.plangenerator.utils.Messages;

@ResponseStatus(HttpStatus.UNAUTHORIZED)
public class UnauthorizedException extends PlanGeneratorException {
	private static final long serialVersionUID = 8481507757899949243L;

	public UnauthorizedException(String msg) {
		super(msg, Messages.UNAUTHORIZED, 401);

	}
}
