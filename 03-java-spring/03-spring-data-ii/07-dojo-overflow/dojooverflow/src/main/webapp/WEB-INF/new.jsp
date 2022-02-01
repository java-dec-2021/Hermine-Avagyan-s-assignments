<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page isErrorPage="true"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>New Question</title>
</head>
<body>
<form:form method = "POST" action = "/newQuestion" modelAttribute = "question">
<p>
<form:label path="qText">Question</form:label>
<form:errors path = "qText"></form:errors>
<form:textarea path="qText"/>
</p>

<p>
<form:label path="tagsFromFrontEnd">Tags(seperate by comma)</form:label>
<form:errors path = "tagsFromFrontEnd"></form:errors>
<form:textarea path="tagsFromFrontEnd"/>
</p>

<button>Submit Question</button>
</form:form>
</body>
</html>