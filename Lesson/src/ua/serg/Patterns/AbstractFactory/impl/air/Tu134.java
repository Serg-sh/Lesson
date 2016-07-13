package ua.serg.Patterns.AbstractFactory.impl.air;

import ua.serg.Patterns.AbstractFactory.interfaces.Aircraft;

/**
 * Created by shpak on 13.07.2016.
 */
public class Tu134 implements Aircraft {
    @Override
    public void fly() {
        System.out.println("Tu134 flight");
    }
}
