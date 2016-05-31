package ua.serg.Multithreading.RabbitAttack;

/**
 * Created by shpak on 16.05.2016.
 */
public class Rabbit implements Runnable {
    public Rabbit(int rabbit) {
        this.rabbit = rabbit;
    }

    int rabbit = 1;
    final String space = new String("");

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {

            try {
                Thread.currentThread().sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException();
            }
            System.out.println(spaces() + rabbit);

        }
    }

    public String spaces() {
        String tmp = space;
        for (int i = 0; i < rabbit; i++) {
            tmp += " ";
        }
        return tmp;
    }
}
