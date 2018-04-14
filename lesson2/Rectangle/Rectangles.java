package com.oprotsen.JavaOOP.lesson2.Rectangle;

import java.util.ArrayList;

public class Rectangles {
    private final ArrayList<Rectangle> rectangles = new ArrayList<>();

    public void addRectangle(Rectangle rectangle) {
        rectangles.add(rectangle);
    }

    public void sumOfSquares() {
        int sum = 0;
       for (Rectangle elem: rectangles) {
           sum += elem.findSquare();
       }
        System.out.println("Sum of squares = " + sum);
    }

    public String toPrint() {
        return "rectangles=" + rectangles;
    }
}
