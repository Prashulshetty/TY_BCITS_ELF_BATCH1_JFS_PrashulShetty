
<%@page import="java.util.List"%>
<%@page import="com.bcits.usecase.beans.ConsumerMasterBean"%>
<%@page import="java.nio.channels.SeekableByteChannel"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<% List<ConsumerMasterBean> consumerBean = (List<ConsumerMasterBean>) request.getAttribute("consumers"); %>
   <% String errMsg = (String) request.getAttribute("errMsg"); %>
     <% String msg = (String) request.getAttribute("msg"); %>
    

<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<spring:url var="css" value="/resources/css" />
<spring:url var="js" value="/resources/js" />

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>See all Consumers</title>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">
<link rel="stylesheet"
	href="./resources/fontawesome-free-5.12.0-web/css/all.css">
</head>
 <jsp:include page="empheader.jsp"></jsp:include>
<body style=" background-color : lightblue">
 <% if(errMsg != null && !errMsg.isEmpty()){ %>
     <div style="color: red; font-size:25px; font: bold; margin-right: 50px" align="center">
  	<strong style="transition-duration: 60s;"><%= errMsg %></strong>
	</div>
<%} %>
<% if(msg != null && !msg.isEmpty()){ %>
     <div style="color: red; font-size:25px; font: bold; margin-right: 50px" align="center">
  	<strong style="transition-duration: 60s;"><%= msg %></strong>
	</div>
<%} %>

<div class="row" >
  <div class="col-3" ><br>
   <div class="list-group" style="text-align: center;font: bold;font-size: 20px;margin-left: 40px;margin-right: ">
  <a href="./employeeHomePage" class="list-group-item list-group-item-action active"> Employee Details</a>
   <a href="./getConsumersDetails"  class="list-group-item list-group-item-action">See all Consumers</a> 
  <a href="./generatePage"class="list-group-item list-group-item-action">Generate Bills</a>
    <a href="./seeAllBills" class="list-group-item list-group-item-action">See Generated Bills</a>
        <a href="./revenue" class="list-group-item list-group-item-action">Monthly Revenue</a>
       <a href="./seeQueryDetails" class="list-group-item list-group-item-action">See Query Details</a>
</div>
  </div>
	<div class="col-8">
  
  <div class=""> <br>
                 
            <table class="table table-hover table-dark ">
  <thead>
    <tr  >
      <th scope="col" >All Consumers Details : </th><br><br>
    </tr>
  </thead>
   <thead class="thead-dark">
    <tr>
      <th class="th-sm">Name
      </th>
      <th class="th-sm">Email ID
      </th>
       <th class="th-sm">Mobile Number
      </th>
       <th class="th-sm">RR Number
      </th>
       <th class="th-sm">Type Of Consumer
      </th>
     <!--  </th>
       <th class="th-sm">Generate Bill
      </th> -->
     
    </tr>-
  </thead>
   <tbody>
    <%  for( ConsumerMasterBean list : consumerBean) { 
            %>
<%--       <form action="./generateBillPage" method="get">
     	<input type="text" name="rrNumber" value="<%=list.getRrNumber() %>" hidden="true" />    --%>
     <tr>
      <td><strong><%= list.getFirstName() +" "+list.getLastName() %></strong></td>
      <td><strong><%= list.getEmail() %></strong></td>
      <td><strong><%= list.getPhoneNumber() %></strong></td>
      <td><strong><%= list.getRrNumber() %></strong></td>
      <td><strong><%= list.getTypeOfConsumer() %></strong></td>
     <!--  <td><button type="submit" class="btn btn-primary">Generate Bill</button></td> -->
    </tr>
    <!--  </form> -->
    <%  
         } %>
   </tbody>

 </table>
  	  
	</div>
	</div>
</body>

</html>