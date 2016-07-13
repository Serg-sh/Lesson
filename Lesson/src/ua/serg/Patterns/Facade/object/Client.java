package ua.serg.Patterns.Facade.object;

import ua.serg.Patterns.Facade.facade.CarFacade;

/**
 * Created by shpak on 13.07.2016.
 */
public class Client {
    public static void main(String[] args) {

        new CarFacade().go();

    }
}
