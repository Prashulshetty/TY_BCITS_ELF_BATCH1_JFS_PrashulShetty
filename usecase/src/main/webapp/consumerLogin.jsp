<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body style="margin-left: 300px; width:350px;heigth:90px;margin-top:10px" >


<legend  style="margin-top: 73px; color:Blue;padding-top:10px" ><b>DISCOM ELECTRICITY PRIVATE LIMITED</b></legend>
<legend style="color:Blue;padding-top:10px;margin-left:100px;">CONSUMER LOGIN</legend>
<form action="./ConsumerLoginServlet" method="post" style="width:200px; heigth:150px;"   >

 
<table>
<tr>
<td style="padding-top:30px;padding-left:20px">CONSUMER ID</td>
<td style="padding-top:30px;padding-left:20px">:</td>
<td style="padding-top:30px;padding-left:20px"><input type="number" name="consumerId"  placeholder="123" required></td>
</tr>
<tr>
<td></td>

</tr>
<tr>
<td style="padding-top:20px;padding-left:20px;">Password</td>
<td style="padding-top:20px;padding-left:20px;">:</td>
<td style="padding-top:20px;padding-left:20px;"><input type="password" name=" password"  placeholder="Mark$123%" required></td>
</tr>
<tr>

<td style = "padding-top:20px;padding-left:20px;"><input type="submit" value="Login"
style=" color:green;"></td>

</tr>

</table>

</form>

</body>
</html>