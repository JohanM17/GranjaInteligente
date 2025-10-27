package com.granja.structural.decorator;

import com.granja.model.Animal;

public abstract class AnimalDecorator extends Animal {
    protected Animal animalDecorado;

    public AnimalDecorator(Animal animalDecorado) {
        this.animalDecorado = animalDecorado;
    }

    @Override
    public void emitirSonido() {
        animalDecorado.emitirSonido();
    }
}