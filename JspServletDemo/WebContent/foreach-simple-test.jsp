<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>For Each Sample</title>
</head>
<body>
<%

String s[] ={"Mumbai","Singapore","Chennai","Pune","Patna"};
pageContext.setAttribute("city", s);

%>
<c:forEach var = "mycity" items="${city}">
${mycity} <br/>

</c:forEach>


</body>
</html>