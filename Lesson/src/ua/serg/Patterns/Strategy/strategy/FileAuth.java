package ua.serg.Patterns.Strategy.strategy;

import java.io.File;

/**
 * Created by shpak on 18.07.2016.
 */
public class FileAuth implements AuthStrategy {

    private File file;

    public FileAuth(File file) {
        this.file = file;
    }


    @Override
    public boolean checkLogin(String name, String password) {
        System.out.println("Cheking with file...");
        return chekFromFile();
    }

    private boolean chekFromFile() {

        return true;
    }
}
