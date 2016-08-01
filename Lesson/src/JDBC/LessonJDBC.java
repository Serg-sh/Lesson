package JDBC;

import java.sql.*;

/**
 * Created by shpak on 29.07.2016.
 */
public class LessonJDBC {
    public static void main(String[] args) {
        Connection con = null; // Хранит соединение с БД
        Statement stmt = null; //хранит и выполняет SQL запросы
        ResultSet res = null; // получает результаты SQL запросов

        try {
            Driver driver = (Driver) Class.forName("org.sqlite.JDBC").newInstance();


            String url= "jdbc:sqlite:D:/GitRepos/Lesson/Test_db/AutoShop.db";
            con = DriverManager.getConnection(url);


            String sql = "SELECT * FROM spr_Model";
            stmt = con.createStatement();

            res = stmt.executeQuery(sql);

            while (res.next()){
                System.out.println(res.getString("name_en")+ " - " + res.getObject("name_ru"));
            }


        } catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try{
                if (res!=null) res.close();
                if (stmt!=null) stmt.close();
                if (con!=null) con.close();
            } catch (SQLException e) {

            }
        }


    }
}
