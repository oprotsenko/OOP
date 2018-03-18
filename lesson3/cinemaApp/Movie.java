package com.oprotsen.JavaOOP.lesson3.cinemaApp;

public class Movie {
    private final String name;
    private final int year;
    private final String timeToPlay;
    private final String description;

    public Movie(String name, int year, String timeToPlay, String description) {
        this.name = name;
        this.year = year;
        this.timeToPlay = timeToPlay;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "name='" + name + '\'' +
                ", year=" + year +
                ", timeToPlay='" + timeToPlay + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
