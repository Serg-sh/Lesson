package ua.serg.Patterns.Decorator.decorators;

import ua.serg.Patterns.Decorator.objects.Component;

/**
 * Created by shpak on 13.07.2016.
 */
public abstract class Decorator implements Component{

    protected Component component;

    public Decorator(Component component){
        this.component = component;
    }

    @Override
    public void draw() {
        component.draw();
        afterDraw();

    }

    public abstract void afterDraw();
}
