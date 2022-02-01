<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%> 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>All Languages</h1>
<table style = "border: solid black 1px">
<thead>
<tr>
<th style = "border: solid black 1px">Name</th>
<th style = "border: solid black 1px">Creator</th>
<th style = "border: solid black 1px">Version</th>

</tr>
</thead>
<tbody>
<c:forEach items = "${allLanguages}" var = "language">
<tr>

<td><a href = "/languages/${language.id}"><c:out value="${language.name}"></c:out></a></td>
<td><c:out value="${language.creator}"></c:out></td>
<td><c:out value="${language.currentVersion}"></c:out></td>
</tr>
</c:forEach>
</tbody>
</table>
<a href = "/languages/new">New Language</a>
</body>
</html>