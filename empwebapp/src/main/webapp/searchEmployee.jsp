<%@page import="com.bcits.empwebapp.bean.PrimaryInfo"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <% PrimaryInfo employeePrimaryInfo =(PrimaryInfo) request.getAttribute("empInfo"); %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<fieldset>
		<legend>Search Employee</legend>
		<form action="./getEmp">
		<label>Employee Id :</label>
		<input type="text" name="empId" required>
		&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
		<input type="submit" value="Search" >		
		</form>
	</fieldset>
	
	<% if(employeePrimaryInfo != null) {  %><br>
	Name = <%= employeePrimaryInfo.getName() %><br>
	Salary = <%= employeePrimaryInfo.getSalary() %><br>
	designation = <%= employeePrimaryInfo.getDesignation() %><br>
	
	<% } else { %>
	<h2 style="color:red;">Employee ID not found</h2>
<% }  %>

</body>
</html>