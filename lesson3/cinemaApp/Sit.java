package com.oprotsen.JavaOOP.lesson3.cinemaApp;

public class Sit {
    private final int row;
    private final int place;
    private boolean isReservedSit;

    public Sit(int row, int place) {
        this.row = row;
        this.place = place;

    }

    public Sit(int row, int place, boolean isReservedSit) {
        this.row = row;
        this.place = place;
        this.isReservedSit = isReservedSit;
    }

    public int getRow() {
        return row;
    }

    public int getPlace() {
        return place;
    }

    public boolean isReservedSit() {
        return isReservedSit;
    }

    @Override
    public String toString() {
        return "Sit{" +
                "row=" + row +
                ", place=" + place +
                '}';
    }
}
