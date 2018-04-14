package com.oprotsen.JavaOOP.lesson2.Rectangle;

public class RectangleRunner {
    public static void main(String[] args) {
        Rectangles rectangles = new Rectangles();
        Rectangle rect1 = new Rectangle(2,4);
        rectangles.addRectangle(rect1);

        Rectangle rect2 = new Rectangle(6,8);
        rectangles.addRectangle(rect2);

        Rectangle rect3 = new Rectangle(5,5);
        rectangles.addRectangle(rect3);

        System.out.println(rectangles.toPrint());
        rectangles.sumOfSquares();
    }
}
