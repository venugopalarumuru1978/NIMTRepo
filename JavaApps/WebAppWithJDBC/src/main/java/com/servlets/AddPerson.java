package com.servlets;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.connections.DBConnection;

/**
 * Servlet implementation class AddPerson
 */
@WebServlet("/AddPerson")
public class AddPerson extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddPerson() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String pid = request.getParameter("txtPid");
		String pname = request.getParameter("txtPname");
		String email = request.getParameter("txtEmail");
		String phone = request.getParameter("txtPh");
		
		//System.out.println(pid + pname + email + phone);
		// jdbc program
		try {
			Connection  conObj = DBConnection.getConnection();
			PreparedStatement  ps = conObj.prepareStatement("insert into person(pid, pname, email, phone) value(?,?,?,?)");
			ps.setInt(1, Integer.parseInt(pid));
			ps.setString(2, pname);
			ps.setString(3, email);
			ps.setString(4, phone);
			ps.executeUpdate();
			response.sendRedirect("ViewAllPersons");
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		} 		
	}
}
