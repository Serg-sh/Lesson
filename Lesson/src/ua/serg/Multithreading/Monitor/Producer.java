package ua.serg.Multithreading.Monitor;

/**
 * Created by shpak on 18.05.2016.
 */
public class Producer implements Runnable {
    private int startValue;
    private final int period;
    private final SingleElementBuffer buffer;
    private final int idProducer;


    public Producer(int startValue, int period, int idProducer, SingleElementBuffer buffer) {
        this.startValue = startValue;
        this.period = period;
        this.idProducer = idProducer;
        this.buffer = buffer;
    }

    @Override
    public void run() {
        while (true) {
            System.out.println("producer: " + idProducer + " " + startValue + " produced");
            try {
                buffer.put(startValue++);
                Thread.sleep(period);
            } catch (InterruptedException e) {
                System.out.println(Thread.currentThread().getName() + " stopped");
                break;
            }
        }

    }
}
