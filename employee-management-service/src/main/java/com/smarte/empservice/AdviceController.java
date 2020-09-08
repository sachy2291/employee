package com.smarte.empservice;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

import com.smarte.empservice.exception.DepartmentIdNotFoundException;
import com.smarte.empservice.exception.EmployeeIdNotFoundException;
import com.smarte.empservice.exception.IdNotFound;



@ControllerAdvice
public class AdviceController {
	
	@ExceptionHandler(value = EmployeeIdNotFoundException.class)
	public ResponseEntity<IdNotFound> handleGenericOrderNotFoundException(IdNotFound e, WebRequest request) {
		IdNotFound error = new IdNotFound(new Date(), e.getMessage(), request.getDescription(false));
		return new ResponseEntity<>(error, HttpStatus.NOT_FOUND);
	}
	@ExceptionHandler(value = DepartmentIdNotFoundException.class)
	public ResponseEntity<IdNotFound> handleGenericProductNotFoundException(IdNotFound e, WebRequest request) {
		IdNotFound error = new IdNotFound(new Date(), e.getMessage(), request.getDescription(false));
		return new ResponseEntity<>(error, HttpStatus.NOT_FOUND);
	}
	@ExceptionHandler(Exception.class)
	public ResponseEntity<?> globleExcpetionHandler(Exception e, WebRequest request) {
		IdNotFound errorDetails = new IdNotFound(new Date(), e.getMessage(), request.getDescription(false));
		return new ResponseEntity<>(errorDetails, HttpStatus.INTERNAL_SERVER_ERROR);
	}


}
