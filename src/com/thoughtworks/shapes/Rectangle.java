package com.thoughtworks.shapes;

/*
 Rectangle class returns area of a rectangle
 */

public class Rectangle {

    private double width;
    private double length;

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public double area() {
        return width * length;
    }
}
