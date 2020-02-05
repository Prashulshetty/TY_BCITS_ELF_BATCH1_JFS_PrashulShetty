<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<% String errMsg = (String) request.getAttribute("errMsg");
 String msg = (String) request.getAttribute("msg"); %>
 
<spring:url var="css" value="/resources/css" />
<spring:url var="js" value="/resources/js" />
<spring:url var="images" value="/resources/images" />


<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Employee Login</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
    <link rel="stylesheet" href="/bootstrap-4.4.1-dist/bootstrap-4.4.1-dist/css/bootstrap.min.css">
    <link rel="stylesheet" href="${css}/EmployeeLogin.css">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.11.2/css/all.css">
</head>

<jsp:include page="empheader.jsp"></jsp:include>
<body style=" background-color : lightblue">

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


    <div class="col-md-4 col-sm-12  col-10 col-4 offset-md-4   offset-1 card card-body mt-5 my-card">


		<form onsubmit= "validation(); return false" action="./loginEmployee" id="formData" method="post">	
			<div class="text-primary offset-md-5 ">
				<h1>
					<i class="fas fa-user-alt "></i>
				</h1>
			</div>
			<h2 class="text-center">Employee Login</h2>
			<div class="form-group">
				<label for="exampleInputEmail1">Employee ID</label>
				 <input id="empId" name="empId" type="text" placeholder="Enter employee Id"
					class="form-control" 
					aria-describedby="emailHelp">
					 <span id="eId" style="color: red;"></span>
				
			</div>
			<div class="form-group">
				<label for="exampleInputPassword1">Password</label> <input id="password" name="password" type="password"
					placeholder="Enter password" class="form-control" id="exampleInputPassword1">
					  <span id="uPsw" style="color: red;"></span><br>
			</div>
            <div class="form-group form-check ">
             <p>
                <div class="float-left">
                    <input onclick="checkBox()" id="checkbox" type="checkbox" name="checkbox" class="form-check-input">
                <label class="form-check-label" for="exampleCheck1">Show Password</label>
                </div>
             </p>
            </div>
			<button type="submit"
				class="btn btn-outline-primary col-md-8 offset-md-2 mt-3">login</button>
			</button>

		</form>
		
    </div>
  <jsp:include page="footer.jsp"></jsp:include>
	<script src="${js}/jquery-3.4.1.js"></script>
	<script src="${js}/bootstrap.min.js"></script>
    <script src="${js}/EmployeeLogin.js"></script>
</body>

</html>