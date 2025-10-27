package com.granja.creational.factory;

import com.granja.model.Animal;

public class Gallina extends Animal {
    @Override
    public void emitirSonido() {
        System.out.println("🐔 La gallina hace: ¡Cloc cloc!");
    }
}
