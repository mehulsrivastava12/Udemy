<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page isELIgnored="false"%>
<%@ include file="./base.jsp"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Instructor Course</title>
</head>
<body>
	<c:forEach items="${searchInstructor }" var="p">
<h4><a href="${pageContext.request.contextPath }/instructorcourse/${p.id}">${p.firstName} ${p.lastName }</a></h4>
</c:forEach>

</body>
</html>