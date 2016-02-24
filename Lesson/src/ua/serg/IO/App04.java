package ua.serg.IO;

        import java.io.*;

/**
 * Created by shpak on 11.02.2016.
 */
public class App04 {
    public static void main(String[] args) throws IOException {
        String str = "Hello";
        char[] chars = str.toCharArray();
        try (OutputStream dst = new FileOutputStream("d:/tmp.txt");
             Writer writer = new OutputStreamWriter(dst, "UTF-8");) {
            writer.write(str);
            writer.flush();
        }
    }
}

