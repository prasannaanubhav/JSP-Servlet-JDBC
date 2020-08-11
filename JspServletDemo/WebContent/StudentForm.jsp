<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student Registration Form</title>
</head>
<body>

<form action="student-response.jsp">

First Name : <input type="text" name="firstname"/>

<br/><br/>

Last Name : <input type="text" name="lastname"/>

<br/><br/>

<select name="Country">
   <option>India</option>
   <option>USA</option>
   <option>England</option>
   <option>Australia</option>
   <option>New Zealand</option>
</select>

<br/><br/>
Favorite Programming Language :
<input type = "radio" name="FavoriteLanguage" value="Java">Java
<input type = "radio" name="FavoriteLanguage" value="C#">C#
<input type = "radio" name="FavoriteLanguage" value="Ruby">Ruby
<input type = "radio" name="FavoriteLanguage" value="C++">C++
<input type = "radio" name="FavoriteLanguage" value="C">C
<input type = "radio" name="FavoriteLanguage" value="Python">Python
<br/>
<br/>
Favorite Movie :
<input type = "checkbox" name="FavoriteMovie" value="Blake">Blake
<input type = "checkbox" name="FavoriteMovie" value="Booth">Booth
<input type = "checkbox" name="FavoriteMovie" value="Godfather">Godfather
<input type = "checkbox" name="FavoriteMovie" value="Namaste">Namaste
<input type = "checkbox" name="FavoriteMovie" value="Lagaan">Lagaan
<input type = "checkbox" name="FavoriteMovie" value="Baarish">Baarish
<br/>

<input type = "submit" value="Submit"/>

</form>

</body>
</html>