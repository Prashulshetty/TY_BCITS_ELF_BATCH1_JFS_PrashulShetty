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
    <title>Employee Login</title>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
    
    <link rel="stylesheet" href="/bootstrap-4.4.1-dist/bootstrap-4.4.1-dist/css/bootstrap.min.css">
    <link rel="stylesheet" href="${css}/EmployeeLogin.css">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.11.2/css/all.css">
</head>

<body>
    <nav class="navbar navbar-expand-lg navbar-dark bg-primary">
       <img height="50px"
               src="${images}/download.jpg"
            alt="">
        <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent"
            aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>

        <div class="collapse navbar-collapse" id="navbarSupportedContent">
            <ul class="navbar-nav offset-md-3 pl-5">
                <li class="nav-item active">
                    <h3 class=" active"><a class="nav-link" href="#">DISCOM ELECTRICITY LIMITED <span
                                class="sr-only">(current)</span></a></h3>
                </li>

            </ul>
            
                <ul class="navbar-nav ml-auto">
                    <ul class="navbar-nav ml-auto">
                        <li class="nav-item active">
                            <a class="nav-link active" href="/DISCOM/Discom.html"><i class="fas fa-home"></i>Home</a>
                         </li>
                         <li class="nav-item active">
                            <a class="nav-link active" href="/AboutUs/AboutUs.html">AboutUs</a>
                         </li>
                    </ul>

        </div>
    </nav>
    <div class="col-md-4 col-sm-12  col-10 col-4 offset-md-4   offset-1 card card-body mt-5 my-card">
        
        <form onsubmit="return validateForm()">
            <div id="success" class="alert alert-success" style="display: none;">
                login
                <strong>Success!</strong>
              </div>
            <div class="text-primary offset-md-5 ">
                <h1><i class="fas fa-user-alt "></i></h1>
            </div>
            <h2 class="text-center">Employee Login</h2><br>
            <div class="form-group">
                <label for="exampleInputEmail1">Employee ID</label>
                <input id="eid" type="text" placeholder="Enter Employee id" class="form-control" id="exampleInputEmail1"
                    aria-describedby="emailHelp">
                <p id="eele" style="color: red; display:none; font-size: 12px;">Invalid Employee ID </p>
            </div>
            <div class="form-group">
                <label for="exampleInputPassword1">Password</label>
                <input  id="password" type="password" placeholder="Enter password" class="form-control" id="exampleInputPassword1">
                <p id="pele" style="color: red; display:none; font-size: 12px;">Invalid password</p>

            </div>
            <div class="form-group form-check ">
             <p>
                <div class="float-left">
                    <input onclick="checkBox()" id="checkbox" type="checkbox" class="form-check-input">
                <label class="form-check-label" for="exampleCheck1">Show Password</label>
                </div>

                <div class="float-left offset-md-4">
                    <input id="savebox"  type="checkbox" class="form-check-input ">
                <label class="form-check-label" for="exampleCheck1">Save Password</label>
                </div>
             </p>
            </div>
            <button type="submit" class="btn btn-outline-primary col-md-8 offset-md-2 mt-3">Login</button>
        </form>
        
    </div>
 <script src="${js}/jquery-3.4.1.js"></script>
	<script src="${js}/bootstrap.min.js"></script>
    <script src="${js}/EmployeeLogin.js"></script>
</body>

</html>