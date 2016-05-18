package ua.serg.Multithreading.Monitor;


/**
 * Created by shpak on 17.05.2016.
 */
public class App00 {
    public static void main(String[] args) throws InterruptedException {
        Object ref = new Object();
        synchronized (ref) {
            ref.wait(1000);
        }
    }
}
