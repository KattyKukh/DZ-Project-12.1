package ru.netology.repository;

import ru.netology.domain.Poster;

public class Repository {
    private Poster[] movies = new Poster[0];

    //    save - добавляет объект в массив
    //    findAll - возвращает массив всех хранящихся в массиве объектов
    //    findById - возвращает объект по идентификатору (либо null, если такого объекта нет)
    //    removeById - удаляет объект по идентификатору (если объекта нет, то пусть будет исключение, как на лекции)
    //    removeAll* - полностью вычищает репозиторий (для удаления всех элементов достаточно в поле items положить пустой массив)

    public void save(Poster movie) {
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

    public Poster[] findById(int id) {
        Poster[] tmp = new Poster[1];
        int copyToIndex = 0;
        for (Poster movie : movies) {
            if (movie.getId() == id) {
                tmp[0] = movies[copyToIndex];
                return tmp;
            } else {
                copyToIndex++;
            }
        }
        return new Poster[0];
    }

    public Poster[] removeById(int id) {

        Poster[] tmp = new Poster[movies.length - 1];
        int copyToIndex = 0;
        for (Poster movie : movies) {
            if (movie.getId() != id) {
                copyToIndex++;
                if (copyToIndex == movies.length) {
                    return movies;
                } else {
                    tmp[copyToIndex - 1] = movie;
                }
            }
        }
        movies = tmp;
        return movies;
    }

    public Poster[] removeAll() {
        movies = new Poster[0];
        return movies;
    }

    public Poster[] getMovies() {
        return movies;
    }
}
