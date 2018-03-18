package com.oprotsen.JavaOOP.lesson3.cinemaApp;

public class CinemaRunner {
    public static void main(String[] args) {
        Movie tombRaider = new Movie(
                "Tomb raider", 2018, "18:30",
                "Лара Крофт — весьма самостоятельная дочь эксцентричного искателя приключений, который пропал, едва она стала подростком.");
        HallForSession green = new HallForSession("Green");
        MovieSession session1 = new MovieSession(tombRaider, green, 45, 120);

        green.toReserveSit(new Sit(2,6));
        green.toReserveSit(new Sit(5,4));
        green.toReserveSit(new Sit(5,5));
        green.printHall();
        session1.sessionCost();
    }

}
