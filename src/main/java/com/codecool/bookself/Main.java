package com.codecool.bookself;

public class Main {
    public static void main(String[] args) {
        BookShelf bookShelf = new BookShelf();
        bookShelf.addBook(new PaperbackBook("Zorba", "Kazantzakis", 1952, 350));
        bookShelf.addBook(new HardcoverBook("100 történelmi tévhit", "Hahner", 2010, 320));
        bookShelf.addBook(new HardcoverBook("100 történelmi tévhit 2.", "Hahner", 2013, 330));
        bookShelf.addBook(new PaperbackBook("Óz a nagy varázsló", "Baum", 1991, 270));
        bookShelf.addBook(new HardcoverBook("Elmesport egy esztendőre", "Gratzer", 2010, 230));
        System.out.println(bookShelf.getBooksFromYearWithoutStream(2010));
        System.out.println(bookShelf.getBooksFromYearWithStream(2010));
        System.out.println(bookShelf.getLightestAuthor());
        System.out.println(bookShelf.getAuthorOfMostWrittenPages());
        bookShelf.printBooks();
    }
}
