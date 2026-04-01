<%@page import="com.personapp.DAL.PersonOperations"%>
<%@page import="com.personapp.entities.Person"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1 style="text-align:center">View All Persons</h1>
<hr />
<jsp:include page="Links.jsp"/>
<%
	PersonOperations pop = new PersonOperations();
	List<Person>  plist = pop.ViewAll();
%>

<table width="100%"  border="1">
<tr>
<th>Person ID</th>
<th>Person Name</th>
<th>Person Email</th>
<th>Person Phone</th>
<th>Operations</th>
</tr>
<%
for(Person p : plist)
{
%>
  <tr>
  	<td><%=p.getPid() %>  </td>
  	<td><%=p.getPname() %>  </td>
  	<td><%=p.getEmail() %>  </td>
  	<td><%=p.getPhone() %>  </td>
  	<td>
  		<a href="DelPerson.jsp?pno=<%=p.getPid() %>">Delete Person</a>
  		&nbsp;&nbsp;&nbsp;|&nbsp;&nbsp;&nbsp;
  		<a href="UpdatePerson.jsp?pno=<%=p.getPid() %>">Update Person</a>  		
  	</td>
  </tr>
<%
}
%>
</table>
</body>
</html>