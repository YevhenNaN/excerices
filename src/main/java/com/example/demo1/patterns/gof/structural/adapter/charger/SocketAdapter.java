package com.example.demo1.patterns.gof.structural.adapter.charger;

/**
 * Adapter is a structural design pattern that allows objects with incompatible interfaces to collaborate.
 *  Use the Adapter class when you want to use some existing class, but its interface isn’t compatible with the rest of your code.
 *  Use the pattern when you want to reuse several existing subclasses that lack some common functionality that can’t be added to the superclass.
 */
public interface SocketAdapter {

    public Volt get120Volt();

    public Volt get12Volt();

    public Volt get3Volt();
}
