package com.granja.behavioral.strategy;

public class EstrategiaVerano implements EstrategiaAlimentacion {
    @Override
    public void alimentar() {
        System.out.println("Alimentando animales con dieta ligera de verano ☀️");
    }
}
