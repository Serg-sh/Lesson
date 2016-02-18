package ua.serg.IO;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

/**
 * Created by shpak on 09.02.2016.
 */
public class App00 {
    public static void main(String[] args) throws UnsupportedEncodingException {
        System.out.println(Arrays.toString("ЄЇ".getBytes("UTF-8")));
        System.out.println(Arrays.toString("AA".getBytes("UTF-16")));
        System.out.println(Arrays.toString("ЄЇ".getBytes("UTF-16")));
        System.out.println(Arrays.toString("ЄЇ".getBytes("UTF-32")));
        System.out.println(Arrays.toString("A".getBytes("cp1251")));
        System.out.println(Arrays.toString("a".getBytes("ASCII")));
        System.out.println(Arrays.toString("A".getBytes("KOI8-R")));
        System.out.println(Arrays.toString("є".getBytes("Unicode")));
        System.out.println((char) 5_000_000);
    }

}
