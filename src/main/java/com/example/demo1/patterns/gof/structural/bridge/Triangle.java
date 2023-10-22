package com.example.demo1.patterns.gof.structural.bridge;

public class Triangle extends Shape {

    public Triangle(Color color) {
        super(color);
    }

    @Override
    public String draw() {
        return "Triangle drawn. " + color.fill();
    }
}
