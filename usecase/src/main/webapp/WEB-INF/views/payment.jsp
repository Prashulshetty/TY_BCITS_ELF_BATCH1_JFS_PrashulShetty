<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<spring:url var="css" value="/resources/css" />
<spring:url var="js" value="/resources/js" />
<spring:url var="images" value="/resources/images" />

<!DOCTYPE html>
<html lang="en">

<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta http-equiv="X-UA-Compatible" content="ie=edge">
<title>Payment Page</title>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">
<link rel="stylesheet"
	href="./resources/fontawesome-free-5.12.0-web/fontawesome-free-5.12.0-web/css/all.css">
<link rel="stylesheet" href="${css}/payment.css">
</head>
<jsp:include page="header.jsp"></jsp:include>

<body>
	<div
		class="col-md-4 col-sm-12  col-10 col-4 offset-md-4   offset-1 card card-body mt-5 my-card">

		<form action=" " onsubmit="validation(); return false ">
			<h3 class="text-center">Payment Details</h3>
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
      src="${images}/mastercard.jpg"
            alt="">
            
			<div class="form-group">
				<div class="form-group">
					<label>Card Number</label>
					<div class="input-group">
						<input type="tel" class="form-control"
							placeholder="Valid Card Number">
					</div>
					<div class="col-xs-12">
						<div class="form-group">
							<label>Card Holder Name</label> <input type="text"
								class="form-control" placeholder="Enter the Name" />
						</div>
					</div>
					<div class="form-group">
						<label>Enter Amount</label>
						<div class="input-group">
							<input type="tel" class="form-control"
								placeholder="Enter the Amount">
						</div>
					</div>
					<div class="row">
						<div class="col-xs-7 col-md-7">
							<div class="form-group">
								<label><span class="hidden-xs"></span><span
									class="visible-xs-inline">EXP</span> DATE</label> <input type="tel"
									class="form-control" placeholder="MM / YY" />
							</div>
						</div>
						<div class="col-xs-5 col-md-5 pull-right">
							<div class="form-group">
								<label>CVC</label> <input type="tel" class="form-control"
									placeholder="CVC" />
							</div>
						</div>
					</div>

					<div class="panel-footer">
						<div class="sumbot">
							<div class="col-xs-8">
								<button class="btn btn-primary btn-lg btn-block">Pay</button>
							</div>
						</div>
					</div>

				</div>
		</form>
		<script src="${js}/jquery-3.4.1.js"></script>
		<script src="${js}/bootstrap.min.js"></script>
		<script src="${js}/payment.js"></script>
</body>
</html>