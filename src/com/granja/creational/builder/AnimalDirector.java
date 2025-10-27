package com.granja.creational.builder;

import com.granja.model.Animal;

public class AnimalDirector {
    private AnimalBuilder builder;

    public AnimalDirector(AnimalBuilder builder) {
        this.builder = builder;
    }

    public Animal construirAnimalBasico() {
        return builder.setNombre("Animal genérico")
                .setTipo("Desconocido")
                .setEdad(1)
                .build();
    }

    public Animal construirVaca() {
        return builder.setNombre("Lola")
                .setTipo("Vaca")
                .setEdad(3)
                .build();
    }
}
