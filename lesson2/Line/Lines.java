package com.oprotsen.JavaOOP.lesson2.Line;

import java.util.ArrayList;

public class Lines {
    private final ArrayList<Line> lines = new ArrayList<>();

    public void addLine(Line line) {
        lines.add(line);
    }

    public void sumOfLongs() {
        double sumOfLongs = 0;
        for (Line elem: lines) {
            sumOfLongs += elem.findLongOfLine();
        }
        System.out.println("Sum of line's longs = " + sumOfLongs);
    }

    public void longestLine() {
        double longest = 0;
        Line longestLine = null;
        for (Line elem: lines) {
            if (longest < elem.findLongOfLine()) {
                longest = elem.findLongOfLine();
                longestLine = elem;
            }
        }
        System.out.println("The longest line is: " + longestLine);
    }

    @Override
    public String toString() {
        return "lines = " + lines;
    }
}
