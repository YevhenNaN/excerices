package com.example.demo1.pattern;

import com.example.demo1.patterns.gof.structural.bridge.Blue;
import com.example.demo1.patterns.gof.structural.bridge.Red;
import com.example.demo1.patterns.gof.structural.bridge.Shape;
import com.example.demo1.patterns.gof.structural.bridge.Square;
import com.example.demo1.patterns.gof.structural.bridge.Triangle;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ShapeTest {

    @Test
    void whenBridgePatternInvoked_thenConfigSuccess() {
        //a square with red color
        Shape square = new Square(new Red());
        Shape triangle = new Triangle(new Blue());

        assertEquals("Triangle drawn. Color is Blue", triangle.draw());
        assertEquals("Square drawn. Color is Red", square.draw());
    }



}
