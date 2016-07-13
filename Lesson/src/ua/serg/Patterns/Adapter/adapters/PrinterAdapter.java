package ua.serg.Patterns.Adapter.adapters;

import ua.serg.Patterns.Adapter.objects.Printer;

import java.util.List;

/**
 * Created by shpak on 13.07.2016.
 */
public class PrinterAdapter implements PageListPrinter {

    private Printer printer = new Printer();

    @Override
    public void print(List<String> list) {
        for (String text : list){
            printer.print(text);
        }
    }
}
