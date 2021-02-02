package org.fujitsu.training.codes.exceptions;

public class BookException extends Exception{
	
private String message = "Only 5 instances of Book is allowed.";
	
	public BookException() {}
	
	public BookException(String msg) {
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
