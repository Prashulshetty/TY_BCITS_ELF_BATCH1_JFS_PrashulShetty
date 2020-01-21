<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
  
  <%! private int a=10;
  public void setA(int a) {
	  this.a=a;
  }
  public int getA() {
	  return a;
  }
  public String name = "dev";
  
  public String getName() {
	  return name;
  }
   public String getName(String name) {
	   return name;
   }
  
  %>  
    
  
  
  
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
a =  <%= a %><br>
  a = <%=  getA()  %><br>
   <%  setA(100);%>
  a = <%=  getA()  %><br><br>
  name = <%= name %><br>
  name = <%= getName() %><br>
  name = <%=  getName("Dingi") %><br><br>
  
  <% for (int i= 0; i<5; i++) {%>
  <%= getName() %><br>
  <% } %>
 
</body>
</html>
<%@ include file ="date.html" %>
<%-- <%-- <%@ include file ="/currentDate" %> --%> <!-- (dynamic resource not possible) -->

<%--  <jsp:forward page="./date.html"></jsp:forward>
  
  
   <jsp:forward page="./loginForm.html"></jsp:forward> --%>
  
  <%-- <jsp:forward page="./searchEmp" >
  <jsp:param name="empId" value="999"/> 
    </jsp:forward> --%>
    
   <%--  <jsp:include page="./date.html"></jsp:include>
    <jsp:include page="/currentDate"></jsp:include>
     --%>
   <%--  <jsp:include page="/searchEmp" >
  <jsp:param name="empId" value="999"/> 
    </jsp:include> --%>
    