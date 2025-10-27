package com.granja.behavioral.command;

public class Invoker {
    private Command comando;

    public void setComando(Command comando) {
        this.comando = comando;
    }

    public void ejecutarComando() {
        if (comando != null) {
            comando.ejecutar();
        } else {
            System.out.println("No hay comando asignado para ejecutar.");
        }
    }
}
