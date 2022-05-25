<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
    <%@page isELIgnored="false" %>
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
				<th scope="col">Enrollment Id</th>
				<th scope="col">User Id</th>
				<th scope="col">Course Id</th>
				<th scope="col">Date Enrolled</th>
			</tr>
		</thead>
		<tbody>
		<c:forEach items="${myCourse }" var="p">
			<tr>
				<th scope="row">${p.enrollmentId }</th>
				<td>${p.userId }</td>
				<td>${p.courseId }</td>
				<td>${p.date }</td>
			</tr>
			</c:forEach>
		</tbody>
	</table>
</body>
</html>