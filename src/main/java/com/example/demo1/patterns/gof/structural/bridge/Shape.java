package com.example.demo1.patterns.gof.structural.bridge;

import lombok.AllArgsConstructor;

/**
 * Bridge is a structural design pattern that lets you split a large class or a set of closely related classes into
 * two separate hierarchies—abstraction and implementation—which can be developed independently of each other.
 * Bridge design pattern can be used when both abstraction and implementation can have different
 * hierarchies independently and we want to hide the implementation from the client application.
 * The implementation of bridge design pattern follows the notion to prefer Composition over inheritance.
 */
@AllArgsConstructor
public abstract class Shape {
    protected Color color;

    public abstract String draw();
}
