package com.solvd.sportsgames.coonect;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connector {
    public static Connector connect;
    private final String url = "jdbc:postgresql://localhost/SolvdLaba21";
    private final String user = "postgres";
    private final String password = "strw103b";
    public Connection connect() {
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url, user, password);
            System.out.println("Connected to SQL");
        } catch(SQLException e) {
            System.out.println("Error to connection server SQL");
            e.printStackTrace();
        }
        return conn;
    }

}
