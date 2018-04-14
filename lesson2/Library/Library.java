package com.oprotsen.JavaOOP.lesson2.Library;

import java.util.ArrayList;

public class Library {
    private final ArrayList<Book> library = new ArrayList<>();

    public void addBook(Book book) {
        library.add(book);
    }

    public void findAuthor(String author) {
        for (Book elem : library) {
            if (elem.getAuthor().equals(author)) {
                System.out.println("Book(s) of looking author: ");
                System.out.println(elem);
            }
             //   System.out.println("We don't have book of looking author.");
        }
    }

    public void findPublisher(String publishingHouse) {
        for (Book elem : library) {
            if (elem.getPublishingHouse().equals(publishingHouse)) {
                System.out.println("Book(s) of looking publisher: ");
                System.out.println(elem);
            }
            //  System.out.println("We don't have book of looking publisher.");
        }
    }

    public void findYearAfter(int publishingYear) {
        System.out.println("Book(s) after year " + publishingYear + ": ");
        for (Book elem : library) {
            if (elem.getPublishingYear() > publishingYear) {
                System.out.println(elem);
            }
        }
        //System.out.println("We don't have book after " + publishingYear + " year.");
    }

    @Override
    public String toString() {
        return "library: " + library;
    }
}
