<%@page import="com.bcits.usecase.beans.EmployeeMasterBean"%>
<%@page import="java.nio.channels.SeekableByteChannel"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<% EmployeeMasterBean employeeBean = (EmployeeMasterBean) session.getAttribute("empInfo");  %>
    <%long count = (long) request.getAttribute("count"); %>
    <% String errMsg = (String) request.getAttribute("errMsg"); %>
    

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
 <jsp:include page="empheader.jsp"></jsp:include>
<body style=" background-color : lightblue">
 <% if(errMsg != null && !errMsg.isEmpty()){ %>
     <div style="color: red; font-size:35px; font: bold; margin-right: 50px" align="center">
  	<strong style="transition-duration: 60s;"><%= errMsg %></strong>
	</div>

<%} %>

<div class="row" >
  <div class="col-3" ><br>
   <div class="list-group" style="text-align: center;font: bold;font-size: 20px;margin-left: 40px;margin-right: ">
  <a href="./employeeHomePage" class="list-group-item list-group-item-action active"> Employee Details</a>
   <a href="./getConsumersDetails" class="list-group-item list-group-item-action">See all Consumers</a> 
  <a href="./generatePage" class="list-group-item list-group-item-action">Generate Bills</a>
    <a href="./seeAllBills" class="list-group-item list-group-item-action">See Generated Bills</a>
  

</div>
  </div>
	<div class="col-8">
  
  <div class=""> <br>
                 
            <table class="table table-hover table-dark ">
  <thead>
    <tr  >
      <th scope="col" >Employee Details : </th><br><br>
    </tr>
  </thead>
  <tbody>
  <% if(employeeBean != null) { %>
						<tr>
							<td><strong style="color: white">Employee ID</strong></td>
							<td>: &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</td>
							<td><strong style="color: white"><%=employeeBean.getEmpId()%></strong></td>
						</tr>
						<tr>
							<td><strong style="color: white">Employee Name</strong></td>
							<td>:</td>
							<td><strong style="color: white"><%=employeeBean.getEmpName()%></strong></td>
						</tr>
						<tr>
							<td><Strong style="color: white">Designation</Strong></td>
							<td>:</td>
							<td><strong style="color: white"><%=employeeBean.getDesignation()%></strong></td>
						</tr>
						<tr>
							<td><Strong style="color: white">Region</Strong></td>
							<td>:</td>
							<td><strong style="color: white"><%=employeeBean.getRegion()%></strong></td>
						</tr>
						<tr>
							<td><Strong style="color: white">Total Number of Consumer</Strong></td>
							<td>:</td>
							<td><strong style="color: white"><%= count%></strong></td>
						</tr>
<% } %>
					</tbody>

 </table>
  	  
	</div>
	</div>
</body>

</html>