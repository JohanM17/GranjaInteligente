package com.granja.behavioral.state;

public class AnimalContext {
    private EstadoAnimal estado;

    public void setEstado(EstadoAnimal estado) {
        this.estado = estado;
    }

    public void ejecutarAccion() {
        if (estado != null) {
            estado.ejecutarAccion();
        } else {
            System.out.println("El estado del animal no está definido.");
        }
    }
}
