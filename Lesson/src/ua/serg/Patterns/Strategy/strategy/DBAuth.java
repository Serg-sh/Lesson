package ua.serg.Patterns.Strategy.strategy;

/**
 * Created by shpak on 18.07.2016.
 */
public class DBAuth implements AuthStrategy {

    private Object dbRef;
    private String dbUrl;

    public DBAuth (String dbUrl){
        this.dbUrl = dbUrl;
    }

    private void createConnection(String dbUrl){


    }

    @Override
    public boolean checkLogin(String name, String password) {
        System.out.println("Checking with DB...");
        String userHash = getHash(name);
        String passHash = getHash(password);
        return checkUser (userHash, passHash);
    }

    private String getHash(String name) {
        return "45DRD223F";
    }

    private boolean checkUser(String userHash, String passHash) {


        return true;
    }


}
