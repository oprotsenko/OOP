package com.oprotsen.JavaOOP.lesson9.movieYearFinder;

public class Movie {
    private final String name;
    private final int releaseYear;
    private final Genre genre;

    public Movie(String name, int releaseYear, Genre genre) {
        this.name = name;
        this.releaseYear = releaseYear;
        this.genre = genre;
    }

    public String getName() {
        return name;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public Genre getGenre() {
        return genre;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "name='" + name + '\'' +
                ", releaseYear=" + releaseYear +
                ", genre=" + genre +
                '}';
    }
}
