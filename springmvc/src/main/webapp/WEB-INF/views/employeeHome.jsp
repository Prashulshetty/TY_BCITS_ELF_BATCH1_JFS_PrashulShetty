<%@page import="com.bcits.springmvc.beans.EmployeeInfoBean"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <% EmployeeInfoBean employeeInfoBean =(EmployeeInfoBean) session.getAttribute("loggedInEmpInfo"); %>
    <<jsp:include page="header.jsp"></jsp:include>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Employee Management Portal</title>
</head>
<body>
<h1 style="color: purple;">welcome <%=employeeInfoBean.getName() %></h1>
</body>
</html>
<jsp:include page="footer.jsp"></jsp:include>