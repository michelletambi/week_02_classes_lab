package org.example.classes;

import static java.lang.Math.sqrt;

public class Rectangle {

    private float length;
    private float width;

    //constructor
    public Rectangle(float length, float width) {
        this.length = length;
        this.width = width;
    }

    //behaviours

    public float getLength() {
        return length;
    }

    public float getWidth() {
        return width;
    }

    public double getArea() {
        return length * width;
    }

    public double getPerimeter() {
        return 2 * (length + width);
    }

    public double getDiagonal() {
        return sqrt (length*length + width*width);
    }
}
