package com.oprotsen.JavaOOP.lesson6;

public class AccountException extends Exception{
	public AccountException(String message) throws AccountException{
		super(message);
	}

	public AccountException(String message, Throwable cause)throws AccountException {
		super(message, cause);
	}
}