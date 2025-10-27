package com.granja.creational.singleton;

public class AlimentadorGlobal {
    private static AlimentadorGlobal instancia;

    private AlimentadorGlobal() {
        System.out.println("🐮 Alimentador global inicializado...");
    }

    public static AlimentadorGlobal getInstancia() {
        if (instancia == null) {
            instancia = new AlimentadorGlobal();
        }
        return instancia;
    }

    public void dispensarComida() {
        System.out.println("🍽️ Dispensando alimento a todos los animales...");
    }
}
