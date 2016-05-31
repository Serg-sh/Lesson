package ua.serg.OOP.Construction;

/**
 * Created by shpak on 26.05.2016.
 */
class X {
    X(int k) {
        System.out.println("X(int) :" + hashCode());
    }

    public X(String s) {
        this(0);
        System.out.println("X(String)");
    }
}

class Y extends X {
    public Y() {
        super("");
        System.out.println("Y()");
    }

    public Y(int x, int y) {
        this();
        System.out.println("Y(int,int)");
    }
}
class Test1 {
    public static void main(String[] args) {
        new Y (0,0);
    }
}