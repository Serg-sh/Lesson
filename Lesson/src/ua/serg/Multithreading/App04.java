package ua.serg.Multithreading;

/**
 * Created by shpak on 12.05.2016.
 */
public class App04 {
    public static void main(String[] args) {


        Runnable r0 = new Runnable() {
            @Override
            public void run() {
                System.out.println("run()");
            }
        };

        Runnable r1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("run()");
            }
        };
        System.out.println(r0.getClass().getName());
        System.out.println(r1.getClass().getName());
        r0.run();
        r1.run();
    }

}
