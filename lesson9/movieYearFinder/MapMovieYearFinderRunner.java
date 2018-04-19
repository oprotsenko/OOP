package com.oprotsen.JavaOOP.lesson9.movieYearFinder;

import javax.sound.midi.Soundbank;
import java.util.List;

public class MapMovieYearFinderRunner {
    public static void main(String[] args) {
        MovieYearFinder finder = new MapMovieYearFinder();

        finder.add(new Movie("The Green Mile", 1999, Genre.DRAMA));
        finder.add(new Movie("Pulp Fiction", 1994, Genre.CRIME));
        finder.add(new Movie("The Kid", 1921, Genre.COMEDY));
        finder.add(new Movie("Forrest Gump", 1994, Genre.DRAMA));


        System.out.println("Movies with release year 1994:");
        List<Movie> movies1994 = finder.findByReleaseYear(1994);
        printMovies(movies1994);
        System.out.println();

        System.out.println("Movies with release year 2000:");
        List<Movie> movies2000 = finder.findByReleaseYear(2000);
        printMovies(movies2000);
        System.out.println();

        System.out.println("Movies with release years 1990...2000:");
        List<Movie> movies1990To2000 = finder.findByReleaseYears(1990, 2000);
        printMovies(movies1990To2000);
    }

    private static void printMovies(List<Movie> movies) {
        if (movies.isEmpty()) {
            System.out.println("<list is empty>");
        } else {
            for (Movie movie : movies) {
                System.out.println(movie);
            }
        }
    }
}

// OUTPUT:
//
// Movies with release year 1994:
// Movie{title='Pulp Fiction', releaseYear=1994, genre=CRIME}
// Movie{title='Forrest Gump', releaseYear=1994, genre=DRAMA}
//
// Movies with release year 2000:
// <list is empty>
//
// Movies with release years 1990...2000:
// Movie{title='Pulp Fiction', releaseYear=1994, genre=CRIME}
// Movie{title='Forrest Gump', releaseYear=1994, genre=DRAMA}
// Movie{title='The Green Mile', releaseYear=1999, genre=DRAMA}

