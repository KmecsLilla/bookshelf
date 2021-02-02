package com.codecool.bookself;

public class PaperbackBook extends Book{
    private final static int PAGEWEIGHT = 10;
    private final static int WEIGHTOFCOVER = 20;

    public PaperbackBook(String title, String author, int releaseYear, int numberOfPages) {
        super(title, author, releaseYear, numberOfPages, numberOfPages * PAGEWEIGHT + WEIGHTOFCOVER);
    }
}
