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
    <title>Add Employee</title>
     <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
    <link rel="stylesheet" href="/bootstrap-4.4.1-dist/bootstrap-4.4.1-dist/css/bootstrap.min.css">
    <link rel="stylesheet" href="${css}/adminLogin.css">
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
    <div class="col-md-4 col-sm-12  col-10 col-4 offset-md-4   offset-1 card card-body mt-5 my-card" style=" box-shadow: 0 0 20px;">
        
        <form action="./addEmp" method="post">
           
            <div class="text-primary offset-md-5 ">
                <h1><i class="fas fa-user-alt "></i></h1>
            </div>
            <h2 class="text-center">Add Employee</h2><br>
            <div class="form-group">
                <label for="exampleInputEmail1">Employee ID</label>
                <input id="eid" type="tel" name="empId" placeholder="Enter employee id" class="form-control" id="exampleInputEmail1" pattern="[0-9]{6}" maxlength="6" title=" should contain only digits" required="required"
                    aria-describedby="emailHelp">
            </div>
            <div class="form-group">
                <label for="exampleInputEmail1">Employee Name</label>
                <input id="empName" type="text" name="empName" placeholder="Enter employee name" class="form-control"  pattern="[A-Z][a-z]{1,15}" maxlength="10" required="required" title="First Character should be capital and max lenth wil be 10"	 >
            </div>
         
             <div class="form-group">
                <label for="exampleInputEmail1">Employee Designation</label>
                <input id="designation" type="text" name="designation" placeholder="Enter employee designation" class="form-control" pattern="[A-Z][a-z]{1,15}" maxlength="10" required="required" title="First Character should be capital and max lenth wil be 10">
            </div>
       
             <div class="form-group">
                <label for="exampleInputEmail1">Region</label>
                <input id="region" type="text" name="region" placeholder="Enter region" class="form-control"  maxlength="15" required="required" >
            </div>
            <div class="form-group">
                <label for="exampleInputPassword1">Password</label>
                <input  id="password" type="password" name="password" placeholder="Enter password" class="form-control" id="exampleInputPassword1" maxlength="15" minlength="6" title="max length wil be 6-15" required="required" >

            </div>
     
            <button type="submit" class="btn btn-outline-primary col-md-8 offset-md-2 mt-3">Add</button>
        </form>
    
        
    </div>
         <jsp:include page="footer.jsp"></jsp:include>
    
 <script src="${js}/jquery-3.4.1.js"></script>
	<script src="${js}/bootstrap.min.js"></script>
   
</body>

</html>