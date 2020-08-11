<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="java.net.URLDecoder" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>HomePage</title>
</head>
<body>

<%

String favlang= "java";

Cookie cookie[] = request.getCookies();

if(cookie!=null){
	for(Cookie tempcookie:cookie){
		if("mycookie".equals(tempcookie.getName())){
			favlang = tempcookie.getValue();
			break;
		}
	}
}

%>

New Books for : <%=favlang %>
<br>
please Check it on internet
<br>
Hava Nice day

<hr>
<a href="cookies-personalize.html"> Go To Peronalize Page</a>

</body>
</html>