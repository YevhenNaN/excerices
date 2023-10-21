package com.example.demo1.patterns.gof.creational.singleton;

import lombok.Getter;
import lombok.Setter;

/**
 * Singleton pattern restricts the instantiation of a class and ensures that only one instance of the class exists in the Java Virtual Machine.
 * The singleton class must provide a global access point to get the instance of the class.
 * Singleton pattern is used for logging, drivers objects, caching, and thread pool.
 * Singleton design pattern is also used in other design patterns like Abstract Factory, Builder, Prototype, Facade, etc.
 * Singleton design pattern is used in core Java classes also (for example, java.lang.Runtime,
 */
@Getter
@Setter
public final class ClassSingleton {

    private static ClassSingleton INSTANCE;
    private String info = "Initial info class";

    private ClassSingleton() {
    }

    public static ClassSingleton getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new ClassSingleton();
        }

        return INSTANCE;
    }

    // getters and setters
}
