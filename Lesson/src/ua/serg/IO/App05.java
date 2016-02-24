package ua.serg.IO;

        import java.io.*;
        import java.util.Arrays;

/**
 * Created by shpak on 11.02.2016.
 */
public class App05 {
    public static void main(String[] args) throws IOException {
        ByteArrayOutputStream buf = new ByteArrayOutputStream();
        for (int i = 1; i<10; i++){
            buf.write((int) (Math.random() * 11 + 5));
        }
        byte[] tmp = buf.toByteArray();
        Arrays.sort(tmp);
        System.out.println(Arrays.toString(tmp));
        Writer dst = new FileWriter("d:/tmp.txt");
        dst.write(Arrays.toString(tmp));
        dst.write('\n' + "Hello");
        dst.close();

    }
}

