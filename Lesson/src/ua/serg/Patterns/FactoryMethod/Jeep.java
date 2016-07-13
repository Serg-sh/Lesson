package ua.serg.Patterns.FactoryMethod;

/**
 * Created by shpak on 13.07.2016.
 */
public class Jeep implements Car {
    @Override
    public void drive() {
        System.out.println("50 km/h");
    }

    @Override
    public void stop() {
        System.out.println("5 sek");
    }
}
