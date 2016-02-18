package ua.serg.IO;

import java.io.*;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by shpak on 11.02.2016.
 */
public class App03 {
    public static void main(String[] args) throws IOException {
        try (InputStream in = new FileInputStream("d:/google.txt");
             /*InputStream inUrl = new URL("http://dom2.ru").openStream();*/
            /*OutputStream dst = new FileOutputStream("d:/google.txt")*/) {
            sCopy(in, System.out, 4);
        }
    }

    public static void sCopy(InputStream in, OutputStream dst, int buffSize) throws IOException {
        byte[] buff = new byte[buffSize];

        int count;

        while ((count = in.read(buff)) != -1) {
            List<Integer> list = new ArrayList<>();
            for (int i = 0; i < count; i++) {
                if (buff[i] != 48) {
                    list.add(i);
                }
            }
            byte[] buffTmp = new byte[list.size()];
            for (int i = 0; i < buffTmp.length; i++) {
                buffTmp[i] = buff[list.get(i)];
            }
            dst.write(buffTmp);
            System.out.println();
        }

    }
}

