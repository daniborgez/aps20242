/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pokedex.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


/**
 *
 * @author danie
 */
public class ConnectionMVC {
   public Connection getConnection(){
        Connection conn = null; 
        
        try{
            Class.forName("com.mysql.jdbc.Driver");
            
        }catch(ClassNotFoundException e ){
            e.printStackTrace();
        }
        
        try{
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mvc?useSSL=false", "root","0000");
        }catch(SQLException e){
           e.printStackTrace();
        }
        
        return conn;
    }
}
