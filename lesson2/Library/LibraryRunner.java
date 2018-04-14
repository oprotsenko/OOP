package com.oprotsen.JavaOOP.lesson2.Library;

public class LibraryRunner {
    public static void main(String[] args) {
        Library library = createBook();

        library.findAuthor("Oakley");
        library.findPublisher("Disaster Relief");
        library.findYearAfter(2003);
    }

    public static Library createBook() {
        Library library = new Library();
        library.addBook(new Book()
                .setName("Cleaner living")
                .setAuthor("Choi")
                .setCover("hard")
                .setPages(289)
                .setPrice(438)
                .setPublishingHouse("Scientific American")
                .setPublishingYear(2003));
        library.addBook(new Book()
                .setAuthor("Oakley")
                .setCover("soft")
                .setName("The tragic trade")
                .setPages(145)
                .setPrice(236)
                .setPublishingHouse("Australian")
                .setPublishingYear(2005));
        library.addBook(new Book()
                .setAuthor("Ward")
                .setCover("hard")
                .setName("Australian bush fires burn on")
                .setPages(234)
                .setPrice(342)
                .setPublishingHouse("Disaster Relief")
                .setPublishingYear(2007));

        return library;
    }
}
