<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<% String errMsg = (String) request.getAttribute("errMsg"); %>
<spring:url var="css" value="/resources/css" />
<spring:url var="js" value="/resources/js" />
<spring:url var="images" value="/resources/images" />
 <jsp:include page="header.jsp"></jsp:include>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Customer SignUp</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
    <link rel="stylesheet" href="/bootstrap-4.4.1-dist/bootstrap-4.4.1-dist/css/bootstrap.min.css">
    <link rel="stylesheet" href="${css}/CustomerSignUp.css">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.11.2/css/all.css">
</head>


<body>
 <% if(errMsg != null && !errMsg.isEmpty()){ %>
     <div style="color: red; font-size:35px; font: bold; margin-right: 50px" align="center">
  	<strong style="transition-duration: 60s;"><%= errMsg %></strong>
	</div>
<%} %>
	<div id="screen"
		class="col-md-4 col-sm-12  col-10 col-4 offset-md-4   offset-1 card card-body mt-5 my-card">	
 <form id="formData" onsubmit= "validation(); return false"  method="post">	
			<div class="text-primary offset-md-5 ">
				<h1>
					<i class="fas fa-user-alt "></i>
				</h1>
			</div>
			<h2 class="text-center">User SignUp</h2>
			
			<div class="form-group">
				<label for="firstName">First Name</label> 
				<input id="firstName" name="firstName" type="text" pattern="[A-Z][a-z]{1,15}" maxlength="10" required="required" title="First Character should be capital"	
					placeholder="Enter First Name "  class="form-control"
					aria-describedby="">
					<span id="fName" style="color: red;"></span>
			</div>
			<div class="form-group">
				<label for="lastName">Last Name</label> <input id="lastName" name="lastName" type="text" pattern="[A-Z][a-z]{1,15}" maxlength="10" 
					placeholder="Enter Last Name " class="form-control" required="required" title="Last Character should be capital"	
					aria-describedby="emailHelp">
					<span id="lName" style="color: red;"></span>
			</div>
			<div class="form-group">
				<label for="exampleInputEmail1">Email address</label> <input  
					id="email" name="email" type="email" placeholder="Enter email address" maxlength="30" required="required"
					class="form-control" 
					aria-describedby="emailHelp">
					<span id="email" style="color: red;"></span>
			</div>
			<div class="form-group">
				<label for="exampleMobileNumber">Mobile Number</label> <input 
					id="phoneNumber "  name="phoneNumber" type="tel" placeholder="Enter Mobile Number" required="required"
					class="form-control" 
					aria-describedby="Mobile Number" pattern="[0-9]{10}" maxlength="10" title="Mobile Number should contain 10 digits" >
					<span id="number" style="color: red;"></span>
			</div>
			
			<div class="form-group">
				<label for="exampleInputPassword1">Password</label> <input  
					id="password" name="password" type="password" placeholder="Enter password"  pattern="(?=.*\d)(?=.*[a-z])(?=.*[A-Z]).{6,}" required="required"
title="Must contain at least one number and one uppercase
and lowercase letter, and at least 6 or more characters" 
					class="form-control" >
					<span id="pwd" style="color: red;"></span>
			</div>

			<div class="form-group">
				<label for="exampleInputPassword2">Confirm Password</label> <input  
					id="conPwd" name="conPwd" type="password" placeholder="Confirm Password" required="required"
					class="form-control" >
					<span id="cPwd" style="color: red;"></span>
			</div>

			<div class="form-group">
				<label for="">RR Number</label> <input 
					id="rrNumber" name="rrNumber"  type="text"  
					placeholder="Enter RR Number Region" maxlength="10"  pattern="[A-Z0-9]{5,10}" minlength="10" required="required" title="First 5 Characters should be capital & last 5 digts"	
					class="form-control" id="" aria-describedby="">
					<span id="rrNum" style="color: red;"></span>
			</div>
			<label for="">Type of Consumer</label> <select class="custom-select" name="typeOfConsumer" id="typeOfConsumer"  required="required">
				<option value="0" selected disabled>Select Consumer Type</option>
				<option >residential</option>
				<option >commercial</option>
				<option >industries</option>
			</select>
			 <label for="">Region</label> <select class="custom-select" name="region" id="region" required="required" >
				<option value="0" selected disabled>Select Region</option>
				<option >Bangalore South</option>
				<option >Bangalore North</option>
			</select>
			<div class="form-group">
				<label for="">Address</label> <input id="houseNumber" type="text" name="houseNumber" required="required" pattern="[0-9A-Z]{3,1}" maxlength="4"
					placeholder="House Number" title="First 3 digts and last one should be Capital letter"	class="form-control" ><br>
					<span id="houseNumber" style="color: red;"></span>
				<input id="Area"  name="Area" type="text" placeholder="Area" required="required"
					class="form-control" ><br> 
					<span id="area" style="color: red;"></span>
					<label for="">Pincode</label>
				<input id="pincode" name="pincode" type="text" placeholder="Enter Pincode"  pattern="[0-9]{6}" maxlength="6" required="required" title="Only digits allowed"
					class="form-control" >
					<span id="pincode" style="color: red;"></span>
			</div>
			<input type="checkbox" name="Cbox" id="Cbox" required="required">&nbsp;<label for="">By
				Signing up.I agree the terms and condition.</label>
			<button type="submit" formaction="./signUpPage"
				class="btn btn-outline-primary col-md-8 offset-md-2 mt-3">SignUp</button>
		</form>
		</div>
   
	<script src="${js}/jquery-3.4.1.js"></script>
    <script src="${js}/CustomerSignUp.js"></script>
	<script src="${js}/bootstrap.min.js"></script>
	<jsp:include page="footer.jsp"></jsp:include>
</body>

</html>