<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <% String password = (String) request.getAttribute("pwd");
    int empId =(Integer) request.getAttribute("empId"); %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
Employee Id <%=empId  %><br>
Password = <%=password %>
<h1></h1>
</body>
</html>