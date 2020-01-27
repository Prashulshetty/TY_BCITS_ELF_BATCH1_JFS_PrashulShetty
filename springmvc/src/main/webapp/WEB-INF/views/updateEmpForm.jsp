<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	        <jsp:include page="header.jsp"></jsp:include>
	       
	<%String msg =(String) request.getAttribute("msg");
    String errMsg =(String) request.getAttribute("errMsg");%>
	  
<!DOCTYPE html>
<html>
<head>

<meta charset="ISO-8859-1">
<title>Insert title here</title>
<body>
<fieldset>
		<legend>Employee Update</legend>
		<form action="./updateEmployee" method="post" >
		<label>Id :</label>
        <input type="number" name="empId" ><br><br>
        <label>Name :</label>
        <input type="text" name="name" ><br><br>
        <label>Mobile Number :</label>
        <input type="tel" name="mobileNum" ><br><br>     
        <label>Designation :</label>
        <input type="text" name="designation"  ><br><br>
        <label>salary :</label>
        <input type="number" name="salary"  ><br><br>
        <label>birthDate :</label>
        <input type="date" name="birthDate"  ><br><br>
        <label>joiningDate :</label>
        <input type="date" name="joiningDate" ><br><br>
        <label>mailId :</label>
        <input type="email" name="maildId"  ><br><br>
         <label>password :</label>
        <input type="password" name="password"  ><br><br>
        <label>bloodGroup :</label>
        <input type="text" name="bloodGroup" ><br><br>
        <label>deptId :</label>
        <input type="number" name="deptId" ><br><br>
     <label>mgrId :</label>
        <input type="number" name="mgrId"  ><br><br>
         <br>
		&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
		<input type="submit" value="Update" >		
		</form>
	</fieldset>
<%
		if (errMsg != null && !errMsg.isEmpty()) {
	%>
	<h2 style="color: red;">
		<%=errMsg%></h2>

	<%
		}
	%>
		<%
		if (msg != null && !msg.isEmpty()) {
	%>
	<h2 style="color: red;">
		<%=msg%></h2>

	<%
		}
	%>
</body>

<jsp:include page="footer.jsp"></jsp:include>