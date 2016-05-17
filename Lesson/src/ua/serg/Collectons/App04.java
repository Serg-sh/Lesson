package ua.serg.Collectons;


import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by shpak on 02.03.2016.
 */
public class App04 {
    public static void main(String[] args) {
        List list = new LinkedList<>(Arrays.asList("AA", "BBB", "CCCC"));
        System.out.println(list);
        f(list, "1", "2", "3");
        Iterator<String> iter = list.iterator();
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }

    }

    public static void f(List<String> list, String... arr) {
        for (String str : arr) {
            list.add(str);
        }
    }
}


