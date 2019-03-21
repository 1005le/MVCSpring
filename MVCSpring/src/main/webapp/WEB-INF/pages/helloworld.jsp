<%@page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" context="text/html"; charset="UTF-8">
<title>Spring MVC -HelloWorld</title>

<link href="<c:url value='/resouce/css/style.css' />">
<script type="text/javascript" src="<c:url value='/resouce/js/main.js' />">
</script>
</head>
 
 
<body>
<img src="<c:url value='/resouce/images/1.png' />">
<img src="<c:url value='/resouce/images/2.png' />">
<img src="<c:url value='/resouce/images/3.png' />">
    <h1>${greeting}</h1> 
    <p> ${person.name}</h1></p>
</body>
 
 
</html>