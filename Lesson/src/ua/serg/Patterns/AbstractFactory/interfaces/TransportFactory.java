package ua.serg.Patterns.AbstractFactory.interfaces;

/**
 * Created by shpak on 13.07.2016.
 */
public interface TransportFactory {
    Car createCar();
    Aircraft createAircraft();
}
