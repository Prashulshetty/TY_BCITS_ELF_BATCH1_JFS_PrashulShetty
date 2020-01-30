<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>
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
<title>SignUp page</title>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">
<link rel="stylesheet" href="./resources/fontawesome-free-5.12.0-web/css/all.css">
<link rel="stylesheet" href="${css}/CustomerSignUp.css">
</head>

<body>

	<div id="screen"
		class="col-md-4 col-sm-12  col-10 col-4 offset-md-4   offset-1 card card-body mt-5 my-card">

		<form id="f1" action="/" onsubmit="return validateForm()">
			<div id="success" class="alert alert-success" style="display: none;">
				SignUp <strong>Success!</strong>
			</div>
			<div class="text-primary offset-md-5 ">
				<h1>
					<i class="fas fa-user-alt "></i>
				</h1>
			</div>
			<h2 class="text-center">User SignUp</h2>
			<div class="form-group">
				<label for="">First Name</label> <input id="fName" type="text"
					placeholder="Enter First Name " required class="form-control"
					id="exampleInputFirst Name" aria-describedby="">
				<p id="fNameI" style="color: red; display: none; font-size: 12px;">Invalid
					First Name</p>
			</div>
			<div class="form-group">
				<label for="">Last Name</label> <input id="lName" type="text"
					placeholder="Enter Last Name " class="form-control"
					id="exampleInputLast Name" aria-describedby="emailHelp">
				<p id="lNameI" style="color: red; display: none; font-size: 12px;">Invalid
					Last Name</p>
			</div>
			<div class="form-group">
				<label for="exampleInputEmail1">Email address</label> <input
					id="email" type="email" placeholder="Enter email address"
					class="form-control" id="exampleInputEmail1"
					aria-describedby="emailHelp">
				<p id="emailI" style="color: red; display: none; font-size: 12px;">Invalid
					email</p>
			</div>
			<div class="form-group">
				<label for="exampleMobileNumber">Mobile Number</label> <input
					id="Mobile " type="number" placeholder="Enter Mobile Number"
					class="form-control" id="exampleInputMobile Number"
					aria-describedby="Mobile Number">
				<p id="MobileI" style="color: red; display: none; font-size: 12px;">Invalid
					Mobile Number</p>
			</div>
			<div class="form-group">
				<label for="exampleInputPassword1">Password</label> <input
					id="password" type="password" placeholder="Enter password"
					class="form-control" id="exampleInputPassword1">
				<p id="pele" style="color: red; display: none; font-size: 12px;">Invalid
					password</p>
			</div>

			<div class="form-group">
				<label for="exampleInputPassword2">Confirm Password</label> <input
					id="cPassword" type="password" placeholder="Confirm Password"
					class="form-control" id="exampleInputPassword2">
				<p id="cPasswordI"
					style="color: red; display: none; font-size: 12px;">Password
					should match</p>
			</div>

			<div class="form-group">
				<label for="">Meter Number/RR Number Region</label> <input
					id="mNumber" type="number"
					placeholder="Enter Meter Number/RR Number Region"
					class="form-control" id="" aria-describedby="">
				<p id="mNumberI" style="color: red; display: none; font-size: 12px;">Invalid
					Meter Number/RR Number Region</p>
			</div>
			<label for="">Type of Consumer</label> <select class="custom-select">
				<option value="0" selected disabled>Select Consumer Type</option>
				<option value="1">Residential</option>
				<option value="2">Commercial</option>
				<option value="3">Industries</option>
			</select> <label for="">Region</label> <select class="custom-select">
				<option value="0" selected disabled>Select Region</option>
				<option value="1">Bangalore South</option>
				<option value="2">Bangalore North</option>
			</select>
			<div class="form-group">
				<label for="">Address</label> <input id="Address1" type="text"
					placeholder="Address Line 1 " class="form-control" id=""><br>
				<input id="Address2" type="text" placeholder="Address Line 2 "
					class="form-control" id=""><br> <label for="">Pincode</label>
				<input id="PinCodeI" type="number" placeholder="Enter Pincode"
					class="form-control" id="">
			</div>
			<input type="checkbox" name="Cbox" id="">&nbsp;<label for="">By
				Signing up.I agree the terms and condition.</label>
			<button type="submit"
				class="btn btn-outline-primary col-md-8 offset-md-2 mt-3">SignUp</button>

		</form>

	</div>
	<script src="${js}/jquery-3.4.1.js"></script>
	<script src="${js}/bootstrap.min.js"></script>
	<script src="${js}/signup.js"></script>
</body>

</html>