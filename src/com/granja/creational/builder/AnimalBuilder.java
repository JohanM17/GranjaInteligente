package com.granja.creational.builder;

import com.granja.model.Animal;

public class AnimalBuilder {
    private String nombre;
    private String tipo;
    private int edad;

    public AnimalBuilder setNombre(String nombre) {
        this.nombre = nombre;
        return this;
    }

    public AnimalBuilder setTipo(String tipo) {
        this.tipo = tipo;
        return this;
    }

    public AnimalBuilder setEdad(int edad) {
        this.edad = edad;
        return this;
    }

    public Animal build() {
        return new Animal(nombre, tipo, edad);
    }
}
