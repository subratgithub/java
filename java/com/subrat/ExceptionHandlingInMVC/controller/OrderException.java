package com.subrat.ExceptionHandlingInMVC.controller;

@SuppressWarnings("serial")
public class OrderException extends Exception{
    
	
	public OrderException(String message, Throwable cause) {
		super(message, cause);
		
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = -8091516404566322616L;
	String message;
	
	public OrderException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

}
