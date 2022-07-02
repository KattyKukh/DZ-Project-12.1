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

    public MovieManager(MovieManager[] movies, int limit) {
        this.limit = limit;
        this.movies = movies;
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
        if (limit > 0) {
            int limitResult = Math.min(movies.length, limit);
            MovieManager[] reverse = new MovieManager[limitResult];
            for (int i = 0; i < limitResult; i++) {
                reverse[i] = movies[movies.length - 1 - i];
            }
            return reverse;
        } else {
            return new MovieManager[0];
        }
    }

    public int getId() {
        return id;
    }

    public MovieManager[] getMovies() {
        return movies;
    }
}
