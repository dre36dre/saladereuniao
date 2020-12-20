package com.digital.crud.saladereuniao.saladereuniao.exception;

import java.util.Date;

import org.springframework.stereotype.Controller;

@ControllerAdvice
public class GlobalExceptionHandle {
	@ (ResourceNotFoundException.class)
	public ResponseEntity<?> resourceNotException
	(ResourceNotException ex, WebRequest request){
		ErrorDetails errorDetails=new ErrorDetails
				(new Date(),ex.getMessage(),request.getDescription(b:false));
		return new ResponseEntity<>(ErrorDetails, HttpStatus.NOT_FOUND);
	}
	
	@ExceptionHandler(Exception.class)
	public ResponsityEntity<?> globalExceptionHandler(Exception ex,WebRequest request){
		ErrorDetails errorDetails=new ErrorDetails
				(new Date(),ex.getMessage(),request.getDescription(b:false));
		return new ResponseEntity<?>(ErrorDetails, HttpStatus.INTERNAL_SERVER_ERROR);
	}
}
