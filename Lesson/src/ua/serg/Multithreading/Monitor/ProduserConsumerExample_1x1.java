package ua.serg.Multithreading.Monitor;

/**
 * Created by shpak on 18.05.2016.
 */
public class ProduserConsumerExample_1x1 {
    public static void main(String[] args) throws InterruptedException {
        SingleElementBuffer buffer = new SingleElementBuffer();
        new Thread(new Producer(100, 1000, 1, buffer)).start();
        new Thread(new Producer(200, 1000, 2, buffer)).start();
        new Thread(new Producer(300, 1000, 3, buffer)).start();

        new Thread(new Consumer(buffer,1)).start();
        new Thread(new Consumer(buffer,2)).start();
    }
}
