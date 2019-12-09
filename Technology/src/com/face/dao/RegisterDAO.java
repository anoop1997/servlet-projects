package com.face.dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import javax.xml.ws.Response;

import com.face.bo.RegisterBO;

public class RegisterDAO {
	
	public static void save(Connection connection, RegisterBO bo ) throws SQLException
	
	{
		Statement s=connection.createStatement();
		
		String query="insert into register(username,password,mnumber,date) values('"+bo.getUname()+"','"+bo.getPass()+"','"+bo.getMob()+"','"+bo.getDate()+"')";
		
		int  result=s.executeUpdate(query);
		
		
		if(result==1)
		{
			System.out.println("inserted Successfully");
			 
		}
		else
			System.out.println("Sorry not inserted");
		
	}
}
