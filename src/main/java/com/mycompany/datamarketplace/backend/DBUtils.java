
package com.mycompany.datamarketplace.backend;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author kashyabmurali
 */
public class DBUtils {
    public static Connection createConnection(){
        
        Connection con=null;
        final String DB_URL ="jdbc:mysql://localhost:3306/test_aed";
        final String DB_USER = "root";
        final String DB_PASSWD = "Kashyab@19";
        try { 
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            System.out.println("DB connection not success");
        }
        try
         {
            
            con=DriverManager.getConnection(DB_URL,DB_USER,DB_PASSWD);
            System.out.println("Connection Successful");
         }
        catch (Exception e){
            System.out.println(e);
            }
        return con;
    }
    
    public static void main(String args[]){
        try{
        Connection con=createConnection();
        Statement statement=con.createStatement();
        ResultSet resultSet=statement.executeQuery("SELECT * from test_table");
        while(resultSet.next()){
            System.out.println(resultSet.getString("test_name"));
        }
        
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
