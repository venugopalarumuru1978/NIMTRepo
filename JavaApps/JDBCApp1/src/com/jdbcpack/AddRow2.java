package com.jdbcpack;
import java.sql.*;
import java.util.Scanner;

public class AddRow2 {

	public static void main(String[] args) throws SQLException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Person ID");
		int pno = sc.nextInt();
		
		System.out.println("Person Name ");
		String pname = sc.next();
		
		System.out.println("Person Email ");
		String email = sc.next();

		System.out.println("Person Phone ");
		String ph = sc.next();

		try {
			Class.forName("com.mysql.cj.jdbc.Driver"); // driver is loaded
			Connection conObj = DriverManager.getConnection("jdbc:mysql://localhost:3306/NIMTDB","root", "root");
			
			PreparedStatement  ps_stmt = conObj.prepareStatement("INSERT INTO PERSON(PID, PNAME, EMAIL, PHONE) VALUES(?,?,?,?)");
			
			ps_stmt.setInt(1, pno);
			ps_stmt.setString(2, pname);
			ps_stmt.setString(3, email);
			ps_stmt.setString(4, ph);
			ps_stmt.executeUpdate();
			
			System.out.println("Row is Added....");
			
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
