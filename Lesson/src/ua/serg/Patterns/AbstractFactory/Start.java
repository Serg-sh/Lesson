package ua.serg.Patterns.AbstractFactory;

import ua.serg.Patterns.AbstractFactory.impl.factory.RussianFactory;
import ua.serg.Patterns.AbstractFactory.impl.factory.USAFactory;
import ua.serg.Patterns.AbstractFactory.interfaces.Aircraft;
import ua.serg.Patterns.AbstractFactory.interfaces.Car;
import ua.serg.Patterns.AbstractFactory.interfaces.TransportFactory;

/**
 * Created by shpak on 13.07.2016.
 */
public class Start {
    public static void main(String[] args) {
        TransportFactory russianFactory = new RussianFactory();
        TransportFactory usaFactory = new USAFactory();
        Aircraft aircraft = russianFactory.createAircraft();
        Aircraft aircraft1 = usaFactory.createAircraft();
        aircraft.fly();
        aircraft1.fly();

        Car car = russianFactory.createCar();
        Car car1 = usaFactory.createCar();
        car.drive();
        car1.drive();

    }
}
