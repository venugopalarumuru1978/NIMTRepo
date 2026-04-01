package com.jdbcpack;
// program for Database Connection
import java.sql.*;
public class DbConn {

	public static void main(String[] args) throws SQLException 
	{
		try {
			Class.forName("com.mysql.cj.jdbc.Driver"); // driver is loaded
			Connection conObj = DriverManager.getConnection("jdbc:mysql://localhost:3306/NIMTDB","root", "root");
			
			if(conObj!=null)
				System.out.println("Db Connected...");
			
		} catch (Exception e) {
			System.out.println(e);
		}
			
	}

}
