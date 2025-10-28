package com.granja.behavioral.state;

public class EstadoTratamiento implements EstadoAnimal {
    @Override
    public void ejecutarAccion() {
        System.out.println("💉 El animal está en tratamiento veterinario.");
    }
}
