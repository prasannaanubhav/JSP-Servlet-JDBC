<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Confirmation</title>
</head>
<body>

<%

String favprog = request.getParameter("favoritelanguage");

Cookie cookie = new Cookie("mycookie",favprog);

cookie.setMaxAge(60*60*24*365);

response.addCookie(cookie);

%>

thanks , your favorite language is : ${param.favoritelanguage}
<br><br>

<a href="cookies-homepage.jsp"> Return to HomePage</a>

</body>
</html>