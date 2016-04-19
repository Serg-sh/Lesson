package ua.serg.Collectons;

import java.util.*;

/**
 * Created by shpak on 02.03.2016.
 */
public class App00{
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("aa");
        list.add("bb");
        list.add("dd");
        System.err.println(list);
        System.err.println(list.size());
        System.err.println(list.isEmpty());
        System.err.println(list.contains("aa"));
        System.err.println(list.contains("ff"));
        System.err.println(list.contains("ff"));


    }
}
