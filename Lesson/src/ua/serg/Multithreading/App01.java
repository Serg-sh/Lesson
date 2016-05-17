package ua.serg.Multithreading;

/**
 * Created by shpak on 12.05.2016.
 */
public class App01 {
    public static void main(String[] args) {
        Runnable r0 = new RunableImpl();
        Runnable r1 = new RunableImpl();
        r0.run();
        r1.run();
    }
}
