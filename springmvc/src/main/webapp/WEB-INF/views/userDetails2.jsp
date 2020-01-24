<%@page import="com.bcits.springmvc.container.UserBean"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <% UserBean userBean = (UserBean) request.getAttribute("userBean");
     String name =(String)request.getAttribute("name"); %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
user  Id <%= userBean.getEmpId()  %><br>
Password = <%=userBean.getPassword() %><br>
Name = <%=name %>
<h1></h1>
</body>
</html>