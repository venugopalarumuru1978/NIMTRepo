<%@page import="com.personapp.DAL.PersonOperations"%>
<%
String pid = request.getParameter("pno");

PersonOperations pop = new PersonOperations();
pop.DeletePerson(Integer.parseInt(pid));
response.sendRedirect("ViewAllPersons.jsp");

%>