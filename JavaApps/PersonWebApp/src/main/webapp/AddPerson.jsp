<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1 style="text-align:center">Add New Person Details</h1>
<hr />
<jsp:include page="Links.jsp"/>
<form  name="frmReg" method="post" action="AddPersonFun.jsp">
<p style="text-align: center">
<label>Person ID</label><br />
<input type="text"  name="txtPid"  placeholder="Person ID" />
<br /><label>Person Name</label><br />
<input type="text"  name="txtPname"  placeholder="Person Name" />
<br /><label>Person Email</label><br />
<input type="email"  name="txtEmail"  placeholder="Person Email" />
<br /><label>Person Phone</label><br />
<input type="text"  name="txtPh"  placeholder="Person Phone" />
<br /><br />
<input type="submit"   value="Add New Person" />
</p>
</form>

</body>
</html>