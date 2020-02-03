<%@page import="com.bcits.usecase.beans.MonthlyConsumption"%>
<%@page import="java.util.List"%>
<%@page import="java.text.SimpleDateFormat"%>

<%@page import="java.nio.channels.SeekableByteChannel"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<% List<MonthlyConsumption> monthlyCons = (List<MonthlyConsumption>) request.getAttribute("monthlyConsumption"); %> 

<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<spring:url var="css" value="/resources/css" />
<spring:url var="js" value="/resources/js" />

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Monthly consumption page</title>
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
  <a href="./consumerHomePage" class="list-group-item list-group-item-action "> Account Details</a>
  <a href="./consumerBillDisplay" class="list-group-item list-group-item-action">Current Bill</a>
  <a href="./monthlyConsumptionDisplay" class="list-group-item list-group-item-action">Monthly Consumption</a>
  <a href="./billHistory" class="list-group-item list-group-item-action">Bill History</a>
  <a href="./payOnline" class="list-group-item list-group-item-action">Pay Online</a>
</div>
  </div>
 <div class="col-8">
  
  <div class="Consumption Details"> <br>
           
  
</div>
	 <jsp:include page="footer.jsp"></jsp:include>
	
</body>
</html>