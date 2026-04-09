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
	String pname = request.getParameter("txtName");
	String loc = request.getParameter("txtLoc");
	
	session.setAttribute("pname", pname);
	session.setAttribute("location", loc);
	
	response.sendRedirect("Page3.jsp");
%>

</body>
</html>