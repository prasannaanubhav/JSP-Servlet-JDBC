<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student List</title>

<link type="text/css" rel="stylesheet" href="css/style.css">
</head>
<body>
<div id="wrapper">
<div id="header">

<h2>Foo Bar University</h2>

</div>


</div>

<div id="container">
<h3>Add Student</h3>
</div>

<input type="button" value="Add Student"
onclick="window.location.href='add-student-form.jsp'; return false;"
class="add-student-button"
/>

<table border="1">
<tr>
<th>Firstname</th>
<th>Lastname</th>
<th>Email</th>
<th>Action</th>
</tr>

<c:forEach var="student" items="${studentList }">
<tr>
<c:url var="templink" value="StudentController">
<c:param name="command" value="LOAD"/>
<c:param name="studentId" value="${student.id}"/>
</c:url>

<c:url var="deleteLink" value="StudentController">
<c:param name="command" value="DELETE"/>
<c:param name="studentId" value="${student.id}"/>
</c:url>

<td>${student.firstname}</td>
<td>${student.lastname}</td>
<td>${student.email}</td>
<td><a href="${templink}">Update</a>
| 
<a href="${deleteLink}">Delete</a>
</td>

</tr>


</c:forEach>

</table>
</body>
</html>