package assignment;

import java.sql.*;
import javax.swing.*;

public class Connectiondatabase {
    Connection con;
    public Connectiondatabase() {
        try{
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Searching...");
        }catch(ClassNotFoundException cnf){
            System.out.println("Class not found"+ cnf.getLocalizedMessage());
        }
        try{
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/coursemanagementsystem", "root", "");
        }catch(SQLException e2){
            e2.printStackTrace();
        }
    }
    public Connection getConnection(){
        return con;
    }
}
