package com.oprotsen.JavaOOP.lesson2.Rectangle;

public class Rectangle {
    private final int width;
    private final int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public int findSquare() {
        return width * height;
    }

    public int findPerimeter(int width, int height) {
        return (width + height) * 2;
    }

    @Override
    public String toString() {
        return "width= " + width + ", height= " + height;
    }

}
