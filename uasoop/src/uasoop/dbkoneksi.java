/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uasoop;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;

/**
 *
 * @author Gunawiartha
 * 
 */
public class dbkoneksi {
    static String JDBC_DRIVER="com.mysql.cj.jdbc.Driver";
    static String DB_URL="jdbc:mysql://localhost/db_tagihan";
    static String DB_USER="root";
    static String DB_PAS="";
    static Connection konek;
    
    public static Connection getConnection(){
        try {
            Class.forName(JDBC_DRIVER);
            konek = DriverManager.getConnection(DB_URL, DB_USER, DB_PAS);
            System.out.println("Koneksi berhasil");
            return konek;
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Terjadi masalah koneksi database: " + e.getMessage());
        }
        return null;
    }
}
