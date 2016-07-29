package ua.serg.Patterns.Strategy.strategy;

/**
 * Created by shpak on 18.07.2016.
 */
public interface AuthStrategy {
    boolean checkLogin(String name, String password);
}
