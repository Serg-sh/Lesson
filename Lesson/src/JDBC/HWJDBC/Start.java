package JDBC.HWJDBC;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Created by shpak on 01.08.2016.
 */
public class Start {

    public static void main(String[] args) {

        try {
            Scanner scanner = new Scanner(new FileInputStream("sqlQuery"), "UTF-8");

            String dbPath = scanner.nextLine();

            if (!new File(dbPath).exists()){
                System.out.println("File not found!");
                return;
            }

            System.out.println("DB = " +dbPath);

            DBUtils.openConnection(dbPath);

            DBUtils.showPrepStatment();

            StringBuilder builder = new StringBuilder();

            try{
                while (scanner.hasNextLine()){
                    builder.append(scanner.nextLine());
                }
            }finally {
                scanner.close();
            }

            String[] sql = builder.toString().split(";");

            StringBuilder resultBuilder = new StringBuilder();

            for (String sqlStr : sql) {
                resultBuilder.append("Query: " + sqlStr + "\n");
                resultBuilder.append("Result: " + "\n");

                ArrayList<SprOgject> list = DBUtils.getResultsList(sqlStr);

                for (SprOgject obj : list){
                    resultBuilder.append(obj.getId() + ", " + obj.getName_ru() + ", " + obj.getName_en() + "\n");
                }
                resultBuilder.append("\n");
            }

            System.out.println(resultBuilder.toString());

            writeTextToFile(resultBuilder.toString());

            DBUtils.closeConnection();


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    private static void writeTextToFile(String s) {
        try {
            Writer fw = new FileWriter("result.txt");
            fw.write(s);
            fw.flush();
            fw.close();

        } catch (IOException e) {
            Logger.getLogger(DBUtils.class.getName()).log(Level.SEVERE, null, e);
        }

    }
}
