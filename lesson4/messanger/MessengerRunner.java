package com.oprotsen.JavaOOP.lesson4.messanger;

public class MessengerRunner {
    public static void main(String[] args) {
        Dialog dialog = new Dialog();
        Text text = new PlainText();
        Text heart = new PictureText();
        Text em = new EmoticonText();
        dialog.addMessage(new Message("Elis", "18.03.18", "heart", text));
        dialog.addMessage(new Message("John", "18.03.18","heart", heart));
        dialog.addMessage(new Message("Elis", "18.03.18","ghost", em));

        dialog.printDialog();


    }
}
