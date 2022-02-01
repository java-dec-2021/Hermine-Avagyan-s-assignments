<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page isErrorPage="true"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<table>
<tr>
<th>Question</th>
<th>Tags</th>
</tr>
<c:forEach items = "${allQuestions }" var = "question">
<tr>
<td><a href = "/show/${question.id}">${question.qText}</a></td>

<td>
<p>
<c:forEach items = "${question.qtags}" var = "tagtext"> 
${tagtext.subject},
</c:forEach>
</p>
</td>

</tr>
</c:forEach>
</table>
</body>
</html>