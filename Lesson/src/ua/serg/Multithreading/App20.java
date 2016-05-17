package ua.serg.Multithreading;

/**
 * Created by shpak on 12.05.2016.
 */
public class App20 {
    public static void main(String[] args) {
        Thread t0 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 5; i++) {
                    sillyWork();
                    System.out.println("Hello!");
                }
            }
        });
        t0.start();
        for (int i = 0; i < 5; i++) {
            sillyWork();
            System.out.println("Bye!");
        }

    }

    private static void sillyWork() {
        double d = 2.0;
        for (int i = 0; i < 10_000_000; i++) {
            d = Math.sin(d);
        }
    }
}
