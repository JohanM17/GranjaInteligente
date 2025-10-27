package com.granja.behavioral.command;

public class EncenderRiegoCommand implements Command {
    @Override
    public void ejecutar() {
        System.out.println("💧 Sistema de riego activado en los corrales...");
    }
}
