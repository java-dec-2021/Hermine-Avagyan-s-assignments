<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page isErrorPage="true"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Show One question</title>
</head>
<body>
<h1>${question.qText}</h1>
<p>Tags:
<c:forEach items = "${question.qtags }" var = "tag">
${tag.subject},
</c:forEach>
</p>
<hr>
<h2>Answers for this Question</h2>
<ul>
<c:forEach items = "${question.answers}" var = "answer">
<li>${answer.aText}</li>
</c:forEach>
</ul>
<hr>
<h3>Add your Answer</h3>
<form:form method = "POST" action = "/addAnswer" modelAttribute = "answer">
<p>
<form:label path="aText">Answer</form:label>
<form:errors path = "aText"></form:errors>
<form:input path="aText"/>
<form:hidden path="quest" value = "${question.id }"/>
</p>
<button>Add Answer</button>
</form:form>
</body>
</html>