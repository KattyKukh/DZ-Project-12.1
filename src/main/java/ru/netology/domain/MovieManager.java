package ru.netology.domain;

import ru.netology.repository.Repository;

public class MovieManager {
    private final Repository repo;
    private int limit = 10;

    public MovieManager(Repository repo) {
        this.repo = repo;
    }

    public MovieManager(Repository repo, int limit) {
        this.limit = limit;
        this.repo = repo;
    }

    public void add(Poster movie) {
        repo.save(movie);
    }

    public Poster[] findAll() {
        return repo.findAll();
    }

    public Poster[] findLast() {
        Poster[] all = repo.findAll();
        if (limit > 0) {
            int limitResult;
            limitResult = Math.min(limit, all.length);
            Poster[] reversed = new Poster[limitResult];
            for (int i = 0; i < limitResult; i++) {
                reversed[i] = all[all.length - 1 - i];
            }
            return reversed;
        } else {
            return new Poster[0];
        }
    }
}
