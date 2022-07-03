package ru.netology.domain;

public class MovieManager {
    private int limit = 10;
    private Poster[] movies = new Poster[0];

    public MovieManager(int limit) {
        this.limit = limit;
    }

    public MovieManager() {

    }

    public void add(Poster movie) {
        Poster[] tmp = new Poster[movies.length + 1];
        for (int i = 0; i < movies.length; i++) {
            tmp[i] = movies[i];
        }
        tmp[tmp.length - 1] = movie;
        movies = tmp;
    }

    public Poster[] findAll() {
        return movies;
    }

    public Poster[] findLast() {
        if (limit > 0) {
            int limitResult = Math.min(movies.length, limit);
            Poster[] reverse = new Poster[limitResult];
            for (int i = 0; i < limitResult; i++) {
                reverse[i] = movies[movies.length - 1 - i];
            }
            return reverse;
        } else {
            return new Poster[0];
        }
    }

    public Poster[] getMovies() {
        return movies;
    }
}
