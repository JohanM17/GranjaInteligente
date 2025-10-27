package com.granja.behavioral.state;

public class EstadoEnfermo implements EstadoAnimal {
    @Override
    public void ejecutarAccion() {
        System.out.println("🤒 El animal está enfermo y requiere atención.");
    }
}
