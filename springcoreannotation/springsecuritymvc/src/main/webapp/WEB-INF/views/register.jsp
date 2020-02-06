<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<% String errMsg = (String) request.getAttribute("errMsg");
 String msg = (String) request.getAttribute("msg"); %>
<jsp:include page="index.jsp"></jsp:include>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<fieldset>
		<legend>Register</legend>
		<form action="./register" method="post">
			<table>
				<tr>
					<td>EmpId</td>
					<td>:</td>
					<td><input type="number" name="empId" required="required"></td>
				</tr>
				<tr>
					<td>Password</td>
					<td>:</td>
					<td><input type="password" name="password" required="required"></td>
				</tr>
				<tr>
					<td>Name</td>
					<td>:</td>
					<td><input type="text" name="name" required="required"></td>
				</tr>
				<tr>
					<td>Role</td>
					<td>:</td>
					<td><input type="radio" name="role" value="ROLE_ADMIN">admin</td>
				</tr>
				<tr>
					<td></td>
					<td>:</td>
					<td><input type="radio" name="role" value="ROLE_USER">user</td>
				</tr>
				<tr>
					<td colspan="3" align="center"><input type="submit"
						value="Register"></td>
			</table>
		</form>

	</fieldset>
	<div align="center">
	<%
		if (errMsg != null && !errMsg.isEmpty()) {
	%>
	<h2 style="color: red; align="center"><%=errMsg%></h2>
	<%
	}
	%>
	<%
		if (msg != null && !msg.isEmpty()) {
	%>
	<h2 style="color: green;" align="center"><%=msg%></h2>
	<%} %>
	</div>
</body>
</html>