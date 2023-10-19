package com.example.demo1.patterns.gof.creational_patterns.factory_method;


// Factory Method is a creational design pattern that provides an interface for creating objects in a superclass,
// but allows subclasses to alter the type of objects that will be created.
public abstract class MotorVehicleFactory {
    public MotorVehicle create() {
        MotorVehicle vehicle = createMotorVehicle();
        vehicle.build();
        return vehicle;
    }
    protected abstract MotorVehicle createMotorVehicle();
}
