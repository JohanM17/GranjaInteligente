package com.granja.structural.adapter;

public class SensorAdapter {
    private LegacySensor sensorAntiguo;

    public SensorAdapter(LegacySensor sensorAntiguo) {
        this.sensorAntiguo = sensorAntiguo;
    }

    public double leerTemperatura() {
        double temp = sensorAntiguo.obtenerTemperaturaLegacy();
        System.out.println("Adaptando lectura de sensor legacy: " + temp + "°C");
        return temp;
    }
}