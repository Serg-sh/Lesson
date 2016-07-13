package ua.serg.OOP.type;


/**
 * Created by shpak on 26.05.2016.
 */
class A {
}

class B extends A {
}

class C extends B {
    void f() {
    }
}

class Demo {
    public static void main(String[] args) {
        A ref = new C();
//        ref.f();
        fun(new C());
        fun(new int[]{1, 2, 3});
    }

    public static void fun(Object ref) {
        System.out.println("str: " + ref.toString());
    }
}