package ua.serg.Patterns.Facade.facade;

import ua.serg.Patterns.Facade.parts.Door;
import ua.serg.Patterns.Facade.parts.Wheel;
import ua.serg.Patterns.Facade.parts.Zazhiganie;

/**
 * Created by shpak on 13.07.2016.
 */
public class CarFacade {

    private Door door = new Door();
    private Wheel wheel = new Wheel();
    private Zazhiganie zazhiganie = new Zazhiganie();

    public void go(){
        door.open();
        zazhiganie.fire();
        wheel.turn();
    }
}
