package com.granja.model;

public class Animal {
    private String nombre;
    private String tipo;
    private int edad;

    public Animal() {}

    public Animal(String nombre, String tipo, int edad) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.edad = edad;
    }

    public void emitirSonido() {
        System.out.println(nombre + " hace sonidos.");
    }

    public String getNombre() { return nombre; }
    public String getTipo() { return tipo; }
    public int getEdad() { return edad; }
}