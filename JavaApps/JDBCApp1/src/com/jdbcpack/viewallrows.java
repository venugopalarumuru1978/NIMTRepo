package com.jdbcpack;
import java.sql.*;

public class viewallrows {

	public static void main(String[] args) throws SQLException {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver"); // driver is loaded
			Connection conObj = DriverManager.getConnection("jdbc:mysql://localhost:3306/NIMTDB","root", "root");

			PreparedStatement ps_stmt = conObj.prepareStatement("SELECT * FROM PERSON");
			ResultSet rsObj = ps_stmt.executeQuery();
			
			while(rsObj.next())
			{
				System.out.println("Person ID : " + rsObj.getInt("pid"));
				System.out.println("Person Name : " + rsObj.getString("pname"));
				System.out.println("Person Email : " + rsObj.getString("email"));
				System.out.println("Person Phone : " + rsObj.getString("phone"));
				System.out.println("-----------");
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
