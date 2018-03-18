package com.oprotsen.JavaOOP.lesson4.messanger;

public class EmoticonText implements Text {
    private final Message message;

    public EmoticonText() {
        message = getMessage();
    }

    public Message getMessage() {
        return message;
    }

    public String printMessage(Message message) {
        if (message.getText().equalsIgnoreCase("winking-face"))
            return "\uD83D\uDE09";
        if (message.getText().equalsIgnoreCase("ghost"))
            return "\uD83D\uDC7B";
        return "";
    }
}
