package ru.netology.domain;

public class MovieManager {
    private int id;
    private String title;
    private String genre;
    private int limit = 10;
    private MovieManager[] movies = new MovieManager[0];

    public MovieManager(int id, String title, String genre) {
        this.id = id;
        this.title = title;
        this.genre = genre;
    }

    public MovieManager(int limit) {
        this.limit = limit;
    }

    public MovieManager() {

    }

    public void add(MovieManager movie) {
        MovieManager[] tmp = new MovieManager[movies.length + 1];
        for (int i = 0; i < movies.length; i++) {
            tmp[i] = movies[i];
        }
        tmp[tmp.length - 1] = movie;
        movies = tmp;
    }


    public MovieManager[] findAll() {
        return movies;
    }

    public MovieManager[] findLast() {
        if (limit >= 0) {
            if (movies.length >= limit) {
                MovieManager[] reverse = new MovieManager[limit];
                for (int i = 0; i < limit; i++) {
                    reverse[i] = movies[movies.length - 1 - i];
                }
                return reverse;
            } else {
                MovieManager[] reverse2 = new MovieManager[movies.length];
                for (int i = 0; i < movies.length; i++) {
                    reverse2[i] = movies[movies.length - 1 - i];
                }
                return reverse2;
            }
        } else {
            MovieManager[] limitNull = new MovieManager[0];
            return limitNull;
        }
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getGenre() {
        return genre;
    }

    public int getLimit() {
        return limit;
    }

}
