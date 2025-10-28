package com.granja;

import com.granja.model.*;
import com.granja.creational.factory.*;
import com.granja.creational.abstractfactory.*;
import com.granja.creational.builder.*;
import com.granja.creational.singleton.*;
import com.granja.structural.facade.*;
import com.granja.behavioral.observer.*;
import com.granja.behavioral.strategy.*;
import com.granja.behavioral.command.*;
import com.granja.behavioral.state.*;

public class MainApp {
    public static void main(String[] args) {

        System.out.println("=== 🐄 GRANJA INTELIGENTE - SIMULACIÓN GENERAL ===\n");

        // -------------------------------------------------------------------------
        // 🧱 CREATIONAL PATTERNS
        // -------------------------------------------------------------------------
        System.out.println(">>> [1] Fábricas de animales (Factory Method):");
        Animal vaca = AnimalFactory.crearAnimal("vaca");
        Animal cerdo = AnimalFactory.crearAnimal("cerdo");
        Animal gallina = AnimalFactory.crearAnimal("gallina");

        vaca.emitirSonido();
        cerdo.emitirSonido();
        gallina.emitirSonido();

        System.out.println("\n>>> [2] Fábricas especializadas (Abstract Factory):");
        AbstractFactory lecheFactory = new LecheFactory();
        AbstractFactory carneFactory = new CarneFactory();
        lecheFactory.crearAnimal().emitirSonido();
        carneFactory.crearAnimal().emitirSonido();

        System.out.println("\n>>> [3] Builder + Singleton:");
        AnimalBuilder builder = new AnimalBuilder();
        AnimalDirector director = new AnimalDirector(builder);
        Animal vacaConstruida = director.construirVaca();
        AlimentadorGlobal.getInstancia().dispensarComida();
        System.out.println("Animal construido: " + vacaConstruida.getNombre());

        // -------------------------------------------------------------------------
        // 🐖 MODEL: CORRAL Y SENSOR
        // -------------------------------------------------------------------------
        System.out.println("\n>>> [4] Modelo de la Granja (Corral y Sensor):");
        Corral corralPrincipal = new Corral("Corral Principal");
        corralPrincipal.agregarAnimal(vacaConstruida);
        corralPrincipal.agregarAnimal(cerdo);
        corralPrincipal.mostrarAnimales();

        Sensor sensorHumedad = new Sensor("Humedad");
        sensorHumedad.leerValor(60.2);
        Sensor sensorLuz = new Sensor("Luz");
        sensorLuz.leerValor(300);

        // -------------------------------------------------------------------------
        // 🏗️ STRUCTURAL PATTERNS
        // -------------------------------------------------------------------------
        System.out.println("\n>>> [5] Facade:");
        GranjaFacade fachada = new GranjaFacade();
        fachada.verificarSensores();
        fachada.alimentarAnimales();
        fachada.aplicarDecoradores(vacaConstruida);

        // -------------------------------------------------------------------------
        // 🧠 BEHAVIORAL PATTERNS
        // -------------------------------------------------------------------------
        System.out.println("\n>>> [6] Observer:");
        SensorTemperatura sensor = new SensorTemperatura();
        SistemaAlerta alerta1 = new SistemaAlerta("Sistema Central");
        SistemaAlerta alerta2 = new SistemaAlerta("Módulo Secundario");
        sensor.addObserver(alerta1);
        sensor.addObserver(alerta2);
        sensor.setTemperatura(37.5);

        System.out.println("\n>>> [7] Strategy:");
        EstrategiaAlimentacion estrategia;
        boolean esInvierno = true;
        estrategia = esInvierno ? new EstrategiaInvierno() : new EstrategiaVerano();
        estrategia.alimentar();

        System.out.println("\n>>> [8] Command:");
        Invoker invoker = new Invoker();
        invoker.setComando(new DispensarAlimentacionCommand());
        invoker.ejecutarComando();
        invoker.setComando(new EncenderRiegoCommand());
        invoker.ejecutarComando();

        System.out.println("\n>>> [9] State:");
        AnimalContext contexto = new AnimalContext();
        contexto.setEstado(new EstadoSano());
        contexto.ejecutarAccion();
        contexto.setEstado(new EstadoEnfermo());
        contexto.ejecutarAccion();
        contexto.setEstado(new EstadoTratamiento());
        contexto.ejecutarAccion();

        System.out.println("\n=== ✅ SIMULACIÓN COMPLETA FINALIZADA ===");
    }
}
