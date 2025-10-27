package com.granja.structural.facade;

import com.granja.creational.singleton.AlimentadorGlobal;
import com.granja.structural.adapter.SensorAdapter;
import com.granja.structural.adapter.LegacySensor;
import com.granja.model.Animal;
import com.granja.structural.decorator.GPSDecorator;
import com.granja.structural.decorator.VacunaDecorator;

public class GranjaFacade {

    private AlimentadorGlobal alimentador;
    private SensorAdapter sensor;

    public GranjaFacade() {
        alimentador = AlimentadorGlobal.getInstancia();
        sensor = new SensorAdapter(new LegacySensor());
    }

    public void alimentarAnimales() {
        alimentador.dispensarComida();
    }

    public void verificarSensores() {
        double temperatura = sensor.leerTemperatura();
        System.out.println("Temperatura verificada: " + temperatura + "°C");
    }

    public void aplicarDecoradores(Animal animal) {
        Animal conGPS = new GPSDecorator(animal);
        Animal vacunado = new VacunaDecorator(conGPS);
        vacunado.emitirSonido();
    }
}