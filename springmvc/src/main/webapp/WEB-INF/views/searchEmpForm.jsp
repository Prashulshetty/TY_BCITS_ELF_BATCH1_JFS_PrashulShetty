<%@page import="com.bcits.springmvc.beans.EmployeeInfoBean"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <% String empId = (String) request.getAttribute("empId"); %>
    <% EmployeeInfoBean employeeInfoBean = (EmployeeInfoBean) request.getAttribute("employeeInfoBean") ;
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
		<legend>Search Employee</legend>
		<form action="./search" >

			<table>
				<tr>
				
					<td>Employee ID</td>
					<td>:</td>
					<td><input type="text" name="empId" required="required"></td>
				</tr>
				
				<tr>
					<td colspan="3" align="center"><input type="submit"></td>
				</tr>
			</table>
		</form>
	</fieldset>
</body>
</html>
<% if(errMsg != null && !errMsg.isEmpty()) {%>
<h3 style=" color: red"><%=errMsg %></h3>
<%} %>
<% if(employeeInfoBean != null) { %>
<div align="center">
<table border="1" style="width: 70%">
<tr style="background: navy;color: white;">
<th>Employee Id</th>
<th>Name</th>
<th>Designation</th>
<th>salary</th>
<th>DOB</th>
<th>Mobile</th>
</tr>
<tr>
<td><%=employeeInfoBean.getEmpId() %></td>
<td><%=employeeInfoBean.getName() %></td>
<td><%=employeeInfoBean.getDesignation() %></td>
<td><%=employeeInfoBean.getSalary() %></td>
<td><%=employeeInfoBean.getBirthDate() %></td>
<td><%=employeeInfoBean.getMobileNum() %></td>
</tr>

</table></div>
<% } %>


<jsp:include page="footer.jsp"></jsp:include>