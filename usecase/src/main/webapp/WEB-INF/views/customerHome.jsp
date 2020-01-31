<%@page import="java.nio.channels.SeekableByteChannel"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page import="com.bcits.usecase.beans.ConsumerMasterBean"%>
<% ConsumerMasterBean consumerBean = (ConsumerMasterBean) session.getAttribute("loggedInInfo"); %>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<spring:url var="css" value="/resources/css" />
<spring:url var="js" value="/resources/js" />

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>customer home page</title>
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
  <a href="#" class="list-group-item list-group-item-action active"> Account Detais</a>
  <a href="#" class="list-group-item list-group-item-action">Current Bill</a>
  <a href="#" class="list-group-item list-group-item-action">Bill History</a>
  <a href="#" class="list-group-item list-group-item-action">Pay Online</a>
</div>
  </div>
 <div class="col-8">
   
  	  <br> <br><div class="form-group" style="width: 500px; font-size: 20px ;">
  		<label for="comment"><strong>Comment:</strong></label>
 		<textarea class="form-control" rows="4 " id="comment"></textarea><br>
 		<button type="submit" formaction="./" class="btn btn-primary" style="margin-top: -7px;">Submit</button>
	</div> 
	</div>
</div>
	 <jsp:include page="footer.jsp"></jsp:include>
	
</body>
</html>