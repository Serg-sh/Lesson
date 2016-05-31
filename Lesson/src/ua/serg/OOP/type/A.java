package ua.serg.OOP.type;

/**
 * Created by shpak on 26.05.2016.
 */
class A {
}
class B extends A {
}
class C extends B {
    void f() {}
}

class Demo {
    public static void main(String[] args) {
        A ref = new C();
//        ref.f();
    }
}