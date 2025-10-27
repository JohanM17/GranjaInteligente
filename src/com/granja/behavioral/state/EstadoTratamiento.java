package com.granja.behavioral.state;

public class EstadoEnTratamiento implements EstadoAnimal {
    @Override
    public void ejecutarAccion() {
        System.out.println("💉 El animal está en tratamiento veterinario.");
    }
}
