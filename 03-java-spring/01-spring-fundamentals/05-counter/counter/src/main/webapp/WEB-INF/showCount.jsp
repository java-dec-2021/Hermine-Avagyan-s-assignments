<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
You have visited  " <c:out value="${string}"></c:out> " site <c:out value="${countToShow}"></c:out> times.
<a href ="/reset">Test another visit</a>
</body>
</html>