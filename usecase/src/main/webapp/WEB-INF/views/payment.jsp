<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<spring:url var="css" value="/resources/css" />
<spring:url var="js" value="/resources/js" />
<spring:url var="images" value="/resources/images" />
<% String errMsg = (String) request.getAttribute("errMsg");
 String msg = (String) request.getAttribute("msg"); %>
<!DOCTYPE html>
<html lang="en">

<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta http-equiv="X-UA-Compatible" content="ie=edge">
<title>Payment Page</title>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">
<link rel="stylesheet" href="./resources/fontawesome-free-5.12.0-web/fontawesome-free-5.12.0-web/css/all.css">
<link rel="stylesheet" href="${css}/payment.css">
</head>
<jsp:include page="header.jsp"></jsp:include>

<body>
<% if(errMsg != null && !errMsg.isEmpty()){ %>
     <div style="color: red; font-size:35px; font: bold; margin-right: 50px" align="center">
  	<strong style="transition-duration: 60s;"><%= errMsg %></strong>
	</div>


<%} %>
<% if(msg != null && !msg.isEmpty()){ %>
<h2 style="color: green;" align="center"><%= msg %></h2>
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
	<div
		class="col-md-4 col-sm-12  col-10 col-4 offset-md-1   offset-1 card card-body mt-5 my-card">

		<form  action="./paySuccess" id="formData" onsubmit="validation(); return false " method="post">
			<h3 class="text-center">Payment Details</h3><br>
			<img 
      src="${images}/mastercard.jpg"
            alt="">
            <img 
      src="${images}/amex.jpg"
            alt="">
            <img 
      src="${images}/visa.jpg"
            alt="">
            <img 
      src="${images}/amex.jpg"
            alt="">
             <img 
      src="${images}/visa.jpg"
            alt="">
            <img 
      src="${images}/mastercard.jpg"
            alt="">
            
			<div class="form-group">
				<div class="form-group">
					<label>Card Number</label>
					<div class="input-group">
						<input type="number" class="form-control" name="cardNumber" id="cardNumber"
							placeholder="Valid Card Number">
					</div>
					<div class="col-xs-12">
						<div class="form-group">
							<label>Card Holder Name</label> <input type="text" name="name" id="name"
								class="form-control" placeholder="Enter the Name" />
						</div>
					</div>
					<div class="form-group">
						<label>Enter Amount</label>
						<div class="input-group">
							<input type="number" class="form-control" name="amount" id="amount"
								placeholder="Enter the Amount">
						</div>
					</div>
					<div class="row">
						<div class="col-xs-7 col-md-7">
							<div class="form-group">
								<label><span class="hidden-xs"></span><span
									class="visible-xs-inline">EXP</span> DATE</label> <input type="tel" name="expdate" id="expdate"
									class="form-control" placeholder="MM / YY" />
							</div>
						</div>
						<div class="col-xs-5 col-md-5 pull-right">
							<div class="form-group">
								<label>CVC</label> <input type="tel" class="form-control" name="cvv" id="cvv"
									placeholder="CVC" />
							</div>
						</div>
					</div>

					<!-- <div class="panel-footer">
						<div class="sumbot">
							<div class="col-xs-8">
								<button class="btn btn-primary btn-lg btn-block name=">Pay</button>
							</div>
						</div>
					</div> -->
						<button type="submit"
				class="btn btn-outline-primary col-md-8 offset-md-2 mt-3">pay</button>
			</button>
</div>
				</div>
		</form>
		<script src="${js}/jquery-3.4.1.js"></script>
		<script src="${js}/bootstrap.min.js"></script>
		<script src="${js}/payment.js"></script>
</body>
</html>