package ua.serg.Patterns.Adapter.objects;

import ua.serg.Patterns.Adapter.adapters.PrinterAdapter;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * Created by shpak on 13.07.2016.
 */
public class Client {

    public static void main(String[] args) {
        List<String> list = new ArrayList();
        list.add("text1");
        list.add("text2");
        list.add("text3");

        PrinterAdapter printerAdapter = new PrinterAdapter();
        printerAdapter.print(list);

    }

}
