package com.codecool.bookself.model.bookentity;

public enum Genre {
    DRAMA("Drama"),
    FICTION("Fiction"),
    NONFICTION("NonFiction"),
    SCIFI("Science Fiction"),
    FANTASY("Fantasy"),
    HISTORY("History"),
    CLASSIC("Classic");

    private final String genreName;

    Genre(String tileName) {
        this.genreName = tileName;
    }

    public String getGenreName() {
        return genreName;
    }

}
