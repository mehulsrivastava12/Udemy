<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
    <%@page isELIgnored="false" %>
    <%@ include file="./base.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>My Courses</title>
</head>
<body>
<h3>My Courses</h3>
<table>

		<thead>
			<tr>
				<th scope="col">Course Title</th>
				<th scope="col">Instructor Name</th>
				<th scope="col">Date Enrolled</th>
			</tr>
		</thead>
		<tbody>
		<c:forEach items="${myCourse }" var="p">
			<tr>
				<td scope="row">${p.title}</td>
				<td>${p.firstName } ${p.lastName }</td>
				<td>${p.date }</td>
			</tr>
			</c:forEach>

		</tbody>
	</table>
</body>
</html>