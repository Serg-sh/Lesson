package JDBC;

import java.io.*;
import java.sql.*;

/**
 * Created by shpak on 29.07.2016.
 */
public class Lesson2GDBC {
    public static void main(String[] args) {
        Connection connection = null;



        File sqlQuery = new File("Lesson/src/JDBC/sqlQuery1").getAbsoluteFile();
        File result = new File("Lesson/src/JDBC/result").getAbsoluteFile();

        try {
            Driver driver = (Driver) Class.forName("org.sqlite.JDBC").newInstance();
            String urlDB = "jdbc:sqlite:D:/GitRepos/Lesson/Test_db/AutoShop.db";
            connection = DriverManager.getConnection(urlDB);

            executeSQL(sqlQuery, result, connection);


        } catch (InstantiationException | ClassNotFoundException | IllegalAccessException | SQLException e) {
            e.printStackTrace();
        } finally {
            if (connection != null) try {
                connection.close();
            } catch (SQLException ignored) {
            }
        }


    }


    public static void executeSQL(File fileQuery, File res, Connection connection) throws SQLException {
        Statement statement = null;
        ResultSet resultSet = null;
        BufferedReader reader = null;
        BufferedWriter writer = null;
        try {
            reader = new BufferedReader(new FileReader(fileQuery));
            writer = new BufferedWriter(new FileWriter(res, true));
            do {
                String sql = reader.readLine();
                statement = connection.createStatement();

                resultSet = statement.executeQuery(sql);


                while (resultSet.next()) {


                    writer.write(resultSet.getString("name_en") + " - " + resultSet.getObject("name_ru") + '\n');

                }
                writer.write('\n');
            } while (reader.readLine() != null);

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (resultSet != null) resultSet.close();
                if (statement != null) statement.close();
                if (reader != null) reader.close();
                if (writer != null) writer.close();

            } catch (SQLException | IOException ignored) {
            }
        }


    }


}
