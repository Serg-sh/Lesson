package ua.serg.Patterns.State.state;

/**
 * Created by shpak on 18.07.2016.
 */
public class FireState implements TransformerState {
    @Override
    public void action() {
        System.out.println("Fire! Fire! Fire! Fire! Fire!");
    }
}
