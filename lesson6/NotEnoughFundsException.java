package com.oprotsen.JavaOOP.lesson6;

public class NotEnoughFundsException extends AccountException {
    public NotEnoughFundsException(String message)throws AccountException {
        super(message);
    }

    public NotEnoughFundsException(String message, Throwable cause)throws AccountException {
        super(message, cause);
    }
}