package org.example;
import javax.xml.validation.Schema;
import java.sql.*;

public class sqlController {

    private  Connection connection=null;
    private String SQLiteDriver="jdbc:sqLite:";

    private String MYSQLDriver="jdbc:sqLite://"+"localhost:3306/";
    private String url;


    Connection getMYSQLConnection(String username, String password, String Schema) {

        url = MYSQLDriver + Schema + "?ServerTimezone=Europe/Amsterdam&amp";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(url, username, password);

            if (connection != null) {
                System.out.println("Connected to MYSQL schema:" + Schema);
            }
        }catch (SQLException throwables) {
            throwables.printStackTrace();
        }catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        return connection;

        }

    }
    

