package org.example.open_closed.correct_way;

import java.util.List;

public class Areacalculator {
    private final List<Shape> shapes;

    public Areacalculator(List<Shape> shapes) {
        this.shapes = shapes;
    }

    public double sum () {
        int sum = 0;

        for (Shape shape: shapes) {
            sum += shape.area();
        }
        return sum;
    }
}
