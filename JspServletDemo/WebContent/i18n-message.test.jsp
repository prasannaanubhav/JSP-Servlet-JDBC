<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
      <%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>

<c:set var="theLocale" value="${not empty param.thelocale? param.thelocale : pageContext.request.locale}"
scope="session"/>

<fmt:setLocale value="${theLocale}"/>

<fmt:setBundle basename="com.jspservlet.multilingual.mylabels"/>

<html>
<head>
<meta charset="ISO-8859-1">
<title>MultiLingual</title>
</head>
<body>
<a href="i18n-message.test.jsp?thelocale=en_US">English (US)</a>
|
<a href="i18n-message.test.jsp?thelocale=es_ES">Spanish (ES)</a>
|
<a href="i18n-message.test.jsp?thelocale=de_DE">German (DE)</a>

<hr>
<fmt:message key="label.greeting"/> <br/>
<fmt:message key="label.firstname"/> Anubhav <br/>
<fmt:message key="label.lastname"/> Prasanna<br/>
<fmt:message key="label.welcome"/> <br/>

</body>
</html>