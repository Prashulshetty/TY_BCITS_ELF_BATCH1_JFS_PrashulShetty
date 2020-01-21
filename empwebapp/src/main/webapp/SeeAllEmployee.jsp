<%@page import="com.bcits.empwebapp.bean.PrimaryInfo"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <% List<PrimaryInfo> employeeList =(List<PrimaryInfo>) request.getAttribute("employeeList"); %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<% if(employeeList != null) {  %><br>
<table border="1" style="width: 80%">
<thead style="background: navy;color: white;">
<tr style="height: 35px">
<th>EmployeeId</th>
<th>Name</th>
<th>Salary</th>
<th>Designation</th>
<th>Mobile</th>
</tr>
<thead>
<tbody>
<% for (PrimaryInfo empInfo :employeeList) {  %><br>
<tr style="height: 25px">
<td><%=empInfo.getEmpId() %></td>
<td><%=empInfo.getName()%></td>
<td><%=empInfo.getSalary()%></td>
<td><%=empInfo.getDesignation()%></td>
<td><%=empInfo.getMobileNum()%></td>
</tr>
<% }  %>
</tbody>

</table>

<% } else { %>
	<h2 style="color:red;">No records for display..</h2>
<% }  %>
</body>
</html>