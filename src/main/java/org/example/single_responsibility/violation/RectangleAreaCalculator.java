package org.example.single_responsibility.violation;

public class RectangleAreaCalculator {
    private static final double INCH_TERM = 0.0254;

    private final int width;
    private final int height;

    public RectangleAreaCalculator(int width, int height) {
        this.width = width;
        this.height = height;
    }
    public int area() {
        return height * width;
    }

    // this method breaks the single responsibility principle
    public double metersToInches(int area) {
        return area / INCH_TERM;
    }
}
