<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
 <%@ page import = "com.jspservlet.*,java.util.*" %>

<%

List<Student> list = new ArrayList<>();
list.add(new Student("Anubhav","prasanna",true));
list.add(new Student("Shubham","jha",false));
list.add(new Student("Ayush","Mishra",true));
list.add(new Student("Prashant","Roshan",false));

pageContext.setAttribute("data", list);
%>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student</title>
</head>
<body>
<table border="1">

<tr>
<th>FirstName</th>
<th>LastName</th>
<th>GoldCustomer</th>
</tr>

<c:forEach var="studentlist" items="${data}">
<tr>
<td>${studentlist.firstname}</td>
 <td>${studentlist.lastname}</td>
 
 <td>
 <c:choose>
  <c:when test="${studentlist.goldcustomer}">
 Special Discount
 </c:when>   
 
  <c:otherwise>
  No Discount
  </c:otherwise>
 
 
 </c:choose>
 

 
 </td>
  
</tr>

</c:forEach>

</table>



</body>
</html>