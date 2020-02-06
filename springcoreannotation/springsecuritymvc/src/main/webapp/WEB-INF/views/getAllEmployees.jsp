<%@page import="com.bcits.springsecuritymvc.beans.EmpInfoBean"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <% List<EmpInfoBean> employeeList= (List<EmpInfoBean>) request.getAttribute("employeeList");%>
        <jsp:include page="header.jsp"></jsp:include>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>See All Employee</title>
</head>
<body>
<div align="center">
	<%
		if (employeeList != null && !employeeList.isEmpty()) {%>
			<table>
			<thead>
				<tr style="background: navy; color: white;">
					<th>Emp Id</th>
					<th>Name</th>
					<th>Password</th>
					<th>Role</th>
				</tr>
			</thead>
			<tbody>
			<% for(EmpInfoBean empInfo: employeeList) { %>
				<tr>
					<td><%=empInfo.getEmpId() %></td>
					<td><%=empInfo.getName() %></td>
					<td><%=empInfo.getPassword() %></td>
					<td><%=empInfo.getRole() %></td>
				</tr>
<% } %>

			</tbody>
		</table>

	<%
		} else {
	%>
	<h2 style="color: green;" align="center">No records for display</h2>
	<%} %>
	</div>
</body>
</html>