<%@page import="java.nio.channels.SeekableByteChannel"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>


<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<spring:url var="css" value="/resources/css" />
<spring:url var="js" value="/resources/js" />

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>employee home page</title>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">
<link rel="stylesheet"
	href="./resources/fontawesome-free-5.12.0-web/css/all.css">
</head>
 <jsp:include page="header.jsp"></jsp:include>
<body style=" background-color : lightblue">
<div class="row" >
  <div class="col-3" ><br>
   <div class="list-group" style="text-align: center;font: bold;font-size: 20px;margin-left: 40px;margin-right: ">
  <a href="#" class="list-group-item list-group-item-action active"> Employee Detais</a>
  <a href="#" class="list-group-item list-group-item-action">Generate Bill</a>
  <a href="#" class="list-group-item list-group-item-action">See All Bills</a>

</div>
  </div>

	</div>

	 <jsp:include page="footer.jsp"></jsp:include>
	
</body>
</html>