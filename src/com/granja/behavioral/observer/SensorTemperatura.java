package com.granja.behavioral.observer;

public class SensorTemperatura extends Subject {
    private double temperatura;

    public void setTemperatura(double temperatura) {
        this.temperatura = temperatura;
        notifyObservers("Temperatura actual: " + temperatura + "°C");
        if (temperatura > 35) {
            notifyObservers("⚠️ ALERTA: Temperatura muy alta en el corral!");
        }
    }
}
