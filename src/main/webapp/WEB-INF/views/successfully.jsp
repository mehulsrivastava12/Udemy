<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page isELIgnored="false" %>
    <%@ include file="./base.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Enrolled Successfully</title>
</head>
<body>
<h3>Successfully Enrolled to the Course</h3>
<form action="${pageContext.request.contextPath }/mycourses/${uid}">
<button type="submit">Go To My Course</button>
</form>
</body>
</html>