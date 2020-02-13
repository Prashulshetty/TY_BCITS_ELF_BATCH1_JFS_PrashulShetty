<%@page import="com.bcits.usecase.beans.MonthlyConsumption"%>
<%@page import="java.util.List"%>
<%@page import="java.text.SimpleDateFormat"%>

<%@page import="java.nio.channels.SeekableByteChannel"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
    <% String errMsg = (String) request.getAttribute("errMsg"); %>
     <% String msg = (String) request.getAttribute("msg"); %>
    
<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<spring:url var="css" value="/resources/css" />
<spring:url var="js" value="/resources/js" />
<spring:url var="images" value="/resources/images" />

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Pay Bill</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
    <link rel="stylesheet" href="/bootstrap-4.4.1-dist/bootstrap-4.4.1-dist/css/bootstrap.min.css">
    <link rel="stylesheet" href="${css}/monthlyConsumption.css">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.11.2/css/all.css">
</head>
 <jsp:include page="header.jsp"></jsp:include>
<body>
 <% if(errMsg != null && !errMsg.isEmpty()){ %>
     <div style="color: red; font-size:35px; font: bold; margin-right: 50px" align="center">
  	<strong style="transition-duration: 60s;"><%= errMsg %></strong>
	</div>

<%} %>
  <% if(msg != null && !msg.isEmpty()){ %>
     <div style="color: green; font-size:35px; font: bold; margin-right: 50px" align="center">
  	<strong style="transition-duration: 60s;"><%= msg %></strong>
	</div>
<%} %>

<body style=" background-color : lightblue">
<div class="row" >
  <div class="col-3" ><br>
    <div class="list-group" style="text-align: center;font: bold;font-size: 20px;margin-left: 40px;margin-right: ">
  <a href="./employeeHomePage" class="list-group-item list-group-item-action active"> Employee Details</a>
   <a href="./getConsumersDetails" class="list-group-item list-group-item-action">See all Consumers</a> 
  <a href="./generatePage" class="list-group-item list-group-item-action">Generate Bills</a>
    <a href="./seeAllBills" class="list-group-item list-group-item-action">See Generated Bills</a>
        <a href="./revenue" class="list-group-item list-group-item-action">Monthly Revenue</a>
       <a href="./seeQueryDetails" class="list-group-item list-group-item-action">See Query Details</a>
  

</div>
  </div>
 <div class="col-8">
  
  <div class=" Bill Details"> <br>     
    	<form onsubmit= "validation(); return false" action="./payBills" id="formData" method="post">	       
     
            <h2 class="text-center">Pay Bill</h2><br>
            <div class="form-group">
                <label for="exampleInputEmail1">RR Number</label>
                <input id="rrNumber" name="rrNumber"  type="text"placeholder="Enter rrNumber" class="form-control" required="required"
                    aria-describedby="emailHelp">
                    	 <span id="num" style="color: red;"></span>
            </div>
            <div class="form-group">
                <label for="exampleInputEmail1">Bill Amount</label>
                <input id="billAmount"  name="billAmount" type="tel" placeholder="Enter billAmount" class="form-control" required="required" >
           	 <span id="amount" style="color: red;"></span>
            </div>    
            <button type="submit" class="btn btn-outline-primary col-md-8 offset-md-2 mt-3">pay</button>
        </form>    
         
</div>
	
	 <script src="${js}/jquery-3.4.1.js"></script>
	<script src="${js}/bootstrap.min.js"></script>
    <script src="${js}/payBill.js"></script>
    <jsp:include page="footer.jsp"></jsp:include>
	
</body>
</html>
