package com.granja.creational.abstractfactory;

import com.granja.model.Animal;
import com.granja.creational.factory.Cerdo;

public class CarneFactory implements AbstractFactory {
    @Override
    public Animal crearAnimal() {
        System.out.println("🥩 Fábrica de carne: creando cerdo para producción de carne...");
        return new Cerdo();
    }
}