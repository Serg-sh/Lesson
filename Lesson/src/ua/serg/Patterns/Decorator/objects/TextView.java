package ua.serg.Patterns.Decorator.objects;

/**
 * Created by shpak on 13.07.2016.
 */
public class TextView implements Component {
    @Override
    public void draw() {
        System.out.println("text view");
    }
}
