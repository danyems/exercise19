package org.fujitsu.training.codes.exceptions;

public class AuthorException extends Exception{
	
	private String message = "Only 5 instances of Author is allowed.";
	
	public AuthorException() {}
	
	public AuthorException(String msg) {
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
