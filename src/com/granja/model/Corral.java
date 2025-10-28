package com.granja.model;

import java.util.ArrayList;
import java.util.List;

public class Corral {
    private String nombre;
    private List<Animal> animales;

    public Corral(String nombre) {
        this.nombre = nombre;
        this.animales = new ArrayList<>();
    }

    public void agregarAnimal(Animal animal) {
        animales.add(animal);
        System.out.println("🐾 Animal agregado al corral " + nombre + ": " + animal.getTipo());
    }

    public void mostrarAnimales() {
        System.out.println("🐖 Animales en el corral " + nombre + ":");
        for (Animal a : animales) {
            System.out.println(" - " + a.getNombre() + " (" + a.getTipo() + ")");
        }
    }

    public String getNombre() {
        return nombre;
    }

    public List<Animal> getAnimales() {
        return animales;
    }
}
