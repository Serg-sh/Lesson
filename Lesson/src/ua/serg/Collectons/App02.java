package ua.serg.Collectons;

import java.util.*;

/**
 * Created by shpak on 02.03.2016.
 */
public class App02 {
    public static void main(String[] args) {
        NavigableSet<String> nSet = new TreeSet<>();
        Set<String> set = new HashSet<>();
        SortedSet<String> sSet = new TreeSet<>();
        set.add("d");
        set.add("a");
        set.add("c");
        set.add("b");
        System.out.println(set);


    }
}
