package com.example.demo1.pattern;

import com.example.demo1.patterns.gof.structural.composite.Circle;
import com.example.demo1.patterns.gof.structural.composite.Drawing;
import com.example.demo1.patterns.gof.structural.composite.Shape;
import com.example.demo1.patterns.gof.structural.composite.Triangle;

public class TestCompositePattern {

    public static void main(String[] args) {
        Shape tri = new Triangle();
        Shape tri1 = new Triangle();
        Shape cir = new Circle();

        Drawing drawing = new Drawing();
        drawing.add(tri1);
        drawing.add(tri1);
        drawing.add(cir);

        drawing.draw("Red");

        drawing.clear();

        drawing.add(tri);
        drawing.add(cir);
        drawing.draw("Green");
    }

}
