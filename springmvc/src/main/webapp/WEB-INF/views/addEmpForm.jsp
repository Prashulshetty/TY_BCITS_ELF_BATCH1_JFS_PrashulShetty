<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
 <jsp:include page="header.jsp"></jsp:include>
<% String errMsg = (String) request.getAttribute("errMsg");
 String msg = (String) request.getAttribute("msg"); %>%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<br>
	<br>
<% if(errMsg != null && !errMsg.isEmpty()){ %>
<h2 style="color: red;" align="center"><%= errMsg %></h2>
<%} %>
<% if(msg != null && !msg.isEmpty()){ %>
<h2 style="color: red;" align="center"><%= msg %></h2>
<%} %>
	
	<fieldset style="width: 500px">
		<legend>Add Employee Record</legend>
		<form action="./addEmployee" method="post">
			<table>
				<tr>
					<td>Employee ID</td>
					<td><input type="number" name="empId" required></td>
				</tr>

				<tr>
					<td>Employee Name</td>
					<td><input type="text" name="name" required></td>
				</tr>

				<tr>
					<td>Designation</td>
					<td><input type="text" name="designation" required></td>
				</tr>

				<tr>
					<td>Date Of Joining</td>
					<td><input type="date" name="birthDate" required></td>
				</tr>

				<tr>
					<td>Salary</td>
					<td><input type="number" name="salary" required></td>
				</tr>
				<tr>
					<td>Mobile Number</td>
					<td><input type="tel" name="mobileNum" required></td>
				</tr>
				<tr>
					<td>Password</td>
					<td><input type="password" name="password" required></td>
				</tr>
				<tr>
					<td><input type="submit" value="ADD"
						style="margin-left: 98px; width: 100px"></td>
				</tr>
			</table>
		</form>
	</fieldset>
<br> <br>
</body>
</html>
<jsp:include page="footer.jsp"></jsp:include>