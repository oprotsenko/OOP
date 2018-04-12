package com.oprotsen.JavaOOP.lesson6;

public class AccountConnectionException extends AccountException {
    public AccountConnectionException(String message)throws AccountException {
        super(message);
    }

    public AccountConnectionException(String message, Throwable cause)throws AccountException {
        super(message, cause);
    }
}