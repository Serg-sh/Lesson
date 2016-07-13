package ua.serg.Patterns.Decorator;

import ua.serg.Patterns.Decorator.decorators.BorderDecorator;
import ua.serg.Patterns.Decorator.decorators.ColorDecorator;
import ua.serg.Patterns.Decorator.objects.Component;
import ua.serg.Patterns.Decorator.objects.TextView;
import ua.serg.Patterns.Decorator.objects.Window;

/**
 * Created by shpak on 13.07.2016.
 */
public class Start {
    private static Component window;
    private static Component textView;

    public static void main(String[] args) {

        boolean showBorder = true;

        if (!showBorder){
            window = new Window();
            textView = new TextView();
        }else {
            window = new BorderDecorator(new Window());
            textView = new BorderDecorator(new TextView());
        }

        window.draw();
        textView.draw();

    }
}
