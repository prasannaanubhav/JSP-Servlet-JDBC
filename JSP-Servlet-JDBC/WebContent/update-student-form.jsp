<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update Student</title>
<link type="text/css" rel="stylesheet" href="css/style.css">
<link type="text/css" rel="stylesheet" href="css/addd-student-style.css">
<c:set var ="student" items="${student}"/></c;set>
</head>
<body>
<div id="wrapper">
<div id="header">

<h2>Foo Bar University</h2>

</div>

<form action="StudentController" method="get">

<input type="hidden" name="command" value="UPDATE"/>
<input type="hidden" name="studentID" value="${student.id}"/>

<table>
<tbody>

<tr>
<td><label>Firstname :</label></td>
<td><input type="text" name="firstname"value="${student.firstname}"/> </td>
</tr>

<tr>
<td><label>Lastname :</label></td>
<td><input type="text" name="lastname" value="${student.lastname}"/> </td>
</tr>

<tr>
<td><label>Email :</label></td>
<td><input type="text" name="email" value="${student.email}"/></td> 
</tr>

<tr>
<td><label></label></td>
<td><input type="submit" value="Save"/></td> 
</tr>

</tbody>



</table>

<p>
<a href="StudentController?command=LIST">Back to Student List</a>
</p>


</form>
</div>
</body>
</html>