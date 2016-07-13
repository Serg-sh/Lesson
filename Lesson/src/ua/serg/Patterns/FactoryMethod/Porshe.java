package ua.serg.Patterns.FactoryMethod;

/**
 * Created by shpak on 13.07.2016.
 */
public class Porshe implements Car {
    @Override
    public void drive() {
        System.out.println("150 km/h");
    }

    @Override
    public void stop() {
        System.out.println("1 sek");
    }
}
