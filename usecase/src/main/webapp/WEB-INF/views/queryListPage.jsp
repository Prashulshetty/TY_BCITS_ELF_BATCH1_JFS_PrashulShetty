jkl<%@page import="com.bcits.usecase.beans.QueryMsgBean"%>
<%@page import="com.bcits.usecase.beans.MonthlyConsumption"%>
<%@page import="java.util.List"%>
<%@page import="java.text.SimpleDateFormat"%>

<%@page import="java.nio.channels.SeekableByteChannel"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
 
    <% String errMsg = (String) request.getAttribute("errMsg"); %>
  <%String msg = (String) request.getAttribute("msg"); %>
<% List<QueryMsgBean> queryRequests = (List<QueryMsgBean>) request.getAttribute("query"); %>


<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<spring:url var="css" value="/resources/css" />
<spring:url var="js" value="/resources/js" />
<spring:url var="images" value="/resources/images" />

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>query Details page</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
    <link rel="stylesheet" href="/bootstrap-4.4.1-dist/bootstrap-4.4.1-dist/css/bootstrap.min.css">
    <link rel="stylesheet" href="${css}/monthlyConsumption.css">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.11.2/css/all.css">
</head>
 <jsp:include page="header.jsp"></jsp:include>
<body>
 <% if(errMsg != null && !errMsg.isEmpty()){ %>
     <div style="color: red; font-size:35px; font: bold; margin-right: 50px" align="center">
  	<strong style="transition-duration: 60s;"><%= errMsg %></strong>
	</div>

<%} %>
<% if(msg != null && !msg.isEmpty()){ %>
     <div style="color: green; font-size:25px; font: bold; margin-right: 50px" align="center">
  	<strong style="transition-duration: 60s;"><%= msg %></strong>
	</div>
<%} %>
<body style=" background-color : lightblue">
<div class="row" >
  <div class="col-3" ><br>
  <div class="list-group" style="text-align: center;font: bold;font-size: 20px;margin-left: 40px;margin-right: ">
  <a href="./employeeHomePage" class="list-group-item list-group-item-action active"> Employee Details</a>
   <a href="./getConsumersDetails" class="list-group-item list-group-item-action">See all Consumers</a> 
  <a href="./generatePage" class="list-group-item list-group-item-action">Generate Bills</a>
    <a href="./seeAllBills" class="list-group-item list-group-item-action">See Generated Bills</a>
      <a href="./seeQueryDetails" class="list-group-item list-group-item-action">See Query Details</a>
</div>
  </div>
 <div class="col-8">
  
  <div class="consumerDetails"> <br>
           
            <table class="table table-hover table-dark">
  <thead>
    <tr>
      <th scope="col">Query Details</th>
    </tr>
     </thead>
    <thead class="thead-dark">
    <tr>
      <th class="th-sm">Date
      </th>
      <th class="th-sm">rrNumber 
      </th>
      <th class="th-sm">request
      </th>
       <th class="th-sm">response
      </th>
       
    </tr>
  </thead>
 <tbody>
<% if(queryRequests != null) { %>
    <%
  for( QueryMsgBean queries :queryRequests) { %><tr>
       <form action="./sendResponse" method="post">
      
      <input type="datetime" name="date" value="<%=queries.getMsgPk().getDate()%>" hidden="true" />
      <%SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy"); %>
      <td><strong><%= formatter.format(queries.getMsgPk().getDate()) %></strong></td>
      <input type="text" name="rrNumber" value="<%= queries.getMsgPk().getRrNumber() %>" hidden="true"  />
      <td><strong><%= queries.getMsgPk().getRrNumber() %></strong></td>
      <td><strong><%= queries.getQueryRequest() %></strong></td>
      <td><strong><%= queries.getQueryResponse() %></strong></td>
      <td><textarea class="form-control"  rows="2" id="query" name ="query"></textarea></td> 
 	  <td><button type="submit" class="btn btn-primary">Send</button></td>
 	  
    </tr>
    </form>
    </tr>
    <% } %>
    <%  
         } %>
   </tbody>
      
</table>
 
</div>
	 <jsp:include page="footer.jsp"></jsp:include>
	
</body>
</html>
