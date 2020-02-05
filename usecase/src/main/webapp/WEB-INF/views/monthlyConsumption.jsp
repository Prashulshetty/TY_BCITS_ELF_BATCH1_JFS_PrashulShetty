<%@page import="com.bcits.usecase.beans.MonthlyConsumption"%>
<%@page import="java.util.List"%>
<%@page import="java.text.SimpleDateFormat"%>

<%@page import="java.nio.channels.SeekableByteChannel"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<% List<MonthlyConsumption> consumed = (List<MonthlyConsumption>) request.getAttribute("monthlyConsumption"); %> 

<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<spring:url var="css" value="/resources/css" />
<spring:url var="js" value="/resources/js" />
<spring:url var="images" value="/resources/images" />

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Monthly Consumption</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
    <link rel="stylesheet" href="/bootstrap-4.4.1-dist/bootstrap-4.4.1-dist/css/bootstrap.min.css">
    <link rel="stylesheet" href="${css}/monthlyConsumption.css">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.11.2/css/all.css">
</head>
 <jsp:include page="header.jsp"></jsp:include>
<body>
<body style=" background-color : lightblue">
<div class="row" >
  <div class="col-3" ><br>
  <div class="list-group" style="text-align: center;font: bold;font-size: 20px;margin-left: 40px;margin-right: ">
  <a href="./consumerHomePage" class="list-group-item list-group-item-action "> Account Details</a>
  <a href="./consumerBillDisplay" class="list-group-item list-group-item-action">Current Bill</a>
  <a href="./monthlyConsumptions" class="list-group-item list-group-item-action">Monthly Consumption</a>
  <a href="./billHistoryDisplay" class="list-group-item list-group-item-action">Bill History</a>
  <a href="./payOnline" class="list-group-item list-group-item-action">Pay Online</a>
</div>
  </div>
 <div class="col-8">
  
  <div class="consumerDetails"> <br>
           
            <table class="table table-hover table-dark">
  <thead>
    <tr>
      <th scope="col">Monthly Consumption Details</th>
    </tr>
     </thead>
    <thead class="thead-dark">
    <tr>
      <th class="th-sm">Date
      </th>
      <th class="th-sm">previous reading 
      </th>
      <th class="th-sm">current reading 
      </th>
      <th class="th-sm">Units 
      </th>
      <th class="th-sm">Bill Amount
      </th>
     
    </tr>
  </thead>
 <tbody>

    <%
  for( MonthlyConsumption list :consumed) { %><tr>
      
      <%SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy"); %>
      <td><strong><%= formatter.format(list.getConsumptionPk().getDate()) %></strong></td>
          <td><strong><%= list.getPreviousReading() %></strong></td>
              <td><strong><%= list.getCurrentReading() %></strong></td>
      <td><strong><%= list.getUnits() %></strong></td>
      <td><strong><%= list.getBillAmount() %></strong></td>
    </tr>
    <%  
         } %>
   </tbody>
      
</table>
 
</div>
	 <jsp:include page="footer.jsp"></jsp:include>
	
</body>
</html>
