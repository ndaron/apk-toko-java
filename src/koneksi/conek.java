/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package koneksi;

import service.AnggotaService;
import domain.Anggota;
import java.sql.*;
import com.mysql.jdbc.Driver;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


import login.tambahmember;

/**
 *
 * @author imam
 */
public class conek {

    public static Object GetConnection() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
 
    private static AnggotaService anggotaService;
    public static AnggotaService getAnggotaService(){
        return anggotaService;
    }

   
        
    

    public conek() { // merupakan construktor (ingat, nama construktor harus sama dengan nama Class 
        
    }
    
    public Connection getConnection() throws SQLException {
        Connection cn;
        try {
            String server = "jdbc:mysql://localhost/toko";
            String driver = "com.mysql.jdbc.Driver";
            Class.forName(driver);
            cn = DriverManager.getConnection (server, "root","");
            return cn;
        } catch (SQLException se) {
            System.out.println(se.toString());
            return null;
        } catch (Exception ex) {
            System.out.println(ex.toString());
            return null;
        }
    }
    
   /* 
    private static Connection mysqlkonek;
  public static Connection koneksiDB() throws SQLException
  {
  if(mysqlkonek==null){
  try {
  String url="jdbc:mysql://localhost:3306/toko";
  String user="root";
  String pass="";
  
  DriverManager.registerDriver(new com.mysql.jdbc.Driver());
  mysqlkonek = (Connection) DriverManager.getConnection(url, user, pass);
  } catch (Exception e) {
  JOptionPane.showMessageDialog(null, "gagal koneksi");
  }
  }
  return mysqlkonek;
  }
  
  public static void main (String args []){
  }
*/
    
    
    
    
    
    
    /*private static Connection koneksi;
    
    public static Connection GetConnection() throws SQLException {
    if (koneksi ==null){
    new Driver();
    koneksi=DriverManager.getConnection("jdbc:mysql://localhost:3306/toko","root","");
    }
    
    return koneksi;
    }
*/

    
}

