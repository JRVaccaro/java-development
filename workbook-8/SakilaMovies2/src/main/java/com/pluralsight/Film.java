package com.pluralsight;

public class Film {
    private int filmId;
    private int releaseYear;
    private int length;
    private String title;
    private String description;

    public Film(int filmId, int releaseYear, int length, String title, String description) {
        this.filmId = filmId;
        this.releaseYear = releaseYear;
        this.length = length;
        this.title = title;
        this.description = description;
    }

    public int getFilmId() {
        return filmId;
    }

    public void setFilmId(int filmId) {
        this.filmId = filmId;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
