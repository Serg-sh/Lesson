package ua.serg.Collectons;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by shpak on 02.03.2016.
 */
public class App01 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("aa");
        list.add("bb");
        list.add("dd");
        System.out.println(list);
        list.add("cc");
        System.out.println(list);
        list.add(1, "ff");
        System.out.println(list);
        System.out.println(list.set(1, "dd"));
        System.out.println(list);


    }
}
