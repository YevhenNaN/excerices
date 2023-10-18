package com.example.demo1.patterns.gof.abstract_factory;

/*
When to Use Abstract Factory Pattern:
The client is independent of how we create and compose the objects in the system
The system consists of multiple families of objects, and these families are designed to be used together
We need a run-time value to construct a particular dependency
While the pattern is great when creating predefined objects, adding the new ones might be challenging.
To support the new type of objects will require changing the AbstractFactory class and all of its subclasses.
 */
public class AnimalAbstractFactory {
    Animal animal;

    public void createAnimal(AnimalType type, AnimalEra era) {
        switch (era) {
            case MESOZOIC -> animal = new MesozoicAnimalFactory().createAnimal(type);
            case CENOZOIC -> animal = new CenozoicAnimalFactory().createAnimal(type);
        }
    }

}
