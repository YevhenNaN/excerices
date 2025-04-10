package com.example.demo1.model;

interface Vehicle {
    void start();

    void stop();

    default void honk() {
        System.out.println("Honk honk!");
    }
}
