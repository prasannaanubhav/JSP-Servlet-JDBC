<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

The Student is confirmed : ${param.firstname} ${param.lastname}
<br/>
Satying in : ${param.Country}
<br/>
Having Favourite Language :${param.FavoriteLanguage}
<br/><br/>


<ul>
 Favorite Movie : <% String langs[] = request.getParameterValues("FavoriteMovie"); 

 for(String temp:langs){
	 out.println("<br/>"+temp);
 }

%>
</ul>




</body>
</html>