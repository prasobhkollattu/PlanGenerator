package com.company.plangenerator.exceptions.handlers;

import java.time.LocalDateTime;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.http.HttpStatus;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.web.HttpMediaTypeNotSupportedException;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.company.plangenerator.contollers.util.Messages;
import com.company.plangenerator.exceptions.PlanGeneratorException;
import com.company.plangenerator.exceptions.models.ExceptionResponse;

/**
 * 
 * @author prasobh kollattu Centralize handler for all exceptions
 */
@RestControllerAdvice
public class ExceptionHandlerControllerAdvice {

	@ExceptionHandler(PlanGeneratorException.class)
	public ExceptionResponse handleBootAppServiceException(final PlanGeneratorException exception,
			final HttpServletRequest request, final HttpServletResponse res) {

		ExceptionResponse error = exception.getError();
		error.setPath(request.getRequestURI());
		res.setStatus(exception.getErrorCode());
		return error;
	}

	@ExceptionHandler(Throwable.class)
	@ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
	public ExceptionResponse handleGeneralException(final Throwable exception, final HttpServletRequest request,
			final HttpServletResponse res) {
		return getExceptionResponse(exception.getMessage(), Messages.INTERNAL_SERVER_ERROR, request,
				HttpStatus.INTERNAL_SERVER_ERROR.value());
	}

	@ExceptionHandler(HttpMediaTypeNotSupportedException.class)
	@ResponseStatus(value = HttpStatus.BAD_REQUEST)
	public ExceptionResponse handleHttpMediaTypeNotSupportedException(final Throwable exception,
			final HttpServletRequest request, final HttpServletResponse res) {
		return getExceptionResponse(exception.getMessage(), Messages.INVALID_REQUEST, request,
				HttpStatus.BAD_REQUEST.value());
	}

	@ExceptionHandler(HttpMessageNotReadableException.class)
	@ResponseStatus(value = HttpStatus.BAD_REQUEST)
	public ExceptionResponse handleDateTimeParseException(final Throwable exception, final HttpServletRequest request,
			final HttpServletResponse res) {
		return getExceptionResponse(exception.getMessage(), Messages.INVALID_REQUEST, request,
				HttpStatus.BAD_REQUEST.value());
	}

	@ExceptionHandler(MethodArgumentNotValidException.class)
	@ResponseStatus(value = HttpStatus.BAD_REQUEST)
	protected ExceptionResponse handleMethodArgumentNotValid(final MethodArgumentNotValidException exception,
			final HttpServletRequest request, final HttpServletResponse res) {
		return getExceptionResponse(exception.getBindingResult().toString(), Messages.INVALID_REQUEST, request,
				HttpStatus.BAD_REQUEST.value());
	}

	private ExceptionResponse getExceptionResponse(final String errorDetails, final String errorMsg,
			final HttpServletRequest request, int httpStatus) {
		ExceptionResponse error = new ExceptionResponse();
		error.setPath(request.getContextPath());
		error.setMessage(errorDetails);
		error.setTimestamp(LocalDateTime.now().toString());
		error.setStatus(httpStatus);
		error.setError(errorMsg);
		return error;
	}

}
