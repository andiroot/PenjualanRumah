/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author andi
 */
public class KoneksiDB {
    
    private static final String driver = "com.mysql.jdbc.Driver";
    private static final String database = "jdbc:mysql://localhost:3306/penjualan_rumah";
    private static final String user = "root";
    private static final String password = "";
    private Connection koneksi;
    public Connection getConnection() throws ClassNotFoundException{
        Connection koneksi=null;
        
        Class.forName(driver);
        
        try {
            koneksi=DriverManager.getConnection(database,user,password);
        } catch (SQLException ex) {
            Logger.getLogger(KoneksiDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return koneksi;
    }
}
    
