package ua.serg.Patterns.Singleton;

/**
 * Created by shpak on 11.07.2016.
 */
public class TestSingleton {
    private TestSingleton() {
    }
    private static TestSingleton instance;

    public static TestSingleton getInstance(){
        if (instance == null){
            instance = new TestSingleton();
        }
        return instance;
    }
    public void print(){
        System.out.println(this);
    }
}
