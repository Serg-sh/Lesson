package ua.serg.Patterns.FactoryMethod;

/**
 * Created by shpak on 13.07.2016.
 */
public class Start {
    public static void main(String[] args) {
        CarSelector carSelector = new CarSelector();

        Car car = carSelector.getCar(RoadType.CITY);
        Car car1 = carSelector.getCar(RoadType.OFF_ROAD);
        Car car2 = carSelector.getCar(RoadType.GAZON);
        car.drive();
        car1.drive();
        car2.drive();
        car.stop();
        car1.stop();
        car2.stop();

    }
}
