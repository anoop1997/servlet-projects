package com.face.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.face.bo.loginBO;

public class LoginDAO {
	
	boolean status=false;
	
	public static boolean  acess(Connection connection,loginBO obj) throws SQLException 
	
	{boolean status=false;
    Statement st = null;
    try {
        st = connection.createStatement();
    } catch (SQLException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
    }
    String qry="SELECT * FROM  where username='"+obj.getUname()+"' AND password='"+obj.getPass()+"'";
    
        ResultSet rs=st.executeQuery(qry);
         if(rs.next()){
               System.out.println("LoginSucess");
               
              obj.setUname(rs.getString("username"));
              obj.setPass(rs.getString("password"));
              obj.setMN(rs.getInt("mnumber"));
              obj.setDate(rs.getString("date"));
              status=true;
              
              
         }
         else
         {
             System.out.println("LoginSucess failed");
         }
        return status;
        
        
    }
	  
	
	
	
	
	
	
	

	
}
