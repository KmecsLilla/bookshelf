package com.codecool.bookself;

import java.util.*;
import java.util.stream.Collectors;

public class BookShelf {
    private List<Book> myBookShelf = new ArrayList<>();

    public void addBook(Book book) {
        myBookShelf.add(book);
    }

    public List<Book> getBooksFromYearWithoutStream(int year) {
        List<Book> booksInGivenYear = new ArrayList<>();
        for (Book book : myBookShelf) {
            if (book.getReleaseYear() == year)
                booksInGivenYear.add(book);
        }
        return booksInGivenYear;
    }

    public List<Book> getBooksFromYearWithStream(int year) {
        return myBookShelf
            .stream()
            .filter(book -> book.getReleaseYear() == year)
            .collect(Collectors.toList());
    }


    public String getLightestAuthor() {
        String result = myBookShelf
            .stream()
            .sorted((book1, book2) -> book1.getWeight() - book2.getWeight())
            //.sorted(Comparator.comparing(book -> Integer.valueOf(book.getWeight())))
            //.sorted(Comparator.comparingInt(Book::getWeight))
            .findFirst()
            .get()
            .getAuthor();
        return result;
    }

    public String getAuthorOfMostWrittenPages() {
        Map<String,Integer> pagesPerAuthor = new HashMap<>();
        for (Book book : myBookShelf) {
            if (pagesPerAuthor.containsKey(book.getAuthor())) {
                pagesPerAuthor.put(book.getAuthor(), pagesPerAuthor.get(book.getAuthor()) + book.getNumberOfPages());
            } else {
                pagesPerAuthor.put(book.getAuthor(), book.getNumberOfPages());
            }
        }
        String result = "";
        int maxPages = 0;
        for (String author : pagesPerAuthor.keySet() ) {
            int actualpages = pagesPerAuthor.get(author);
            if (actualpages > maxPages) {
                maxPages = actualpages;
                result = author;
            }
        }
        return result;
    }

    public void printBooks() {
        for (Book book : myBookShelf) {
            System.out.println(book.getBookInfo());
        }
    }
}

//7. Legyen egy getLightestAuthor() függvénye, ami visszaadja annak a szerzőnek a nevét, aki a legkönnyebb könyvet írta.

//8. Legyen egy getAuthorOfMostWrittenPages() függvénye, ami visszaadja annak a szerzőnek a nevét, aki a legtöbb oldalt írta.

//Legyen egy printBooks() függvénye, ami kiírja az összes könyv adatát.
// Soronként kiírja a könyvek getBookInfo() visszatérési értékét
//Figyelj a bemeneti paraméter validálására is!