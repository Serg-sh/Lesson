package ua.serg.Multithreading.Monitor;

/**
 * Created by shpak on 18.05.2016.
 */
public class Consumer implements Runnable {
    private final SingleElementBuffer buffer;
    private final int idConsumer;

    public Consumer(SingleElementBuffer buffer, int idConsumer) {
        this.buffer = buffer;
        this.idConsumer = idConsumer;
    }

    @Override
    public void run() {
        while (true) {
            try {
                Integer elem = buffer.get();
                System.out.println("                consumer: " + idConsumer + " " + elem + " consumed");
            } catch (InterruptedException e) {
                System.out.println(Thread.currentThread().getName() + " stopped");
                return;
            }
        }
    }
}
