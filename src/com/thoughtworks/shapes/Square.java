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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Square square = (Square) o;

        return Double.compare(square.width, width) == 0;

    }

    @Override
    public int hashCode() {
        long temp = Double.doubleToLongBits(width);
        return (int) (temp ^ (temp >>> 32));
    }
}
