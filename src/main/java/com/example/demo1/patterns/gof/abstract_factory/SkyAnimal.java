package com.example.demo1.patterns.gof.abstract_factory;

public class SkyAnimal extends Animal{

    SkyAnimal(AnimalEra era, String name) {
        super(AnimalType.SKY, era, name);
        create();
    }
    @Override
    void create() {
        System.out.println("Creating a " + type + " animal: " + name);
    }
}
