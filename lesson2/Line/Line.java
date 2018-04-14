package com.oprotsen.JavaOOP.lesson2.Line;

public class Line {
    private final Point start;
    private final Point finish;

    public Line(Point start, Point finish) {
        this.start = start;
        this.finish = finish;
    }

    public double findLongOfLine() {
        return Math.sqrt(Math.pow(finish.getX() - start.getX(), 2) + Math.pow(finish.getY() - start.getY(), 2));
    }

    @Override
    public String toString() {
        return '\n' + "Line start = " + start + ", Line finish = " + finish;
    }
}
