/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uas_crudfahri;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Administrator
 */
public class koneksidb {
    public static Connection getConnection() {
    Connection conn = null;
    String url = "jdbc:mysql://localhost:3306/uasfahri";
    String user = "root";
    String password = "";
    try{
        conn = DriverManager.getConnection(url, user, password);
    } catch (SQLException e) {
        System.out.println(e);
    }
    return conn;
  }
  public static void main(String[] args){
       try {
            Connection c = koneksidb.getConnection();
            System.out.println(String.format("konekss ke database %s " + "berhasil hore", c.getCatalog()));
//            System.out.println(String.format("koneks ke database %s " + "berhasil.", c.getCatalog()));
       } catch (SQLException e) {
            System.out.println(e);
       }
  }
    
}
