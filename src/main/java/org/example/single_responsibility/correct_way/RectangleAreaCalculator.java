package org.example.single_responsibility.correct_way;

public class RectangleAreaCalculator {
    private static final double INCH_TERM = 0.254;

    private final int width;
    private final int height;

    public RectangleAreaCalculator(int width, int height) {
        this.width = width;
        this.height = height;
    }
    public int area() {
        return height * width;
    }
}
