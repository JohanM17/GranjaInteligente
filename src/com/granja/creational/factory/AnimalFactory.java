package com.granja.creational.factory;

import com.granja.model.Animal;
import com.granja.creational.factory.Vaca;
import com.granja.creational.factory.Cerdo;
import com.granja.creational.factory.Gallina;

public class AnimalFactory {

    public static Animal crearAnimal(String tipo) {
        switch (tipo.toLowerCase()) {
            case "vaca":
                return new Vaca();
            case "cerdo":
                return new Cerdo();
            case "gallina":
                return new Gallina();
            default:
                System.out.println("Tipo de animal desconocido: " + tipo);
                return null;
        }
    }
}

