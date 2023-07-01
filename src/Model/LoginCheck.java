/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import employee.DBUtil;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author sayee
 */
public class LoginCheck {
    
    public static boolean ValidateUser(String uName, String uPass) throws SQLException{
       Connection conn;
        PreparedStatement ps=null;
        conn=DBUtil.getConnection();
        System.out.println("Validate User" +uName);
        String user=uName;
        try{
            ps=conn.prepareStatement("select * from logintable where empname=? and password=?");
            System.out.println(ps.toString());
            ps.setString(1, user);
            ps.setString(2, uPass);
            System.out.println(ps.toString());
            ResultSet rs=ps.executeQuery();
            String oUsername="";
            String oPassword="";
            while(rs.next()){
                oUsername=rs.getString("empname");
                oPassword=rs.getString("password");
            }
            if(oUsername.equals(uName) && oPassword.equals(uPass)){
                rs.close();
                return true;
                
            }else{
                System.out.println("Not Found");
            }
        }catch (Exception ex){ 
            
        }
        return false;
    }
    
}
