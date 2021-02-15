package com.codecool.bookself.model.bookentity;

public class PaperbackBook extends Book {
    private final static int PAGEWEIGHT = 10;
    private final static int WEIGHTOFCOVER = 20;

    public PaperbackBook(String title, Author author, Genre genre, int releaseYear, int numberOfPages) {
        super(title, author, genre, releaseYear, numberOfPages, numberOfPages * PAGEWEIGHT + WEIGHTOFCOVER);
    }
}
