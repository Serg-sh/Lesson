package ua.serg.OOP;


/**
 * Created by shpak on 06.06.2016.
 */
public class TestInterface extends Test3 implements Test1, Test2 {
    public static void main(String[] args) {
        new TestInterface().f();
        Test1 test1 = new TestInterface();
        Test2 test2 = new TestInterface();
        test1.d();
        test2.c();
//        test1.X = 2;
        TestInterface test3 = new TestInterface();
        test3.y = 1;
        System.out.println(test3.y);
        test3.draw();
        System.out.println(test1.X);

    }

    public void f() {
        System.out.println("Main");
    }

    @Override
    public void draw() {
        System.out.println("Test3");
    }
}

interface Test1 {
    default  void d() {
        System.out.println("Test1");
    }
//    public void draw();
    public int X = 0;
}
interface Test2 {
    default void c () {
        System.out.println("Test2");
    }
}
abstract class Test3{
    int y;
    public abstract void draw();
}