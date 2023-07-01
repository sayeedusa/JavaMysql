/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employee;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author sayee
 */
public class DBUtil {
    public static Connection con=null;
    public static Connection getConnection(){
        if(con!=null){
            return con;
        }else{
          try{
           Class.forName("com.mysql.jdbc.Driver");
    con=DriverManager.getConnection("jdbc:mysql://localhost:3306/employee","root","Admin123");
        }catch(ClassNotFoundException cnle){
            cnle.printStackTrace();
        }catch(SQLException sqle){
         sqle.printStackTrace();
         } 
          return con;
        }
    }
}