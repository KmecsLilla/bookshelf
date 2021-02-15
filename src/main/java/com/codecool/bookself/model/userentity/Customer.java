package com.codecool.bookself.model.userentity;

import com.codecool.bookself.model.bookentity.Book;
import com.codecool.bookself.model.feedback.Rating;

import java.util.Date;
import java.util.List;

public class Customer {
    private long id;
    private String userName;
    private Date birth;
    private String email;

    private List<Book> wishList;
    private List<Rating> ratings;

    public Customer(String userName, Date birth, String email) {
        this.userName = userName;
        this.birth = birth;
        this.email = email;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public Date getBirth() {
        return birth;
    }

    public String getEmail() {
        return email;
    }

    public List<Book> getWishList() {
        return wishList;
    }

    public void addToWishList(Book book) {
        wishList.add(book);
    }

    public List<Rating> getRatings() {
        return ratings;
    }

    public void addRating(Rating rating) {
        ratings.add(rating);
    }

}
//Create a Customer class - with name, birth, email, wish list, book ratings, book comments