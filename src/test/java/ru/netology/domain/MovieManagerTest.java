package ru.netology.domain;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MovieManagerTest {
    MovieManager manager = new MovieManager();

    MovieManager movie1 = new MovieManager(31, "First", "Action");
    MovieManager movie2 = new MovieManager(32, "Second", "Adventure");
    MovieManager movie3 = new MovieManager(33, "Third", "Drama");
    MovieManager movie4 = new MovieManager(34, "Fourth", "Comedy");
    MovieManager movie5 = new MovieManager(35, "Fifth", "Tragedy");
    MovieManager movie6 = new MovieManager(36, "Sixth", "Children");
    MovieManager movie7 = new MovieManager(37, "Seventh", "Thriller");
    MovieManager movie8 = new MovieManager(38, "Eighth", "Adventure");
    MovieManager movie9 = new MovieManager(39, "Ninth", "Comedy");
    MovieManager movie10 = new MovieManager(40, "Tenth", "Drama");
    MovieManager movie11 = new MovieManager(41, "Eleventh", "Action");
    MovieManager movie12 = new MovieManager(42, "Twelfth", "Fantasy");
    MovieManager movie13 = new MovieManager(43, "Thirteenth", "Horror");
    MovieManager movie14 = new MovieManager(44, "Fourteenth", "Mystic");
    MovieManager movie15 = new MovieManager(45, "Fifteenth", "Western");
    MovieManager movie16 = new MovieManager(46, "Sixteenth", "Adventure");
    MovieManager movie17 = new MovieManager(47, "Seventeenth", "Music");
    MovieManager movie18 = new MovieManager(48, "Eighteenth", "Children");
    MovieManager movie19 = new MovieManager(49, "Nineteenth", "Melodrama");
    MovieManager movie20 = new MovieManager(50, "Twentieth", "Comedy");

    @Test
    public void shouldAddMovies() {

        manager.add(movie1);
        manager.add(movie2);
        manager.add(movie3);
        manager.add(movie20);
        MovieManager[] expected = {movie1, movie2, movie3, movie20};
        MovieManager[] actual = manager.findAll();
        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldNoMoviesAdd() {
        MovieManager[] expected = new MovieManager[0];
        MovieManager[] actual = manager.findAll();
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
        MovieManager[] actual = manager.findLast();
        MovieManager[] expected = {movie20, movie19, movie18, movie17, movie16, movie15, movie14, movie13, movie12, movie11};
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
        MovieManager[] actual = manager.findLast();
        MovieManager[] expected = {movie20, movie19, movie18, movie17, movie16};
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

        MovieManager[] actual = manager.findLast();
        MovieManager[] expected = {movie20, movie19, movie18, movie17, movie16, movie15, movie14, movie13, movie12, movie11, movie10, movie9, movie8};
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

        MovieManager[] actual = manager.findLast();
        MovieManager[] expected = new MovieManager[0];
        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindLastMoviesIfLimitMoreMovies() {
        MovieManager manager = new MovieManager(7);
        manager.add(movie1);
        manager.add(movie2);
        manager.add(movie3);

        MovieManager[] actual = manager.findLast();
        MovieManager[] expected = {movie3, movie2, movie1};
        assertArrayEquals(expected, actual);
    }

}
