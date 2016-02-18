package ua.serg.IO;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;

/**
 * Created by shpak on 11.02.2016.
 */
public class App02 {
    public static void main(String[] args) throws IOException {
        try (InputStream src = new URL("http://dom2.ru").openStream();
            /* OutputStream dst = new FileOutputStream("d:/google.txt")*/ ) {
            sCopy(src, System.out);
        }
    }

    public static void sCopy(InputStream src, OutputStream dst) throws IOException {
        byte[] buff = new byte[64 * 1024];
        while (true) {
            int count = src.read(buff);
            if (count != -1) {
                dst.write(buff, 0, count);
            } else {
                return;
            }
        }
    }
}

