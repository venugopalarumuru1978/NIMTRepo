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

<%
String pid = request.getParameter("pno");
PersonOperations  pop = new PersonOperations();
Person pObj = pop.SearchPersonBasedID(Integer.parseInt(pid));
%>

<h1 style="text-align:center">Modify Person Details</h1>
<hr />
<h2 style="text-align:center"><a href="ViewAllPersons.jsp">Back</a></h2>
<hr />
<form  name="frmMod" method="post" action="UptPerFun.jsp">
<p style="text-align: center">
<label>Person ID</label><br />
<input type="text"  name="txtPid"  value='<%=pObj.getPid() %>' />
<br /><label>Person Name</label><br />
<input type="text"  name="txtPname"  value='<%=pObj.getPname() %>' />
<br /><label>Person Email</label><br />
<input type="email"  name="txtEmail"  value='<%=pObj.getEmail() %>' />
<br /><label>Person Phone</label><br />
<input type="text"  name="txtPh"  value='<%=pObj.getPhone() %>' />
<br /><br />
<input type="submit"   value="Modify Person" />
</p>
</form>

</body>
</html>