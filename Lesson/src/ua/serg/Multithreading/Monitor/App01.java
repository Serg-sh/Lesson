package ua.serg.Multithreading.Monitor;


/**
 * Created by shpak on 17.05.2016.
 */
public class App01 {
    public static void main(String[] args) throws InterruptedException {
        Thread threadA = new Thread(new Runnable() {
            @Override
            public void run() {
                hello (1);
            }

            });
        Thread threadB  = new Thread(new Runnable() {
            @Override
            public void run() {
                hello(2);
            }
        });
        threadA.start();
        threadB.start();
    }

    private synchronized static void hello(int id) {
        System.out.println(id + ": - im here");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException ignore) {/*NOP*/}
    }
}
