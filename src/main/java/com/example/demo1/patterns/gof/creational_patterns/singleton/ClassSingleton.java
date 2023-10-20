package com.example.demo1.patterns.gof.creational_patterns.singleton;

import lombok.Getter;
import lombok.Setter;

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
