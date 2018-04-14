package com.oprotsen.JavaOOP.lesson2.Library;

public class Book {
    private String name;
    private String author;
    private String cover;
    private String publishingHouse;
    private int publishingYear;
    private int pages;
    private int price;

    public Book() {
    }

    public String getName() {
        return name;
    }

    public Book setName(String name) {
        this.name = name;
        return this;
    }

    public String getAuthor() {
        return author;
    }

    public Book setAuthor(String author) {
        this.author = author;
        return this;
    }

    public String getCover() {
        return cover;
    }

    public Book setCover(String cover) {
        this.cover = cover;
        return this;
    }

    public String getPublishingHouse() {
        return publishingHouse;
    }

    public Book setPublishingHouse(String publishingHouse) {
        this.publishingHouse = publishingHouse;
        return this;
    }

    public int getPublishingYear() {
        return publishingYear;
    }

    public Book setPublishingYear(int publishingYear) {
        this.publishingYear = publishingYear;
        return this;
    }

    public int getPages() {
        return pages;
    }

    public Book setPages(int pages) {
        this.pages = pages;
        return this;
    }

    public int getPrice() {
        return price;
    }

    public Book setPrice(int price) {
        this.price = price;
        return this;
    }

    @Override
    public String toString() {
        return  "'" + name + "'" + ", author: " + author +
                ", cover: " + cover + ", publishingHouse: " + publishingHouse +
                ", publishingYear: " + publishingYear +
                ", vol. " + pages + ", price: " + price;
    }
}
