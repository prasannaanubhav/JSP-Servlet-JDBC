<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Student</title>
<link type="text/css" rel="stylesheet" href="css/style.css">
<link type="text/css" rel="stylesheet" href="css/addd-student-style.css">
</head>
<body>
<div id="wrapper">
<div id="header">

<h2>Foo Bar University</h2>

</div>

<form action="StudentController" method="get">

<input type="hidden" name="command" value="ADD"/>

<table>
<tbody>

<tr>
<td><label>Firstname :</label></td>
<td><input type="text" name="firstname"/> </td>
</tr>

<tr>
<td><label>Lastname :</label></td>
<td><input type="text" name="lastname"/> </td>
</tr>

<tr>
<td><label>Email :</label></td>
<td><input type="text" name="email"/></td> 
</tr>

<tr>
<td><label></label></td>
<td><input type="submit" value="Save"/></td> 
</tr>

</tbody>



</table>

<p>
<a href="student_list.jsp">Back to Student List</a>
</p>


</form>
</div>
</body>
</html>