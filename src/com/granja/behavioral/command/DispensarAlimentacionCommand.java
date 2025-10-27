package com.granja.behavioral.command;

public class DispensarAlimentoCommand implements Command {
    @Override
    public void ejecutar() {
        System.out.println("🐄 Dispensando alimento automáticamente...");
    }
}
