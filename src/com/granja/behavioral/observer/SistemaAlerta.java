package com.granja.behavioral.observer;

public class SistemaAlerta implements Observer {
    private String nombre;

    public SistemaAlerta(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void update(String mensaje) {
        System.out.println(nombre + " recibe notificación: " + mensaje);
    }
}
