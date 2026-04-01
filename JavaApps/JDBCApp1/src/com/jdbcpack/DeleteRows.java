package com.jdbcpack;
import java.sql.*;
import java.util.Scanner;

public class DeleteRows {

	public static void main(String[] args) throws SQLException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Person ID");
		int pno = sc.nextInt();
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver"); // driver is loaded
			Connection conObj = DriverManager.getConnection("jdbc:mysql://localhost:3306/NIMTDB","root", "root");
			
			PreparedStatement  ps_stmt = conObj.prepareStatement("DELETE FROM PERSON WHERE PID=?");			
			ps_stmt.setInt(1, pno);
			ps_stmt.executeUpdate();
			
			System.out.println("Row is DELETED....");
			
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
