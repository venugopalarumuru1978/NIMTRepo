package com.connections;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {

	public static Connection getConnection() throws SQLException
	{
		Connection conObj = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver"); // driver is loaded
			conObj = DriverManager.getConnection("jdbc:mysql://localhost:3306/NIMTDB","root", "root");			
		} catch (Exception e) {
			// TODO: handle exception
			conObj = null;
			System.out.println(e);
		}
		return conObj;
	}
}
