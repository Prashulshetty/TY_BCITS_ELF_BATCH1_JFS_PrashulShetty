<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%  
   String errMsg =(String) request.getAttribute("errMsg");
   %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<% if(errMsg != null && !errMsg.isEmpty()) {%>
<h3 style=" color: red"><%=errMsg %></h3>
<%} %>
	<fieldset>
		<legend>Employee Login Form</legend>
		<form action="./login" method="post">

			<table>
				<tr>
					<td>Employee ID</td>
					<td>:</td>
					<td><input type="text" name="empId"></td>
				</tr>
				<tr>
					<td>Password</td>
					<td>:</td>
					<td><input type="password" name="password"></td>
				</tr>
				
				<tr>
					<td colspan="3" align="center"><input type="submit" value="login"></td>
				</tr>
			</table>
		</form>
	</fieldset>
</body>
</html>
<jsp:include page="footer.jsp"></jsp:include>