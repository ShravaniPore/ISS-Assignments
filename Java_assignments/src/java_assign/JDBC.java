package java_assign;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBC {

    Connection conn;
    Statement s;
    JDBC(){
        String url="jdbc:mysql://127.0.0.1:3306/college";
        String username="root";
        String password="Shrav@01";
        try {
            conn = DriverManager.getConnection(url, username, password);
            s = conn.createStatement();
            System.out.println("Connection successful");
            System.out.println(conn);

        }catch (Exception e){
            e.printStackTrace();
        }}

    public static void main(String[] args) {
        new JDBC();
    }
}

