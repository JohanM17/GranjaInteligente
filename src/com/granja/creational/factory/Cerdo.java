package com.granja.creational.factory;

import com.granja.model.Animal;

public class Cerdo extends Animal {
    @Override
    public void emitirSonido() {
        System.out.println("🐷 El cerdo hace: ¡Oink oink!");
    }
}
