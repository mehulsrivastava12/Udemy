<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page isELIgnored="false"%>
<%@ include file="./base.jsp"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Result Based On Your Search</title>
</head>
<body>
<h4 class="mt-5 text-center">Result Based On Your Search</h4>
<ul>
<li>
<c:forEach items="${searchInstructor }" var="p">
<h4><a href="${pageContext.request.contextPath }/searchinstructorcourse/${uid }/${p.id}"  class="text-dark" style="text-decoration: none;">${p.firstName} ${p.lastName }</a></h4>
</c:forEach>
</li>
</ul>
</body>
</html>