package ua.serg.Patterns.Observer;

import ua.serg.Patterns.Observer.impl.Publisher;
import ua.serg.Patterns.Observer.impl.Subscriber1;

/**
 * Created by shpak on 18.07.2016.
 */
public class Start {
    public static void main(String[] args) {
        Subscriber1 subscriber1 = new Subscriber1();
        Subscriber1 subscriber2 = new Subscriber1();

        Publisher publisher = new Publisher();

        publisher.addListner(subscriber1);
        publisher.addListner(subscriber2);

        publisher.createNewMessage("Message!");
    }
}
