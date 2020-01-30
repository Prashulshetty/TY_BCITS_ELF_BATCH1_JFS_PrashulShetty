<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<spring:url var="images" value="/resources/images" />
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title >Header Page</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous"> 
    <link rel="stylesheet" href="/bootstrap-4.4.1-dist/bootstrap-4.4.1-dist/css/bootstrap.min.css">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.11.2/css/all.css">
</head>
<body>
  <nav class="navbar navbar-expand-lg navbar-dark bg-primary">
        <img height="80px" width="110px"
      src="${images}/download.jpg"
            alt="">

            
        <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent"
            aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>

        <div class="collapse navbar-collapse" id="navbarSupportedContent">
            <ul class="navbar-nav offset-md-3 pl-5">
                <li class="nav-item active">
                    <h3 class=" active"><a class="nav-link" href="#"> DISCOM ELECTRICITY PRIVATE LIMITED <span
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
                      <li class="nav-item active">
                        <a class="nav-link active" href=" ">logout</a>
                     </li>
                </ul>
                   
                  </div>


    </nav>

</body>
</html>