package ua.serg.Collectons;


import java.util.ArrayList;
import static java.util.Arrays.asList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by shpak on 02.03.2016.
 */
public class App03 {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("Килька", 20);
        map.put("Сардины", 30);
        System.err.println(map);
        List<String> list = new ArrayList<>(asList("AA","BBB","CCC"));
        System.err.println(list);

    }
}
