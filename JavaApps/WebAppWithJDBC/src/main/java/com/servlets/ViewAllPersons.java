package com.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.connections.DBConnection;

/**
 * Servlet implementation class ViewAllPersons
 */
@WebServlet("/ViewAllPersons")
public class ViewAllPersons extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ViewAllPersons() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		out.print("<h1 style='text-align: center'>View All Persons</h1>");
		out.print("<hr /><p style='text-align:center'>");
		out.print("<a href='AddPerson.html'>New Person</a>");
		out.print("&nbsp;&nbsp;|&nbsp;&nbsp;");
		out.print("<a href='ViewAllPersons'>All Persons Info</a>");
		out.print("&nbsp;&nbsp;|&nbsp;&nbsp;");
		out.print("<a href='Search.html'>Search Person</a>");
		out.print("<hr /></p>");
		
		try {
			Connection conObj = DBConnection.getConnection();
			PreparedStatement ps_stmt = conObj.prepareStatement("SELECT * FROM PERSON");
			ResultSet rsObj = ps_stmt.executeQuery();
			
			out.print("<table width='100%' border='1'>");
			out.print("<tr><th>Person ID</th><th>Person Name</th><th>Person Email</th><th>Person Phone</th></tr>");
			
			while(rsObj.next())
			{
				out.print("<tr>");
				out.print("<td>" + rsObj.getInt("pid") + "</td>");
				out.print("<td>" + rsObj.getString("pname") + "</td>");
				out.print("<td>" + rsObj.getString("email") + "</td>");
				out.print("<td>" + rsObj.getString("phone") + "</td>");
				out.print("</tr>");
			}
			
			out.print("</table>");
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
	}
}
