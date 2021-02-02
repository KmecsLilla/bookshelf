package com.codecool.bookself;

public abstract class Book {
   protected String title;
   protected String author;
   protected int releaseYear;
   protected int numberOfPages;
   protected int weightInGram;

    public Book(String title, String author, int releaseYear, int numberOfPages, int weightInGram) {
        this.title = title;
        this.author = author;
        this.releaseYear = releaseYear;
        this.numberOfPages = numberOfPages;
        this.weightInGram = weightInGram;
    }

    public String getAuthor() {
        return author;
    }
    public int getWeight() {
        return weightInGram;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public String getBookInfo() {
        return "" + author + ": " + title + " (" + releaseYear + ")";
    }

    @Override
    public String toString() {
        return getBookInfo();
    }
}


//1. Az osztály neve legyen: Book
//Minden könyvnek legyen:
//címe (title)
//szerzője (author)
//kiadási éve (releaseYear)
//oldalak száma (numberOfPages)
//tömege gramban mérve (weightInGram), ami egy számolt érték.

//2. Az osztály rendelkezzen egy olyan konstruktorral melynek segítségével az összes előre megadott tulajdonságát
// be tudjuk állítani a fent megadott sorrendben. (cím, szerző, stb.)
//Legyen egy getBookInfo() metódusa, ami egy stringgel tér vissza a következő formátumban: <author>: <title> (<releaseYear>)
//Példa: J. K. Rowling: Harry Potter and the Philosopher's Stone (1997)

//3. Az osztály neve legyen: HardcoverBook
//
//a constructor a következő sorrendben várja a paramtéreket:
//cím (title)
//szerző (author)
//kiadási év (releaseYear)
//oldalak száma (numberOfPages)
//1 oldal tömege: 10 gram
//A keménykötésű borító tömege: 100 gram
//A keménykötésű könyv tömegét az oldalak tömegének összege és a keménykötésű borító tömegének összege alapján kapjuk meg

//4. Az osztály neve legyen: PaperbackBook
//a constructor a következő sorrendben várja a paramtéreket:
//cím (title)
//szerző (author)
//kiadási év (releaseYear)
//oldalak száma (numberOfPages)
//1 oldal tömege: 10 gram
//A papírkötésű borító tömege: 20 gram
//A papírkötésű könyv tömegét az oldalak tömegének összege és a papírkötésű borító tömegének összege alapján kapjuk meg

//5.  osztály neve legyen Bookshelf
//Legyen egy addBook() függvénye, aminek segítségével a paraméterben megadott könyvet el lehet tárolni a polcban

//6.Legyen egy getBooks() függvénye, aminek legyen egy year paramétere.
// Azon könyveket adja vissza egy listában, amik a year évében lettek kiadva.

//7. Legyen egy getLightestAuthor() függvénye, ami visszaadja annak a szerzőnek a nevét, aki a legkönnyebb könyvet írta.

//8. Legyen egy getAuthorOfMostWrittenPages() függvénye, ami visszaadja annak a szerzőnek a nevét, aki a legtöbb oldalt írta.

//Legyen egy printBooks() függvénye, ami kiírja az összes könyv adatát.
// Soronként kiírja a könyvek getBookInfo() visszatérési értékét
//Figyelj a bemeneti paraméter validálására is!