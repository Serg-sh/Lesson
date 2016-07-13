package ua.serg.Patterns.AbstractFactory.impl.factory;

import ua.serg.Patterns.AbstractFactory.impl.air.Tu134;
import ua.serg.Patterns.AbstractFactory.impl.car.Niva;
import ua.serg.Patterns.AbstractFactory.interfaces.Aircraft;
import ua.serg.Patterns.AbstractFactory.interfaces.Car;
import ua.serg.Patterns.AbstractFactory.interfaces.TransportFactory;

/**
 * Created by shpak on 13.07.2016.
 */
public class RussianFactory implements TransportFactory {
    @Override
    public Car createCar() {
        return new Niva();
    }

    @Override
    public Aircraft createAircraft() {
        return new Tu134();
    }
}
