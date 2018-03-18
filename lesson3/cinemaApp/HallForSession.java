package com.oprotsen.JavaOOP.lesson3.cinemaApp;

import java.util.Arrays;

public class HallForSession {
    private final String name;
    private final Sit[][] sits;

    public HallForSession(String name) {
        this.name = name;
        sits = new Sit[5][8];
        for (int i = 0; i < sits.length; i++) {
            for (int x = 0; x < sits[i].length; x++) {
                sits[i][x] = new Sit(i + 1, x + 1);
            }
        }
    }

    public String getName() {
        return name;
    }

    public void printHall() {
        System.out.println("                               SCREEN");
        System.out.println("______________________________________________________________________");
        System.out.println();
        System.out.println();
        int i = 1;
        for (Sit[] elem: sits) {
            System.out.print(i++ + " ");
            for (Sit sit: elem) {
                if (sit.isReservedSit() == true)
                    printReserved(sit);
                else
                    System.out.print("free     ");
            }
            System.out.println();
        }
        System.out.println("   1        2        3        4        5        6        7        8");
    }

    public void printReserved(Sit sit) {
        if (sit.isReservedSit())
            System.out.print("RESERVED ");
        }

    public void toReserveSit(Sit sit) {
               for (int i = 0; i < sits.length; i++) {
            for (int x = 0; x < sits[i].length; x++) {
                if (i == sit.getRow() - 1 && x == sit.getPlace() - 1) {
                    sits[i][x] = new Sit(i + 1, x + 1, true);
                }
            }
        }

    }

    public int countReservedSits() {
        int freeSits = 0;
        int reservedSits = 0;
        for (Sit[] row : sits) {
            for (Sit sit : row) {
                if (sit.isReservedSit())
                    reservedSits++;
                else
                    freeSits++;
            }
        }
        System.out.println("RESERVED sits = " + reservedSits);
        System.out.println("FREE sits = " + freeSits);
        return reservedSits;
    }


    @Override
    public String toString() {
        return "HallForSession{" +
                "sits=" + Arrays.toString(sits) +
                '}';
    }
}
