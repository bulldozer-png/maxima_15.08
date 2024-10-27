package ru.maxima.model;

import java.util.List;

public class Zoo {
    private final List<Animal> animals;

    public Zoo(List<Animal> animals) {
        this.animals = animals;
    }

    public void showAnimalInfo() {
        animals.forEach(animal ->
                System.out.printf(
                        "Кличка: %s, возраст: %d.%n",
                        animal.getName(), animal.getAge()));

    }

}
