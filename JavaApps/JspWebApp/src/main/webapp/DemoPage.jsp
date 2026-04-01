<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%@ page import="java.util.*" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1 style="text-align:center">JSP Page</h1>
<hr />
<%
String sname ="This is JSP Session";
int x = 100;
float y = 12.45f;
List<String> strlst = new ArrayList<String>();
strlst.add("hello");
strlst.add("bye");
%>
<h2>Text Info : <%=sname %></h2>
<h2>X value is : <%=x %></h2>
<h2>Y value is : <%=y %></h2>
<h2>SUM value is : <%=(x+y) %></h2>

<h2><%=strlst %></h2>

<%
for(String s : strlst)
{
%>
<h1><%=s %></h1>
<%
} 
%>
<hr />
<jsp:include page="TestPage.jsp"/>
</body>
</html>