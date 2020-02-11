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
    <title >admin Home Page</title>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
    
    <link rel="stylesheet" href="/bootstrap-4.4.1-dist/bootstrap-4.4.1-dist/css/bootstrap.min.css">
    <link rel="stylesheet" href="${css}/Discom.css">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.11.2/css/all.css">
</head>
 <jsp:include page="header.jsp"></jsp:include>
<body >

   <% if(errMsg != null && !errMsg.isEmpty()){ %>
     <div style="color: red; font-size:25px; font: bold; margin-right: 50px" align="center">
  	<strong style="transition-duration: 60s;"><%= errMsg %></strong>
	</div>
<%} %> 
 <% if(msg != null && !msg.isEmpty()){ %>
     <div style="color: blue; font-size:25px; font: bold; margin-right: 50px" align="center">
  	<strong style="transition-duration: 60s;"><%= msg %></strong>
	</div>
<%} %> 
    <div class="my-btn ">
        <a class="float-left" href="./addEmployeePage"><button type="button" class="btn btn-md-lg btn-sm-lg btn-lg mr-5 btn-outline-primary "><i class="fas fa-user-circle"></i>&nbsp; Add Employee</button></a>
        <a class="float-left"  href="./deleteEmployeePage"><button type="button" class="btn btn-md-lg btn-sm-lg btn-lg  btn-outline-primary"><i class="fas fa-user-circle"></i>&nbsp; Remove Employee</button></a>
      
     <!-- <a class="float-left"  href="/AdminLogin/AdminLogin.html"><button type="button" class="btn btn-md-lg btn-sm-lg btn-lg  btn-outline-primary"><i class="fas fa-user-circle"></i>&nbsp; Admin Login</button></a>
      -->
       </div>
    
   
   
 
</body>

</html>