package org.fujitsu.training.objects.exceptions;

public class PayFirstForAdditionalException extends Exception{
	
	private String message = "Invalid Input.";
	
	public PayFirstForAdditionalException() {}
	
	public PayFirstForAdditionalException(String msg) {
		message = msg;
	}
	
	@Override
	public String getMessage() {
		return message;
	}
	
	@Override
	public void printStackTrace() {
		System.err.println(message);
	}
}
