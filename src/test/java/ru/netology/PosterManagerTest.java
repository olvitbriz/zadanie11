package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PosterManagerTest {
    @Test

    public void testOneFilm() {
        PosterManager manager = new PosterManager();
        manager.add("film 1");
        String[] expected = {"film 1"};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);

    }

    @Test

    public void testFiveFilms() {
        PosterManager manager = new PosterManager();
        manager.add("film 1");
        manager.add("film 2");
        manager.add("film 3");
        manager.add("film 4");
        manager.add("film 5");
        String[] expected = {"film 1", "film 2", "film 3", "film 4", "film 5"};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);

    }

    @Test

    public void testLastTenFilmFromOne() {
        PosterManager manager = new PosterManager();
        manager.add("film 1");
        String[] expected = {"film 1"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);

    }

    @Test

    public void testLastTenFilmFromNine() {
        PosterManager manager = new PosterManager();
        manager.add("film 1");
        manager.add("film 2");
        manager.add("film 3");
        manager.add("film 4");
        manager.add("film 5");
        manager.add("film 6");
        manager.add("film 7");
        manager.add("film 8");
        manager.add("film 9");
        String[] expected = {"film 9", "film 8", "film 7", "film 6", "film 5", "film 4", "film 3", "film 2", "film 1"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);

    }

    @Test

    public void testLastTenFilmFromTen() {
        PosterManager manager = new PosterManager();
        manager.add("film 1");
        manager.add("film 2");
        manager.add("film 3");
        manager.add("film 4");
        manager.add("film 5");
        manager.add("film 6");
        manager.add("film 7");
        manager.add("film 8");
        manager.add("film 9");
        manager.add("film 10");
        String[] expected = {"film 10", "film 9", "film 8", "film 7", "film 6", "film 5", "film 4", "film 3", "film 2", "film 1"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);

    }

    @Test

    public void testLastTenFilmFromEleven() {
        PosterManager manager = new PosterManager();
        manager.add("film 1");
        manager.add("film 2");
        manager.add("film 3");
        manager.add("film 4");
        manager.add("film 5");
        manager.add("film 6");
        manager.add("film 7");
        manager.add("film 8");
        manager.add("film 9");
        manager.add("film 10");
        manager.add("film 11");
        String[] expected = {"film 11", "film 10", "film 9", "film 8", "film 7", "film 6", "film 5", "film 4", "film 3", "film 2"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);

    }

    @Test

    public void testLastFiveFilmFromOne() {
        PosterManager manager = new PosterManager(5);
        manager.add("film 1");
        String[] expected = {"film 1"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void testLastFiveFilmFromNine() {
        PosterManager manager = new PosterManager(5);
        manager.add("film 1");
        manager.add("film 2");
        manager.add("film 3");
        manager.add("film 4");
        manager.add("film 5");
        manager.add("film 6");
        manager.add("film 7");
        manager.add("film 8");
        manager.add("film 9");
        String[] expected = {"film 9", "film 8", "film 7", "film 6", "film 5"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);

    }
}
