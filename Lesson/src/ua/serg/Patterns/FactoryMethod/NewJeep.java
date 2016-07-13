package ua.serg.Patterns.FactoryMethod;

/**
 * Created by shpak on 13.07.2016.
 */
public class NewJeep extends Jeep {
    public void newFunction (){
        System.out.println("New Function");
    }

    @Override
    public void drive() {
        System.out.println("30 km/h");
    }

    @Override
    public void stop() {
        System.out.println("10 sec");
    }
}
