package ua.serg.OOP.Construction;

/**
 * Created by shpak on 26.05.2016.
 */
public class Parent {
    public Parent(int i) {
    }

    public Parent() {
    }
}

class Child extends Parent {
    public Child(int i) {
        super(i);
    }

    public Child() {
    }
}