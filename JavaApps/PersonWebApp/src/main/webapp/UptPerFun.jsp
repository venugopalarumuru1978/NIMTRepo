<%@page import="com.personapp.DAL.PersonOperations"%>
<%@page import="com.personapp.entities.Person"%>
<%
String pid = request.getParameter("txtPid");
String pname = request.getParameter("txtPname");
String email = request.getParameter("txtEmail");
String phone = request.getParameter("txtPh");

Person person = new Person();
person.setPid(Integer.parseInt(pid));
person.setPname(pname);
person.setEmail(email);
person.setPhone(phone);

PersonOperations pop = new PersonOperations();
pop.UpdatePerson(person);

response.sendRedirect("ViewAllPersons.jsp");

%>