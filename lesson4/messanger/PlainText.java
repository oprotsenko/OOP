package com.oprotsen.JavaOOP.lesson4.messanger;

public class PlainText implements Text {
    private final Message message;

    public PlainText() {
        message = getMessage();
    }

    public Message getMessage() {
        return message;
    }

    @Override
    public String printMessage(Message message) {
        return message.getText();
    }
}
