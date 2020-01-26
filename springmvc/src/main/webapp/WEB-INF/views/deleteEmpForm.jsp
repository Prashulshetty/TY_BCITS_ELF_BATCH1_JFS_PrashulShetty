<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <% String msg = (String) request.getAttribute("msg");
    String errMsg = (String) request.getAttribute("errMsg");
    %>
    <jsp:include page="header.jsp"></jsp:include>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<fieldset>
		<legend>delete Employee</legend>
		<form action="./delete" >

			<table>
				<tr>
				
					<td>Employee ID</td>
					<td>:</td>
					<td><input type="text" name="empId" required="required"></td>
				</tr>
				
				<tr>
					<td colspan="3" align="center"><input type="submit" value="Delete"></td>
				</tr>
			</table>
		</form>
	</fieldset>
</body>
</html>
<% if(errMsg != null && !errMsg.isEmpty()) {%>
<h3 style=" color: red"><%=errMsg %></h3>
<%} %>
<% if(msg != null && !msg.isEmpty()) {%>
<h3 style=" color: red"><%=msg %></h3>
<%} %>

<jsp:include page="footer.jsp"></jsp:include>