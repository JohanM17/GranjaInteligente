package com.granja.model;

public class Sensor {
    private String tipo;
    private double valor;

    public Sensor(String tipo) {
        this.tipo = tipo;
    }

    public void leerValor(double nuevoValor) {
        this.valor = nuevoValor;
        System.out.println("📟 Sensor [" + tipo + "] detecta valor: " + valor);
    }

    public String getTipo() {
        return tipo;
    }

    public double getValor() {
        return valor;
    }
}
