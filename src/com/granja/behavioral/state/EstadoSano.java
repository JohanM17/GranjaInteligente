package com.granja.behavioral.state;

public class EstadoSano implements EstadoAnimal {
    @Override
    public void ejecutarAccion() {
        System.out.println("🐄 El animal está sano y activo.");
    }
}
