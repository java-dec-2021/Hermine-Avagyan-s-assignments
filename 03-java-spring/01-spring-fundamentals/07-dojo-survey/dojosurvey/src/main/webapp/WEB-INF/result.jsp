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
<p>Your name: <c:out value="${firstName}"></c:out> </p>
<p>Dojo Location: <c:out value="${location}"></c:out> </p>
<p>Favorite langauge: <c:out value="${language}"></c:out> </p>
<p>Comment: <c:out value="${comment}"></c:out> </p>
<p><a href = "/">Go Back</a></p>
</body>
</html>