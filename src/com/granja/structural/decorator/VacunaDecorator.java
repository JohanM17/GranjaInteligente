package com.granja.structural.decorator;

import com.granja.model.Animal;

public class VacunaDecorator extends AnimalDecorator {
    public VacunaDecorator(Animal animalDecorado) {
        super(animalDecorado);
    }

    @Override
    public void emitirSonido() {
        super.emitirSonido();
        aplicarVacuna();
    }

    private void aplicarVacuna() {
        System.out.println("💉 Vacuna aplicada correctamente.");
    }
}