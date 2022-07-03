package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MovieManagerTest {
    MovieManager manager = new MovieManager();
    Poster movie1 = new Poster(31, "First", "Action");
    Poster movie2 = new Poster(32, "Second", "Adventure");
    Poster movie3 = new Poster(33, "Third", "Drama");
    Poster movie4 = new Poster(34, "Fourth", "Comedy");
    Poster movie5 = new Poster(35, "Fifth", "Tragedy");
    Poster movie6 = new Poster(36, "Sixth", "Children");
    Poster movie7 = new Poster(37, "Seventh", "Thriller");
    Poster movie8 = new Poster(38, "Eighth", "Adventure");
    Poster movie9 = new Poster(39, "Ninth", "Comedy");
    Poster movie10 = new Poster(40, "Tenth", "Drama");
    Poster movie11 = new Poster(41, "Eleventh", "Action");
    Poster movie12 = new Poster(42, "Twelfth", "Fantasy");
    Poster movie13 = new Poster(43, "Thirteenth", "Horror");
    Poster movie14 = new Poster(44, "Fourteenth", "Mystic");
    Poster movie15 = new Poster(45, "Fifteenth", "Western");
    Poster movie16 = new Poster(46, "Sixteenth", "Adventure");
    Poster movie17 = new Poster(47, "Seventeenth", "Music");
    Poster movie18 = new Poster(48, "Eighteenth", "Children");
    Poster movie19 = new Poster(49, "Nineteenth", "Melodrama");
    Poster movie20 = new Poster(50, "Twentieth", "Comedy");

    @Test
    public void shouldAddMoviesAndFindAll() {
        manager.add(movie1);
        manager.add(movie2);
        manager.add(movie3);
        manager.add(movie20);
        Poster[] expected = {movie1, movie2, movie3, movie20};
        Poster[] actual = manager.findAll();
        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldNoMoviesAdd() {
        Poster[] expected = {};
        Poster[] actual = manager.getMovies();
        assertArrayEquals(expected, actual);
    }

    public void prepare() {
        manager.add(movie1);
        manager.add(movie2);
        manager.add(movie3);
        manager.add(movie4);
        manager.add(movie5);
        manager.add(movie6);
        manager.add(movie7);
        manager.add(movie8);
        manager.add(movie9);
        manager.add(movie10);
        manager.add(movie11);
        manager.add(movie12);
        manager.add(movie13);
        manager.add(movie14);
        manager.add(movie15);
        manager.add(movie16);
        manager.add(movie17);
        manager.add(movie18);
        manager.add(movie19);
        manager.add(movie20);
    }

    @Test
    public void shouldFindLastMoviesAsDefault() {

        prepare();
        Poster[] actual = manager.findLast();
        Poster[] expected = {movie20, movie19, movie18, movie17, movie16, movie15, movie14, movie13, movie12, movie11};
        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindLastMoviesWithLimitUnderDefault() {

        MovieManager manager = new MovieManager(5);
        manager.add(movie1);
        manager.add(movie2);
        manager.add(movie3);
        manager.add(movie4);
        manager.add(movie5);
        manager.add(movie6);
        manager.add(movie7);
        manager.add(movie8);
        manager.add(movie9);
        manager.add(movie10);
        manager.add(movie11);
        manager.add(movie12);
        manager.add(movie13);
        manager.add(movie14);
        manager.add(movie15);
        manager.add(movie16);
        manager.add(movie17);
        manager.add(movie18);
        manager.add(movie19);
        manager.add(movie20);
        Poster[] actual = manager.findLast();
        Poster[] expected = {movie20, movie19, movie18, movie17, movie16};
        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindLastMoviesWithLimitAboveDefault() {
        MovieManager manager = new MovieManager(13);
        manager.add(movie1);
        manager.add(movie2);
        manager.add(movie3);
        manager.add(movie4);
        manager.add(movie5);
        manager.add(movie6);
        manager.add(movie7);
        manager.add(movie8);
        manager.add(movie9);
        manager.add(movie10);
        manager.add(movie11);
        manager.add(movie12);
        manager.add(movie13);
        manager.add(movie14);
        manager.add(movie15);
        manager.add(movie16);
        manager.add(movie17);
        manager.add(movie18);
        manager.add(movie19);
        manager.add(movie20);
        Poster[] actual = manager.findLast();
        Poster[] expected = {movie20, movie19, movie18, movie17, movie16, movie15, movie14, movie13, movie12, movie11, movie10, movie9, movie8};
        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindLastMoviesWithLimitEqualsNull() {
        MovieManager manager = new MovieManager(0);
        manager.add(movie1);
        manager.add(movie2);
        manager.add(movie3);
        manager.add(movie4);
        manager.add(movie5);
        manager.add(movie6);
        manager.add(movie7);
        manager.add(movie8);
        manager.add(movie9);
        manager.add(movie10);
        manager.add(movie11);
        manager.add(movie12);
        manager.add(movie13);
        manager.add(movie14);
        manager.add(movie15);
        manager.add(movie16);
        manager.add(movie17);
        manager.add(movie18);
        manager.add(movie19);
        manager.add(movie20);
        Poster[] actual = manager.findLast();
        Poster[] expected = {};
        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindLastMoviesIfLimitMoreMovies() {
        MovieManager manager = new MovieManager(30);
        manager.add(movie1);
        manager.add(movie2);
        manager.add(movie3);
        manager.add(movie4);
        manager.add(movie5);
        manager.add(movie6);
        manager.add(movie7);
        manager.add(movie8);
        manager.add(movie9);
        manager.add(movie10);
        manager.add(movie11);
        manager.add(movie12);
        manager.add(movie13);
        manager.add(movie14);
        manager.add(movie15);
        manager.add(movie16);
        manager.add(movie17);
        manager.add(movie18);
        manager.add(movie19);
        manager.add(movie20);
        Poster[] actual = manager.findLast();
        Poster[] expected = {movie20, movie19, movie18, movie17, movie16, movie15, movie14, movie13, movie12, movie11, movie10,
                movie9, movie8, movie7, movie6, movie5, movie4, movie3, movie2, movie1};
        assertArrayEquals(expected, actual);
    }

}
