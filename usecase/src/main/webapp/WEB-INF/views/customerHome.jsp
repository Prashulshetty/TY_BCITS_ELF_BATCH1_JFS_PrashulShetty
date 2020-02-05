<%@page import="java.nio.channels.SeekableByteChannel"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page import="com.bcits.usecase.beans.ConsumerMasterBean"%>
<% ConsumerMasterBean consumerBean = (ConsumerMasterBean) session.getAttribute("Info"); 
 String errMsg = (String) request.getAttribute("errMsg");%>
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
<% if(errMsg != null && !errMsg.isEmpty()){ %>
     <div style="color: red; font-size:25px; font: bold; margin-right: 50px" align="center">
  	<strong style="transition-duration: 60s;"><%= errMsg %></strong>
	</div>
<%} %>
<div class="row" >
  <div class="col-3" ><br>
  <div class="list-group" style="text-align: center;font: bold;font-size: 20px;margin-left: 40px;margin-right: ">
  <a href="./consumerHomePage" class="list-group-item list-group-item-action active"> Account Details</a>
  <a href="./consumerBillDisplay" class="list-group-item list-group-item-action">Current Bill</a>
  <a href="./monthlyConsumptions" class="list-group-item list-group-item-action">Monthly Consumption</a>
  <a href="./billHistoryDisplay" class="list-group-item list-group-item-action">Bill History</a>
  <a href="./payOnline" class="list-group-item list-group-item-action">Pay Online</a>
</div>
  </div>
 <div class="col-8">
  
  <div class="consumerDetails"> <br>
           
            <table class="table table-hover table-dark">
  <thead>
    <tr>
      <th scope="col">Consumer Details</th>
    </tr>
  </thead>
  <tbody>
    
                    <tr>
                    <td><strong style="color: white">Name</strong></td>
                    <td>: &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</td>
                    <td><strong style="color: white"><%= consumerBean.getFirstName()+" "+consumerBean.getLastName() %></strong></td>
                </tr>
                <tr>
                    <td><strong style="color: white">RR Number</strong></td>
                    <td>:</td>
                    <td><strong style="color: white"><%= consumerBean.getRrNumber() %></strong></td>
                </tr>
                <tr>
                    <td><Strong style="color: white">PhoneNumber</Strong></td>
                    <td>:</td>
                    <td><strong style="color: white"><%= consumerBean.getPhoneNumber() %></strong></td>
                </tr>
                <tr>
                    <td><strong style="color: white">Email</strong></td>
                    <td>:</td>
                    <td><strong style="color: white"><%= consumerBean.getEmail() %></strong></td>
                </tr>
                <tr>
                    <td><Strong style="color: white">Region</Strong></td>
                    <td>:</td>
                    <td><strong style="color: white"><%= consumerBean.getRegion()%></strong></td>
                </tr>
                <tr>
                    <td><strong style="color: white">Type Of Consumer &nbsp;&nbsp;&nbsp;&nbsp;</strong></td>
                    <td>:</td>
                    <td><strong style="color: white"><%= consumerBean.getTypeOfConsumer() %></strong></td>
                </tr>
  </tbody>
</table>
</div>
   <div class="form-group" style="width: 500px; font-size: 20px ;">
  		<label for="comment"><strong >Query:</strong></label>
 		<textarea class="form-control" rows="2" id="comment"></textarea><br>
 		<button type="submit" formaction="#" class="btn btn-primary" style="margin-top: -7px;">Submit</button>
	</div> 
	</div>
</div>
	 <jsp:include page="footer.jsp"></jsp:include>
	
</body>
</html>