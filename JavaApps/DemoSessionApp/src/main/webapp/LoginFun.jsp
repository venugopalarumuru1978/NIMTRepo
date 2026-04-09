<%
String uname = request.getParameter("txtUname");
String pass = request.getParameter("txtPass");

if(uname.equals("Venugopal") && pass.equals("v@123"))
{
	session.setAttribute("uname", uname);
	response.sendRedirect("WelcomePage.jsp");	
}
else
{
	response.sendRedirect("ErrorPage.jsp");
}

%>