package com.example.demo1.patterns.gof.creational_patterns.factory_method;

public class CarFactory extends MotorVehicleFactory {
    @Override
    protected MotorVehicle createMotorVehicle() {
        return new Car();
    }
}
