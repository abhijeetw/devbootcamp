package com.thoughtworks.shapes;

/**
 * Sqaure class returns area of a square
 */
public class Square {

    private double width;

    public Square(double width) {
        this.width = width;
    }

    public double area() {
        return width * width;
    }
}
