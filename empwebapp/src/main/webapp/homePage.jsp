<%@page import="com.bcits.empwebapp.bean.PrimaryInfo"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <% PrimaryInfo empInfo =(PrimaryInfo) session.getAttribute("loggedInEmpInfo"); %>
    <jsp:include page="header.jsp"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Welcome <%=empInfo.getName() %></h1>
</body>
</html>