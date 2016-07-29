package ua.serg.Patterns.Observer.impl;

import ua.serg.Patterns.Observer.interfaces.PublisherActionListener;
import ua.serg.Patterns.Observer.interfaces.PublisherInterface;

import java.util.ArrayList;

/**
 * Created by shpak on 18.07.2016.
 */
public class Publisher implements PublisherInterface {

    private ArrayList<PublisherActionListener> listeners = new ArrayList<>();

    @Override
    public ArrayList<PublisherActionListener> getListeners() {
        return listeners;
    }

    @Override
    public void addListner(PublisherActionListener listener) {
        listeners.add(listener);

    }

    @Override
    public void removeListner(PublisherActionListener listener) {
        listeners.remove(listener);
    }

    @Override
    public void removeAllListeners() {
        listeners.clear();
    }

    @Override
    public void notifySubscribers(String message) {
        for (PublisherActionListener actionListener : listeners){
            actionListener.doAction(message);
        }
    }

    public void createNewMessage(String message){
        System.out.println("Publisher printed message " +message);
        notifySubscribers(message);
    }
}
