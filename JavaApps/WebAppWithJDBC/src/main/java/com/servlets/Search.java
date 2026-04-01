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
 * Servlet implementation class Search
 */
@WebServlet("/Search")
public class Search extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Search() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		String pid = request.getParameter("txtPid");
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		try {
			Connection conObj = DBConnection.getConnection();
			PreparedStatement ps_stmt = conObj.prepareStatement("SELECT * FROM PERSON WHERE PID=?");
			ps_stmt.setInt(1, Integer.parseInt(pid));
			ResultSet rsObj = ps_stmt.executeQuery();
			
			if(rsObj.next())
			{			
				out.print("<table width='100%' border='1'>");
				out.print("<tr><th>Person ID</th><th>Person Name</th><th>Person Email</th><th>Person Phone</th></tr>");			
				out.print("<tr>");
				out.print("<td>" + rsObj.getInt("pid") + "</td>");
				out.print("<td>" + rsObj.getString("pname") + "</td>");
				out.print("<td>" + rsObj.getString("email") + "</td>");
				out.print("<td>" + rsObj.getString("phone") + "</td>");
				out.print("</tr>");
				out.print("</table>");
			}
			else
			{
				out.print("<h1 style='text-align: center'>Person Not Found with given ID</h1>");
			}
			out.print("<h2 style='text-align: center'><a href='Search.html'>Back</a></h2>");
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
	}

}
