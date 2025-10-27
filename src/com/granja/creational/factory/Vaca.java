package com.granja.creational.factory;

import com.granja.model.Animal;

public class Vaca extends Animal {
    @Override
    public void emitirSonido() {
        System.out.println("🐄 La vaca hace: ¡Muuu!");
    }
}
