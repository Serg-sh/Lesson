package ua.serg.Patterns.Strategy;

import ua.serg.Patterns.Strategy.auth.UserChecker;
import ua.serg.Patterns.Strategy.strategy.DBAuth;
import ua.serg.Patterns.Strategy.strategy.FileAuth;

import java.io.File;

/**
 * Created by shpak on 18.07.2016.
 */
public class Start {
    public static void main(String[] args) {
        UserChecker userChecker = new UserChecker();

        userChecker.check(new DBAuth("jdbc:etc"));

        userChecker.check(new FileAuth(new File("c:\\file.txt")));
    }
}
