package com.example.demo1.patterns.gof.structural.composite;

/**
 * Base Component - Base component is the interface for all objects in the composition,
 * client program uses base component to work with the objects in the composition.
 * It can be an interface or an abstract class with some methods common to all the objects.
 * Leaf - Defines the behaviour for the elements in the composition. It is the building block for the
 * composition and implements base component. It doesn’t have references to other Components.
 * Composite - It consists of leaf elements and implements the operations in base component.
 */
public interface Shape {

    public void draw(String fillColor);
}
