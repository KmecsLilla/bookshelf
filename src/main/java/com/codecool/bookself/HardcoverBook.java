package com.codecool.bookself;

public class HardcoverBook extends Book {
    private final static int PAGEWEIGHT = 10;
    private final static int WEIGHTOFCOVER = 100;

    public HardcoverBook(String title, String author, int releaseYear, int numberOfPages) {
        super(title, author, releaseYear, numberOfPages, numberOfPages * PAGEWEIGHT + WEIGHTOFCOVER);
    }
}
