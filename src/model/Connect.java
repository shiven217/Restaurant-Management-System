/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Ankit
 */
public class Connect {
    private Connection con=null;
    private Statement st=null;
    String ConnectionUrl="jdbc:derby://localhost:1527/Restaurant";
    public Statement createConnection(){
    try{
        try{
            Class.forName("org.apache.derby.jdbc.ClientDriver");
        }
        catch(ClassNotFoundException ex){
        Logger.getLogger(Connect.class.getName()).log(Level.SEVERE, null,ex);
       }
        System.out.println("Ddriver okay");
        Connection con=DriverManager.getConnection(ConnectionUrl,"ankit","ankit");
        st=con.createStatement();
        System.out.println("Connection made");
    }
    catch(SQLException sQLException){
    
    System.out.println(sQLException);
    
    }
    return st;
    
    
    }

    
}