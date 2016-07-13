package ua.serg.Patterns.AbstractFactory.impl.factory;

import ua.serg.Patterns.AbstractFactory.impl.air.Boing747;
import ua.serg.Patterns.AbstractFactory.impl.car.Porshe;
import ua.serg.Patterns.AbstractFactory.interfaces.Aircraft;
import ua.serg.Patterns.AbstractFactory.interfaces.Car;
import ua.serg.Patterns.AbstractFactory.interfaces.TransportFactory;

/**
 * Created by shpak on 13.07.2016.
 */
public class USAFactory implements TransportFactory {
    @Override
    public Car createCar() {
        return new Porshe();
    }

    @Override
    public Aircraft createAircraft() {
        return new Boing747();
    }
}
