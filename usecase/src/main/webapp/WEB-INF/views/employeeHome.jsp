<%@page import="com.bcits.usecase.beans.EmployeeMasterBean"%>
<%@page import="java.nio.channels.SeekableByteChannel"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<% EmployeeMasterBean employeeBean = (EmployeeMasterBean) session.getAttribute("Info"); %>

<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<spring:url var="css" value="/resources/css" />
<spring:url var="js" value="/resources/js" />

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>employee home page</title>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">
<link rel="stylesheet"
	href="./resources/fontawesome-free-5.12.0-web/css/all.css">
</head>
 <jsp:include page="header.jsp"></jsp:include>
<body style=" background-color : lightblue">
<div class="row" >
  <div class="col-3" ><br>
   <div class="list-group" style="text-align: center;font: bold;font-size: 20px;margin-left: 40px;margin-right: ">
  <a href="#" class="list-group-item list-group-item-action active"> Employee Detais</a>
  <a href="#" class="list-group-item list-group-item-action">Generate Bill</a>
  <a href="#" class="list-group-item list-group-item-action">See All Bills</a>

</div>
  </div>
	<div class="col-8">
  
  <div class="consumerDetails"> <br>
           
            <table class="table table-hover table-dark">
  <thead>
    <tr>
      <th scope="col">Consumer Details</th>
    </tr>
  </thead>
  <tbody>
    
                    <tr>
                    <td><strong style="color: white">Employee ID</strong></td>
                    <td>: &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</td>
                    <td><strong style="color: white"><%=employeeBean.getEmpId()%></strong></td>
                </tr>
                <tr>
                    <td><strong style="color: white">Employee Name</strong></td>
                    <td>:</td>
                    <td><strong style="color: white"><%= employeeBean.getEmpName() %></strong></td>
                </tr>
                <tr>
                    <td><Strong style="color: white">Designation</Strong></td>
                    <td>:</td>
                    <td><strong style="color: white"><%= employeeBean.getDesignation()%></strong></td>
                </tr>
                <tr>
                    <td><Strong style="color: white">Region</Strong></td>
                    <td>:</td>
                    <td><strong style="color: white"><%= employeeBean.getRegion()%></strong></td>
                </tr>
                
  </tbody>
</table>
  	  
</div>
	 <jsp:include page="footer.jsp"></jsp:include>
	
</body>
</html>