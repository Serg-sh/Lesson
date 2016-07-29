package ua.serg.Patterns.Observer.interfaces;

import java.util.ArrayList;

/**
 * Created by shpak on 18.07.2016.
 */
public interface PublisherInterface {

    ArrayList<PublisherActionListener> getListeners();

    void addListner(PublisherActionListener listener);

    void removeListner(PublisherActionListener listener);

    void removeAllListeners();

    void notifySubscribers(String message);
}
