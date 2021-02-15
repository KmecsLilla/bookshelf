package com.codecool.bookself.model.bookentity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Author {
    private long id;
    private String name;
    private Date birth;
    private List<Book> bibliography;

    public Author(String name, Date birth) {
        this.name = name;
        this.birth = birth;
        this.bibliography = new ArrayList<>();
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public Date getBirth() {
        return birth;
    }

    public List<Book> getBibliography() {
        return bibliography;
    }

    public void addToBibliography(Book book) {
        this.bibliography.add(book);
    }
}
