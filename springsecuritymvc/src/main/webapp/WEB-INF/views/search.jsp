<%@page import="com.bcits.springsecuritymvc.beans.EmpInfoBean"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<% EmpInfoBean empInfo = (EmpInfoBean) request.getAttribute("empInfo") ; %>
<jsp:include page="index.jsp"></jsp:include>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<div align="center">
		<fieldset style="width: 60%">
			<legend>Serach emp</legend>
			<form action="./getEmployee">
				Employee Id:<input type="text" name="empId" required="required">
				<input type="submit" value="Search">
			</form>
		</fieldset>
		<% 
if(empInfo != null) { %>
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
				<tr>
					<td><%=empInfo.getEmpId() %></td>
					<td><%=empInfo.getName() %></td>
					<td><%=empInfo.getPassword() %></td>
					<td><%=empInfo.getRole() %></td>
				</tr>


			</tbody>
		</table>
		<% } else { %>
		<h3>employee not found</h3>
		<% } %>
	</div>
</body>
</html>