package com.codecool.bookself.model.feedback;


import com.codecool.bookself.model.bookentity.Book;
import com.codecool.bookself.model.userentity.Customer;

public class Rating {
    private long id;
    private Book book;
    private Customer customer;
    private int rating;
    private String comment;

    public Rating(Book book, Customer customer, int rating, String comment) {
        this.book = book;
        this.customer = customer;
        this.rating = rating;
        this.comment = comment;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Book getBook() {
        return book;
    }

    public Customer getCustomer() {
        return customer;
    }

    public int getRating() {
        return rating;
    }

    public String getComment() {
        return comment;
    }
}


//modelbe
//Rating osztály
//Rating (1-10)
//Opinion
//value
//book id
//customer id