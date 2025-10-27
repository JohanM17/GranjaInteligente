package com.granja.creational.abstractfactory;

import com.granja.model.Animal;
import com.granja.creational.factory.Vaca;

public class LecheFactory implements AbstractFactory {
    @Override
    public Animal crearAnimal() {
        System.out.println("🧈 Fábrica de leche: creando vaca lechera...");
        return new Vaca();
    }
}
