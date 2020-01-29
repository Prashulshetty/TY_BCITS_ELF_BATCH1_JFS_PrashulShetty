<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
  <h1 align="center" style="color: blue;" >DISCOM ELECTRICITY PRIVATE LIMITED</h1>
  <h1 align="center" style="color: blue;"  >Customer SignUp</h1>
 
<div style="width: 250px ;height: 850px;

margin-top: 36px;
font-size: larger;
margin: auto;"
 >
<div>
    <form action="./consumerSignupServlet" method="post" onsubmit="return validateForm()" >
			<label>First Name :</label><br>
			<input style="width: 250px;" type="text" name="fName" required><br><br>
			<label>Last Name:</label><br>
			<input style="width: 250px;"type="text" name="lName" required><br><br>
			<label>Email address :</label><br>
			<input style="width: 250px;" type="email" name="email" required><br><br>
			<label>Mobile Number :</label><br>
			<input style="width: 250px;"  type="tel" name="Mobile" required><br><br>
			<label>Password :</label><br>
			<input style="width: 250px;"  type="password" name="password" required><br><br>
			<label>Confirm Password :</label><br>
			<input style="width: 250px;"  type="password" name="cPassword" required><br><br>
			<label>Meter/RR Number :</label><br>
			<input style="width: 250px;" type="number" name="mNumber" required><br><br>
			
			 <label>Type of Consumer :</label><br>
			  <select name="consumertype" style="width: 250px;"  class="custom-select"><br>
        <option  value="0" selected disabled>Select Consumer Type</option>
        <option value="1">Residential</option>
        <option value="2">Commercial</option>
        <option value="3">Industries</option>
      </select><br><br>
       <label for="">Region</label><br>
      <select name="region" style="width: 250px;"  style="width: 250px;"  class="custom-select"><br>
        <option value="0" selected disabled>Select Region</option>
        <option value="1">Bangalore South</option>
        <option value="2">Bangalore North</option>
      </select><br>
			<div class="form-group"><br>
        <label for="">House Number :</label><br>
        <input style="width: 250px;" id="hNumber" type="text" placeholder="Address Line 1 " class="form-control" name="houseNo"><br><br>
       <label for="">Area :</label><br>
        <input style="width: 250px;"  id="Area" type="text" placeholder="Address Line 2 " class="form-control" name="area"><br><br>
        <label style="width: 250px;"  for="">Pincode</label><br>
        <input style="width: 250px;"  id="PinCodeI" type="number" placeholder="Enter Pincode" class="form-control" name="pin"><br>
      </div><br>
<input type="checkbox" name="Cbox" id="">&nbsp;<label for="">By Signing up.I agree the terms and condition.</label><br><br>
      <button  style="width: 250px;" type="submit"  class="btn btn-outline-primary col-md-8 offset-md-2 mt-3">SignUp</button><br><br>
     
    </form>
  </div>
</div>
</body>
</html>