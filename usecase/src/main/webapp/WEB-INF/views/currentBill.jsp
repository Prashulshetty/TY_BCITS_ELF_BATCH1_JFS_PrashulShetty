<%@page import="java.text.SimpleDateFormat"%>
<%@page import="com.bcits.usecase.beans.ConsumerMasterBean"%>
<%@page import="com.bcits.usecase.beans.CurrentBillBean"%>
<%@page import="java.nio.channels.SeekableByteChannel"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<% CurrentBillBean billBean = (CurrentBillBean) request.getAttribute("generatedBill");
ConsumerMasterBean consumerBean = (ConsumerMasterBean) session.getAttribute("Info");
%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<spring:url var="css" value="/resources/css" />
<spring:url var="js" value="/resources/js" />

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>customer bill page</title>
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
      <th scope="col">Current Bill Details</th>
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
                    <td><strong style="color: white">Due Date</strong></td>
                    <td>:</td>
                    <td><% SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy"); %>
                         <strong style="color: white"><%= billBean.getDate()%></strong></td>
                </tr>
              <tr>
                    <td><strong style="color: white"> Initial Reading</strong></td>
                    <td>:</td>
                    <td><strong style="color: white"><%= billBean.getInitialReading() %></strong></td>
                </tr>
                <tr>
                    <td><strong style="color: white"> Final Reading</strong></td>
                    <td>:</td>
                    <td><strong style="color: white"><%=billBean.getCurrentReading() %></strong></td>
                </tr>
                  <tr>
                    <td><strong style="color: white"> Units</strong></td>
                    <td>:</td>
                    <td><strong style="color: white"><%= billBean.getUnits() %></strong></td>
                </tr>
                  <tr>
                    <td><strong style="color: white">Bill Amount</strong></td>
                    <td>:</td>
                    <td><strong style="color: white"><%= billBean.getBillAmount() %></strong></td>
                </tr>
                <tr>
                    <td><strong style="color: white">Due Date</strong></td>
                    <td>:</td>
                    <td>
                         <strong style="color: white"><%= billBean.getDueDate()%></strong></td>
                </tr>
  </tbody>
</table>
 
</div>
	 <jsp:include page="footer.jsp"></jsp:include>
	
</body>
</html>