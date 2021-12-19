<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Index page</title>
</head>
<body>

<form action="/result" method = "POST">
<p>Your name: <input type = "text" name = "firstName"></p>
<p>Dojo location: 
<select name = "location">
<option value = "Los Angeles">Los Angeles</option>
<option value = "Chicago">Chicago</option>
<option value = "Austin">Austin</option>
</select>
 </p>
 <p>Favorite language: 
<select name = "language">
<option value = "Java">Java</option>
<option value = "MERN">MERN</option>
<option value = "Azure">Azure</option>
</select>
 </p>
 <p>Comment (optional) </p>
 <p><textarea name = "comment" rows = "4" cols = "50"></textarea></p>
 <p><button>Submit</button> </p>
</form>
</body>
</html>