package com.oprotsen.JavaOOP.lesson3.cinemaApp;

public class MovieSession {
    private final Movie movie;
    private final HallForSession hallForSession;
    private final int price;
    private final int timeToPlay;

    public MovieSession(Movie movie, HallForSession hallForSession, int price, int timeToPlay) {
        this.movie = movie;
        this.hallForSession = hallForSession;
        this.price = price;
        this.timeToPlay = timeToPlay;
    }

    public void sessionCost() {
        int sessionCost = hallForSession.countReservedSits() * price;
        System.out.println("Session cost = " + sessionCost);
    }

    @Override
    public String toString() {
        return "MovieSession{" +
                "movie=" + movie +
                ", hallForSession=" + hallForSession +
                ", price=" + price +
                ", timeToPlay=" + timeToPlay +
                '}';
    }
}
