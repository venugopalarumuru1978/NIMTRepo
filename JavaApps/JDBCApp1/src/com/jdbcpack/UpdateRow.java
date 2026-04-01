package com.jdbcpack;
import java.sql.*;
import java.util.Scanner;

public class UpdateRow {

	public static void main(String[] args) throws SQLException {
		PreparedStatement  ps_stmt = null;
		Scanner sc = new Scanner(System.in);
		System.out.println("Person ID");
		int pno = sc.nextInt();
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver"); // driver is loaded
			Connection conObj = DriverManager.getConnection("jdbc:mysql://localhost:3306/NIMTDB","root", "root");
			
			ps_stmt = conObj.prepareStatement("SELECT * FROM PERSON WHERE PID=?");			
			ps_stmt.setInt(1, pno);
			ResultSet rsObj = ps_stmt.executeQuery();
			
			if(rsObj.next())
			{
				System.out.println("Present name of Person : " + rsObj.getString("pname"));
				System.out.println("Enter new name of the person");
				String pname = sc.next();
				ps_stmt = conObj.prepareStatement("UPDATE PERSON SET PNAME=? WHERE PID=?");
				ps_stmt.setString(1, pname);
				ps_stmt.setInt(2, pno);
				ps_stmt.executeUpdate();
				System.out.println("Person Name is Updated...");
			}
			else
				System.out.println("No Person existed with given id");
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
