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
	String pname = request.getParameter("person_name");
	String loc = request.getParameter("location");
%>
<h1>Given Name : <%=pname %></h1>
<h1>Location : <%=loc %></h1>
</body>
</html>