package com.granja.behavioral.strategy;

public class EstrategiaInvierno implements EstrategiaAlimentacion {
    @Override
    public void alimentar() {
        System.out.println("Alimentando animales con comida extra para invierno ❄️");
    }
}

