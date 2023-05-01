package org.example.open_closed.violation;

public class Rectangle implements Shape{
    private final int width;
    private final int height;


    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public double getArea() {
        return width * height;
    }
}
