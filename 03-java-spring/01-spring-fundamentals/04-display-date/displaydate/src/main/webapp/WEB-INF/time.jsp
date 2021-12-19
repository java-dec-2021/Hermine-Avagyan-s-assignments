<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.Date"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link href = "css/time_style.css" rel = "stylesheet">
<title>Insert title here</title>
</head>
<body>
<h2>TIME</h2>
<p> <c:out value = "${time}"></c:out> </p>
<a href = "/goToHome">Go to Home</a>
<script src = "js/time_style.js"></script>
</body>
</html>

