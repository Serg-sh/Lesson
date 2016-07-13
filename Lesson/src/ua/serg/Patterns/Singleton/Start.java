package ua.serg.Patterns.Singleton;

/**
 * Created by shpak on 11.07.2016.
 */
public class Start {
    public static void main(String[] args) {
        TestSingleton.getInstance().print();
        TestSingleton.getInstance().print();
        TestSingleton.getInstance().print();
        TestSingleton.getInstance().print();

    }
}
