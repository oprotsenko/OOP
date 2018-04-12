package com.oprotsen.JavaOOP.lesson6;

public class AccountExpiredException extends AccountException {
    public AccountExpiredException(String message) throws AccountException{
        super(message);
    }

    public AccountExpiredException(String message, Throwable cause)throws AccountException {
        super(message, cause);
    }
}