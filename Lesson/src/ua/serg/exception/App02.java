package ua.serg.exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by shpak on 08.02.2016.
 */
public class App02 {
    public static void main(String[] args) throws IOException {
        FileInputStream in = new FileInputStream("d:/tmp-1.txt");
        FileOutputStream out = new FileOutputStream("d:/tmp-2.txt");
        out.write(in.read());
        out.flush();
        out.close();
        in.close();
    }
}
