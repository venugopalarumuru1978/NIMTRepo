<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
String uname  = null;
if(session.getAttribute("uname")!=null)
{
	uname = (String)session.getAttribute("uname");
}
else
	response.sendRedirect("LoginPage.jsp");
%>
<h1>Welcome to <%=uname %>
&nbsp;&nbsp;&nbsp;&nbsp;|&nbsp;&nbsp;&nbsp;&nbsp;
<a href="LogoutPage.jsp">Logout</a>
</h1>
<hr />
</body>
</html>