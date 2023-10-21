package com.example.demo1.patterns.gof.creational.factory_method;

public class Car implements MotorVehicle {
    @Override
    public void build() {
        System.out.println("Build Car");
    }
}
