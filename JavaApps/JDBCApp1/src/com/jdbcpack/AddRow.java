package com.jdbcpack;
import java.sql.*;

public class AddRow {

	public static void main(String[] args) throws SQLException {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver"); // driver is loaded
			Connection conObj = DriverManager.getConnection("jdbc:mysql://localhost:3306/NIMTDB","root", "root");
			
			Statement  stmt = conObj.createStatement();
			stmt.executeUpdate("INSERT INTO PERSON(PID, PNAME, EMAIL, PHONE) VALUES(101, 'Pavan Kumar', 'pavan@gmail.com', '9090812345')");
			System.out.println("Row is Added....");
			
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
