package ua.serg.Patterns.Observer.impl;

import ua.serg.Patterns.Observer.interfaces.PublisherActionListener;

/**
 * Created by shpak on 18.07.2016.
 */
public class Subscriber1 implements PublisherActionListener {
    @Override
    public void doAction(String message) {
        System.out.println(message + " from " + this.getClass().getName());
    }
}
