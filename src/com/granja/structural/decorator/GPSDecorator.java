package com.granja.structural.decorator;

import com.granja.model.Animal;

public class GPSDecorator extends AnimalDecorator {
    public GPSDecorator(Animal animalDecorado) {
        super(animalDecorado);
    }

    @Override
    public void emitirSonido() {
        super.emitirSonido();
        agregarGPS();
    }

    private void agregarGPS() {
        System.out.println("📡 GPS activado para seguimiento del animal.");
    }
}