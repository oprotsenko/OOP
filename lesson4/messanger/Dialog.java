package com.oprotsen.JavaOOP.lesson4.messanger;

import java.util.ArrayList;

public class Dialog {
    private final ArrayList<Message> dialog = new ArrayList<>();

    public void addMessage(Message message) {
        dialog.add(message);
    }

    public void printDialog() {
        for (Message elem: dialog) {
            System.out.print(elem.getAuthor() + " ");
            System.out.println(elem.getPublicationTime());
            System.out.println(elem.getMessageContent());
        }
    }
}
