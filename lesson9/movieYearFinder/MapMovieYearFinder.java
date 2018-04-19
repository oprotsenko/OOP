package com.oprotsen.JavaOOP.lesson9.movieYearFinder;

import java.util.*;

public class MapMovieYearFinder implements MovieYearFinder {

    private final Map<Integer, List<Movie>> movieMap = new TreeMap<>();

    @Override
    public void add(Movie movie) {
        if (!movieMap.containsKey(movie.getReleaseYear())) {
            List<Movie> movieArray = new ArrayList<>();
            movieArray.add(movie);
            movieMap.put(movie.getReleaseYear(), movieArray);
        } else {
            List<Movie> movieArray = movieMap.get(movie.getReleaseYear());
            movieArray.add(movie);
            movieMap.replace(movie.getReleaseYear(), movieArray);
        }
    }

    @Override
    public List<Movie> findByReleaseYear(int releaseYear) {
        if (movieMap.get(releaseYear) == null) {
            List<Movie> emptyList = new ArrayList<>();
            return emptyList;
        }
        return movieMap.get(releaseYear);
    }

    @Override
    public List<Movie> findByReleaseYears(int minReleaseYear, int maxReleaseYear) {
        List<Movie> moviesBetween = new ArrayList<>();
        for (Integer year : movieMap.keySet()) {
            if (year >= minReleaseYear && year <= maxReleaseYear) {
                for (int i = 0; i < movieMap.get(year).size(); i++) {
                    moviesBetween.add(movieMap.get(year).get(i));
                }
            }

        }
        return moviesBetween;
    }

    @Override
    public String toString() {
        return "MapMovieYearFinder{" +
                "movieMap=" + movieMap +
                '}';
    }
}
