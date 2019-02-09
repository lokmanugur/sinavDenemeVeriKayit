/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package sinavdenemeverikaydi;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DbAccess {
    Connection conn;
    Statement s;
    String createTable;
    String tableName;
    String database;
   DbAccess()
    {
//openConnection();
    }
   //Create Table
  /* public void CreatTable(){

            tableName = "myTable" + String.valueOf((int)(Math.random() * 1000.0));
            createTable = "CREATE TABLE " + tableName + " (id Integer, name Text(32))";
        try { 
            s.execute(createTable);
        } catch (SQLException ex) {
            Logger.getLogger(DbAccess.class.getName()).log(Level.SEVERE, null, ex);
        }
   }
     // enter value into table         
     public void addData(){
              String addRow = "INSERT INTO " + tableName + " VALUES ( " + 
              String.valueOf((int) (Math.random() * 32767)) + ", 'Text Value " + 
              String.valueOf(Math.random()) + "')";
        try {
            s.execute(addRow);
        } catch (SQLException ex) {
            Logger.getLogger(DbAccess.class.getName()).log(Level.SEVERE, null, ex);
        }
            }
     // Fetch table
         public void fetchTable(){
        try {
      String selTable = "SELECT * FROM " + tableName;       
            s.execute(selTable);
            ResultSet rs = s.getResultSet();
            while((rs!=null) && (rs.next()))
            {
                System.out.println(rs.getString(1) + " : " + rs.getString(2));
            }
        } catch (SQLException ex) {
            Logger.getLogger(DbAccess.class.getName()).log(Level.SEVERE, null, ex);
        }
         }
   // drop the table   
         public void dropTable(){
           String dropTable = "DROP TABLE " + tableName;
        try {
            s.execute(dropTable);
        } catch (SQLException ex) {
            Logger.getLogger(DbAccess.class.getName()).log(Level.SEVERE, null, ex);
        }
         }*/
   //Open Connection
   public void openDatabase(){
           try
        {
            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
            database = "jdbc:odbc:Driver={Microsoft Access Driver (*.mdb)};DBQ=myDB.mdb;";
            conn = DriverManager.getConnection(database, "", "");
             s = conn.createStatement();
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }
   }
         // close and cleanup
         public void closeDatabase(){           
        try {
            s.close();
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(DbAccess.class.getName()).log(Level.SEVERE, null, ex);
        }
         }
}
