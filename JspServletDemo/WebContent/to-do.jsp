<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import = "java.util.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>To-Do List</title>
</head>
<body>

<form action ="to-do.jsp">

Add Items to the Bucket : <input type="text" name="theItem"/>

<input type ="submit" value = "Submit">

</form>

Item Entered : <%=request.getParameter("theItem") %>

<%
List<String> items = (List<String>)session.getAttribute("myToDoList");
if(items==null){
	items = new ArrayList<>();
	session.setAttribute("myToDoList", items);
}

String cartItems = request.getParameter("theItem");
if(cartItems!=null){
	items.add(cartItems);
}
%>

<hr>
<b> To Do List Items :</b><br/>

<ol>
<%
for(String todoItems:items){
	out.println("<li>"+todoItems+"</li>");
}

%>

</ol>

</body>
</html>