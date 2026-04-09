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
Cookie  ck[] = request.getCookies();
for(Cookie c : ck)
{
	if(c.getName().equals("user"))
	{
%>
<img src="Pics/slide-2.jpg" width="100%" height="200px" alt="None" />
<h2>Welcome to : <%= c.getValue() %></h2>
<%
}
}
%>
<hr />
</body>
</html>