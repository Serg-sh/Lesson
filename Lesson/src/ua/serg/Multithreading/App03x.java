package ua.serg.Multithreading;

/**
 * Created by shpak on 12.05.2016.
 */
public class App03x {
    public static void main(String[] args) {


        Runnable r = new Runnable() {
            @Override
            public void run() {
                System.out.println("run()");
            }
        };
        System.out.println(r.getClass().getName());
        r.run();
    }

}
