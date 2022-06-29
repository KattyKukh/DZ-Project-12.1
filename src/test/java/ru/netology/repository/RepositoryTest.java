package ru.netology.repository;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import ru.netology.domain.Poster;


public class RepositoryTest {

    Repository repo = new Repository();

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

    public void setup() {
        repo.save(movie1);
        repo.save(movie2);
        repo.save(movie3);
        repo.save(movie4);
        repo.save(movie5);
        repo.save(movie6);
        repo.save(movie7);
        repo.save(movie8);
        repo.save(movie9);
        repo.save(movie10);
        repo.save(movie11);
        repo.save(movie12);
        repo.save(movie13);
        repo.save(movie14);
        repo.save(movie15);
        repo.save(movie16);
        repo.save(movie17);
        repo.save(movie18);
        repo.save(movie19);
        repo.save(movie20);
    }

    @Test
    public void shouldSaveMovie() {
        repo.save(movie1);
        repo.save(movie2);
        repo.save(movie3);
        repo.save(movie14);
        Poster[] expected = {movie1, movie2, movie3, movie14};
        Poster[] actual = repo.findAll();
        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldSaveNoMovie() {
        Poster[] expected = new Poster[0];
        Poster[] actual = repo.findAll();
        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindById() {
        setup();
        Poster[] expected = {movie13};
        Poster[] actual = repo.findById(43);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldNullIfFindByNotExistingId() {
        setup();
        Poster[] expected = new Poster[0];
        Poster[] actual = repo.findById(2);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldRemoveById() {
        setup();

        Poster[] expected = {movie1, movie2, movie3, movie4, movie5, movie6, movie7, movie9, movie10,
                movie11, movie12, movie13, movie14, movie15, movie16, movie17, movie18, movie19, movie20};
        Poster[] actual = repo.removeById(38);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldReturnOriginalArrayWhenRemoveByNotExistingId() {
        setup();
        Poster[] expected = repo.getMovies();
        Poster[] actual = repo.removeById(53);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldRemoveAll() {
        setup();
        Poster[] expected = new Poster[0];
        Poster[] actual = repo.removeAll();
        assertArrayEquals(expected, actual);
    }
}
