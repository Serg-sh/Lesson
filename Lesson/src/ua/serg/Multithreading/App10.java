package ua.serg.Multithreading;

/**
 * Created by shpak on 12.05.2016.
 */
public class App10 {
    public static void main(String[] args) {
        System.out.println("main() : " + Thread.currentThread().getName());

        Thread newThread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("run() : " + Thread.currentThread().getName());
            }
        });
        newThread.start();
    }
}
