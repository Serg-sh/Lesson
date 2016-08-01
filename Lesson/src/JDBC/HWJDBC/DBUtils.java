package JDBC.HWJDBC;

import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Created by shpak on 01.08.2016.
 */
public class DBUtils {

    private static Connection con;

    public static void openConnection(String path) {

        try {
            Driver driver = (Driver) Class.forName("org.sqlite.JDBC").newInstance();

            String url = "jdbc:sqlite:" + path;

            if (con == null) {
                con = DriverManager.getConnection(url);
            }


        } catch (InstantiationException | IllegalAccessException | ClassNotFoundException | SQLException e) {
            Logger.getLogger(DBUtils.class.getName()).log(Level.SEVERE, null, e);
        }
    }

    public static ArrayList<SprOgject> getResultsList(String sqlStr) {

        ArrayList<SprOgject> list = new ArrayList<>();
        Statement statement = null;
        ResultSet rs = null;

        try {
            statement = con.createStatement();

            rs = statement.executeQuery(sqlStr);
            while (rs.next()) {
                SprOgject sprOgject = new SprOgject();
                sprOgject.setId(rs.getInt("id"));
                sprOgject.setName_en(rs.getString("name_en"));
                sprOgject.setName_ru(rs.getString("name_ru"));

                list.add(sprOgject);
            }


        } catch (SQLException e) {
            Logger.getLogger(DBUtils.class.getName()).log(Level.SEVERE, null, e);
        }
        try {
            if (rs != null) {
                rs.close();
            }
            if (statement != null) {
                statement.close();
            }
        } catch (SQLException e) {
            Logger.getLogger(DBUtils.class.getName()).log(Level.SEVERE, null, e);
        }

        return list;


    }

    public static void closeConnection() {
        if (con != null){
            try {
                con.close();
            } catch (SQLException e) {
                Logger.getLogger(DBUtils.class.getName()).log(Level.SEVERE, null, e);
            }
        }
    }

    public static void showPrepStatment() {


    }
}
