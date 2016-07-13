package ua.serg.Patterns.Decorator.decorators;

import ua.serg.Patterns.Decorator.objects.Component;

/**
 * Created by shpak on 13.07.2016.
 */
public class ColorDecorator extends Decorator {
    public ColorDecorator(Component component) {
        super(component);
    }

    @Override
    public void afterDraw() {
        System.out.println(" .... change color");
    }
}
