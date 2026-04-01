<%@page import="com.personapp.entities.Person"%>
<%@page import="com.personapp.DAL.PersonOperations"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1 style="text-align:center">Search Person Details</h1>
<hr />
<jsp:include page="Links.jsp"/>
<form  name="frmSearch" method="post" action="SeachPerson.jsp">
<p style="text-align: center">
<label>Person ID</label>
&nbsp;&nbsp;
<input type="text"  name="txtPh"  placeholder="Person Phone Number" />
&nbsp;&nbsp;
<input type="submit"  value="Search" />
</p>
</form>

<%
String ph = request.getParameter("txtPh");
PersonOperations pop = new PersonOperations();
Person pObj = pop.SearchPersonBasedOnPhone(ph);
if(pObj!=null)
{
%>
<table width="100%"  border="1">
<tr>
<th>Person ID</th>
<th>Person Name</th>
<th>Person Email</th>
<th>Person Phone</th>
</tr>
<tr>
<td><%=pObj.getPid() %>  </td>
<td><%=pObj.getPname() %>  </td>
<td><%=pObj.getEmail() %>  </td>
<td><%=pObj.getPhone() %>  </td>
</tr>
</table>
<%
}
else
{
%>
<h2 style="text-align:center;color:red">Person Not Found with given Phone Number</h2>
<%
}
%>
</body>
</html>