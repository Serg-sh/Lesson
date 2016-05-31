package ua.serg.OOP.Construction;

/**
 * Created by shpak on 26.05.2016.
 */
class A {
    public A() {
        System.out.println("A");
    }

    void f() {
        System.out.println("A.f");
    }
}

class B extends A {
    B() {
        System.out.println("B");
    }

    void f() {
        System.out.println("B.f");
    }
}

class C extends B {
    C() {
        System.out.println("C");
    }

    void f() {
        System.out.println("C.f");
    }
}

class Test0 {
    public static void main(String[] args) {
        B ref0 = new C();
        A ref1 = ref0;
        ref1.f();
        ref0.f();
    }
}

// TODO: 26.05.2016 class C {void C() {}}