
<%@page import="java.util.List"%>
<%@page import="com.bcits.usecase.beans.ConsumerMasterBean"%>
<%@page import="java.nio.channels.SeekableByteChannel"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

   <% ConsumerMasterBean consumerInfo = (ConsumerMasterBean) request.getAttribute("consumerInfo"); %>
<% double preFinal = (double) request.getAttribute("previous");%>

<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<spring:url var="css" value="/resources/css" />
<spring:url var="js" value="/resources/js" />

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Generate Bill</title>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">
<link rel="stylesheet"
	href="./resources/fontawesome-free-5.12.0-web/css/all.css">
</head>
 <jsp:include page="empheader.jsp"></jsp:include>
<body style=" background-color : lightblue">
 
<div class="row" >
  <div class="col-3" ><br>
   <div class="list-group" style="text-align: center;font: bold;font-size: 20px;margin-left: 40px;margin-right: ">
  <a href="./employeeHomePage" class="list-group-item list-group-item-action active"> Employee Details</a>
   <a href="./getConsumersDetails"  class="list-group-item list-group-item-action">See all Consumers</a> 
  <a href="#"class="list-group-item list-group-item-action">Generate Bills</a>
    <a href="./seeAllBills" class="list-group-item list-group-item-action">See Generated Bills</a>
        <a href="./revenue" class="list-group-item list-group-item-action">Monthly Revenue</a>
       <a href="./seeQueryDetails" class="list-group-item list-group-item-action">See Query Details</a>
</div>
  </div>
	<div class="col-8">
  
  <div class=""> <br>
       <div id="page-content-wrapper bill">
        <table class="table table-hover table-dark ">
			<br>	
			<% if(consumerInfo != null){ %>
			<form action="./billGenerate">
				<h3 style="color: blue">Bill Generator</h3>
				<div class="form-row">
					<div class="form-group col-md-10">
						<label for="rrNum">RR Number</label> <input type="tel" readonly="readonly" 
							class="form-control" id="rrNum" name="rrNumber" value="<%= consumerInfo.getRrNumber()%>" placeholder="RR Number">
					</div>
				</div>
				<div class="form-row">
					<div class="form-group col-md-5">
						<label for="prev">Previous Reading</label> <input type="tel" readonly="readonly" 
							class="form-control" id="previous"  name="previousReading" value="<%= preFinal %>" placeholder="Previous Reading">
					</div>
					<div class="form-group col-md-5">
						<label for="pres">Current Reading</label> <input type="tel" 
							class="form-control" id="current" name="currentReading"  placeholder="Current Reading">
					</div>
				</div>
				<div class="form-row">
					<div class="form-group col-md-5">
					
						<label for="date">Type Of Consumer</label> 
						<input type="text" class="form-control" name="typeOfConsumer" value="<%= consumerInfo.getTypeOfConsumer()%>" readonly="readonly"  id="date">
					</div>
					<div class="form-group col-md-5">
						<label for="dueDate">Due Date</label> <input type="date" 
							class="form-control" id="dueDate" name="dueDate">
					</div>
				</div>
				<button id="login" type="submit" class="btn btn-primary">Generate</button>
			</form>
			<% } %>
		</div>          
          


  	  
	</div>
	</div>
</body>

</html>