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
	response.sendRedirect("Page3.jsp?person_name=" + pname + "&location=" + loc);
%>

</body>
</html>