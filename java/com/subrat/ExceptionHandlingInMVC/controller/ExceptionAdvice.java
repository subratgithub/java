package com.subrat.ExceptionHandlingInMVC.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.subrat.ExceptionHandlingInMVC.model.OrderError;

@RestControllerAdvice
public class ExceptionAdvice {
	
	@ExceptionHandler(OrderException.class)
	public ResponseEntity<OrderError> getErrorMessage(OrderException oex) {
		OrderError oe= new OrderError(HttpStatus.INTERNAL_SERVER_ERROR.value(), oex.getMessage());
		return new ResponseEntity<OrderError>(oe,HttpStatus.INTERNAL_SERVER_ERROR);
	}
    
}
