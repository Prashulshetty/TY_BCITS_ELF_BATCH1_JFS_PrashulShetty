<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<fieldset>
		<legend>Consumer Details</legend>
		<form action="./consumerSignup" method="post">
			<label>First Name :</label>
			<input type="text" name="fName" required><br>
			<label>Last Name:</label>
			<input type="text" name="lName" required><br>
			<label>Email address :</label>
			<input type="email" name="email" required><br>
			<label>Mobile Number :</label>
			<input type="tel" name="Mobile" required><br>
			<label>Password :</label>
			<input type="password" name="password" required><br>
			<label>Confirm Password :</label>
			<input type="password" name="cPassword" required><br>
			<label>Meter Number/RR Number :</label>
			<input type="number" name="mNumber" required><br>
			 <label>Type of Consumer :</label>
			  <select name="typeOfConsumer" class="custom-select">
        <option  value="0" selected disabled>Select Consumer Type</option>
        <option value="1">Residential</option>
        <option value="2">Commercial</option>
        <option value="3">Industries</option>
      </select><br>
       <label for="">Region</label>
      <select name="region" class="custom-select">
        <option value="0" selected disabled>Select Region</option>
        <option value="1">Bangalore South</option>
        <option value="2">Bangalore North</option>
      </select><br>
			<div class="form-group">
        <label for="">Address</label>
        <input id="Address1" type="text" placeholder="Address Line 1 " class="form-control" id=""><br>
        <input id="Address2" type="text" placeholder="Address Line 2 " class="form-control" id=""><br>
        <label for="">Pincode</label>
        <input id="PinCodeI" type="number" placeholder="Enter Pincode" class="form-control" id="">
      </div>
<input type="checkbox" name="Cbox" id="">&nbsp;<label for="">By Signing up.I agree the terms and condition.</label><br>
      <button type="submit"  class="btn btn-outline-primary col-md-8 offset-md-2 mt-3">SignUp</button>
     
    </form>
			
			
	</fieldset>
</body>
</html>