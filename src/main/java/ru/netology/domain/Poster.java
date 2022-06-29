package ru.netology.domain;

public class Poster {
    private int id;
    private String title;
    private String genre;

    public Poster(int id, String title, String genre) {
        this.id = id;
        this.title = title;
        this.genre = genre;
    }

    public int getId() {
        return id;
    }
}

