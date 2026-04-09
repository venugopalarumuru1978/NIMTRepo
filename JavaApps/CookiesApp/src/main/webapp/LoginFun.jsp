<%
String uname = request.getParameter("txtUname");
String pass = request.getParameter("txtPass");

if(uname.equals("Venugopal") && pass.equals("v@123"))
{
	// Cookie Creation
	Cookie ckObj = new Cookie("user", uname);
	ckObj.setMaxAge(10000); //1000 milli seconds = 1sec
	response.addCookie(ckObj);
	
	RequestDispatcher rd = request.getRequestDispatcher("WelcomePage.jsp");
	//RequestDispatcher rd = request.getRequestDispatcher("http://www.google.co.in/");
    rd.forward(request, response);
	//response.sendRedirect("http://www.google.co.in/");	
}
else
{
	RequestDispatcher rd = request.getRequestDispatcher("ErrorPage.jsp");
    rd.include(request, response);
	//response.sendRedirect("ErrorPage.jsp");
}

%>