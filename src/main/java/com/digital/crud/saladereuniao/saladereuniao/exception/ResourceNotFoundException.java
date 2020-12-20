package com.digital.crud.saladereuniao.saladereuniao.exception;

import org.springframework.*;
import org.springframework.web.bind.annotation.ResponseStatus;


@ResponseStatus(value.httpStatus.NOT_FOUND)
public class ResourceNotFoundException  extends Exception {
	
	private static final long serialVersionUID= 1L;
	
	public ResourceNotFoundException(String message) {
		super(message);
	}

	
	
}
