package com.oprotsen.JavaOOP.lesson4.messanger;

public class Message {
    private final String author;
    private final String publicationTime;
    private final String text;
    private final Text type;

    public Message(String author, String publicationTime,String text, Text type) {
        this.author = author;
        this.publicationTime = publicationTime;
        this.text = text;
        this.type = type;
    }

    public String getText() {
        return text;
    }

    public String getAuthor() {
        return author;
    }

    public String getPublicationTime() {
        return publicationTime;
    }

    public String getMessageContent() {
        return type.printMessage(this);
    }

    @Override
    public String toString() {
        return "Message{" +
                "author='" + author + '\'' +
                ", publicationTime='" + publicationTime + '\'' +
                ", text='" + text + '\'' +
                ", type=" + type +
                '}';
    }
}
