<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
     <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
      <%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Split Demo</title>
</head>
<body>
<c:set var="cities" value="Singapora,Tokyo,Japan,USA,England"/>

<h3>Split Demo</h3>

<c:set var="citiesArray" value="${fn:split(cities,',')}"/>

<c:forEach var="temp" items ="${citiesArray}">
 ${temp}<br/>
</c:forEach>

<h3>Join Demo</h3>

<c:set var = "tempo" value = "${fn:join(citiesArray,'+')}"/>
Result of joining : ${tempo}
</body>
</html>