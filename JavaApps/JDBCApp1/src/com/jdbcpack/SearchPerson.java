package com.jdbcpack;
import java.sql.*;
import java.util.Scanner;

public class SearchPerson {

	public static void main(String[] args) throws SQLException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Phone Number to search person");
		String ph = sc.next();
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver"); // driver is loaded
			Connection conObj = DriverManager.getConnection("jdbc:mysql://localhost:3306/NIMTDB","root", "root");

			PreparedStatement ps_stmt = conObj.prepareStatement("SELECT * FROM PERSON WHERE PHONE=?");
			ps_stmt.setString(1, ph);
			ResultSet rsObj = ps_stmt.executeQuery();
			
			if(rsObj.next())
			{
				System.out.println("Person Name : " + rsObj.getString("pname"));
				System.out.println("Person Email : " + rsObj.getString("email"));
			}
			else
				System.out.println("No Person exist with given phone number");
			
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
