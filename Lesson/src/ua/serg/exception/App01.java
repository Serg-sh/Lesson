package ua.serg.exception;

import java.io.IOException;
import java.sql.SQLException;

/**
 * Created by shpak on 08.02.2016.
 */
public class App01 {
    public static void main(String[] args) throws IOException, SQLException {
        try {
            if (System.nanoTime() % 2 == 0){
                throw  new IOException();
            }else{
                throw new SQLException();
            }
        } catch (IOException | SQLException e){
            throw e;

        }
    }
}
