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
<h1>Thanks <c:out value="${firstName}"></c:out> for choosing <c:out value="${language}"></c:out></h1>
<p>Your Dojo Location is <c:out value="${location}"></c:out> </p>

<p>Here are your comments " <c:out value="${comment}"></c:out> "</p>
<p><a href = "/">Go Back</a></p>
</body>
</html>