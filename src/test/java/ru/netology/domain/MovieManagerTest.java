package ru.netology.domain;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class MovieManagerTest {

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
        MovieManager manager = new MovieManager();
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
        MovieManager manager = new MovieManager();
        MovieManager[] expected = new MovieManager[0];
        MovieManager[] actual = manager.findAll();
        assertArrayEquals(expected, actual);
    }

//    @BeforeEach
//    public void prepare() {
//        MovieManager movies = new MovieManager();
//        movies.add(movie1);
//        movies.add(movie2);
//        movies.add(movie3);
//        movies.add(movie4);
//        movies.add(movie5);
//        movies.add(movie6);
//        movies.add(movie7);
//        movies.add(movie8);
//        movies.add(movie9);
//        movies.add(movie10);
//        movies.add(movie11);
//        movies.add(movie12);
//        movies.add(movie13);
//        movies.add(movie14);
//        movies.add(movie15);
//        movies.add(movie16);
//        movies.add(movie17);
//        movies.add(movie18);
//        movies.add(movie19);
//        movies.add(movie20);
//    }

    @Test
    public void shouldFindLastMoviesAsDefault() {
        MovieManager movies = new MovieManager();
        movies.add(movie1);
        movies.add(movie2);
        movies.add(movie3);
        movies.add(movie4);
        movies.add(movie5);
        movies.add(movie6);
        movies.add(movie7);
        movies.add(movie8);
        movies.add(movie9);
        movies.add(movie10);
        movies.add(movie11);
        movies.add(movie12);
        movies.add(movie13);
        movies.add(movie14);
        movies.add(movie15);
        movies.add(movie16);
        movies.add(movie17);
        movies.add(movie18);
        movies.add(movie19);
        movies.add(movie20);

        MovieManager[] actual = movies.findLast();
        MovieManager[] expected = {movie20, movie19, movie18, movie17, movie16, movie15, movie14, movie13, movie12, movie11};
        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindLastMoviesWithLimitUnderDefault() {
        MovieManager movies = new MovieManager(5);
        movies.add(movie1);
        movies.add(movie2);
        movies.add(movie3);
        movies.add(movie4);
        movies.add(movie5);
        movies.add(movie6);
        movies.add(movie7);
        movies.add(movie8);
        movies.add(movie9);
        movies.add(movie10);
        movies.add(movie11);
        movies.add(movie12);
        movies.add(movie13);
        movies.add(movie14);
        movies.add(movie15);
        movies.add(movie16);
        movies.add(movie17);
        movies.add(movie18);
        movies.add(movie19);
        movies.add(movie20);

        MovieManager[] actual = movies.findLast();
        MovieManager[] expected = {movie20, movie19, movie18, movie17, movie16};

        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindLastMoviesWithLimitAboveDefault() {
        MovieManager movies = new MovieManager(13);
        movies.add(movie1);
        movies.add(movie2);
        movies.add(movie3);
        movies.add(movie4);
        movies.add(movie5);
        movies.add(movie6);
        movies.add(movie7);
        movies.add(movie8);
        movies.add(movie9);
        movies.add(movie10);
        movies.add(movie11);
        movies.add(movie12);
        movies.add(movie13);
        movies.add(movie14);
        movies.add(movie15);
        movies.add(movie16);
        movies.add(movie17);
        movies.add(movie18);
        movies.add(movie19);
        movies.add(movie20);

        MovieManager[] actual = movies.findLast();
        MovieManager[] expected = {movie20, movie19, movie18, movie17, movie16, movie15, movie14, movie13, movie12, movie11, movie10, movie9, movie8};

        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindLastMoviesWithLimitEqualsNull() {
        MovieManager movies = new MovieManager(0);
        movies.add(movie1);
        movies.add(movie2);
        movies.add(movie3);
        movies.add(movie4);
        movies.add(movie5);
        movies.add(movie6);
        movies.add(movie7);
        movies.add(movie8);
        movies.add(movie9);
        movies.add(movie10);
        movies.add(movie11);
        movies.add(movie12);
        movies.add(movie13);
        movies.add(movie14);
        movies.add(movie15);
        movies.add(movie16);
        movies.add(movie17);
        movies.add(movie18);
        movies.add(movie19);
        movies.add(movie20);

        MovieManager[] actual = movies.findLast();
        MovieManager[] expected = new MovieManager[0];

        assertArrayEquals(expected, actual);
    }
}
