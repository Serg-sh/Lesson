package ua.serg.Multithreading;

/**
 * Created by shpak on 12.05.2016.
 */
public class App00 {
    public static final int N = 1_000_000;
    public static int counter = 0;
    public synchronized static void inc (){
        counter++;
    }

    public static void main(String[] args) throws InterruptedException {
        Thread t0 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < N; i++) inc();
            }
        });
        t0.start();

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < N; i++) inc();
            }
        });
        t1.start();
        t0.join();
        t1.join();
        System.out.println(counter);
    }
}
