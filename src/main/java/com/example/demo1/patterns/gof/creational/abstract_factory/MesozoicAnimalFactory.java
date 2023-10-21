package com.example.demo1.patterns.gof.creational.abstract_factory;

public class MesozoicAnimalFactory implements EraAnimalFactory {
    @Override
    public LandAnimal makeLandAnimal() {
        return new LandAnimal(AnimalEra.MESOZOIC, "Tyrannosaurus Rex");
    }

    @Override
    public SkyAnimal makeSkyAnimal() {
        return new SkyAnimal(AnimalEra.MESOZOIC, "Pterodactylus");
    }

    Animal createAnimal(AnimalType type) {
        return switch (type) {
            case LAND -> makeLandAnimal();
            case SKY -> makeSkyAnimal();
        };
    }

}
