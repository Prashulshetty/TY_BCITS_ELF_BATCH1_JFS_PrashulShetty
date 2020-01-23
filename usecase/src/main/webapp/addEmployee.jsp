<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

		   <legend>Add Employee</legend>
		   <form action="./addEmployee" method="post">
			<label>Employee Id :</label>
			<input type="text" name="empId" required><br>
			<label>Employee name :</label>
			<input type="text" name="empName" required><br>
			<label>Employee designation :</label>
			<input type="text" name="designation" required><br>
			<label>Employee Password  :</label>
			<input type="password" name="password" required><br>
				<label>Region  :</label>
			<input type="text" name="region" required><br>
			
			
			&nbsp;	&nbsp;	&nbsp;	&nbsp;
			 <input type="submit" value="add">
		</form>
	
</body>
</html>