<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page isELIgnored="false"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Courses</title>
</head>
<body>
<body>
	<table>
		<thead>
			<tr>
				<th>Course Id</th>
				<th>Course Title</th>
				<th>Course Description</th>
				<th>Course Link</th>
				<th>Course Price</th>
				<th>Instructor Id</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${searchCourses }" var="p">
				<tr>
					<th>${p.cid }</th>
					<td>${p.title }</td>
					<td>${p.description }</td>
					<td><a href="${p.link }">Click Here</a></td>
					<td>${p.price }</td>
					<td>${p.id }</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</body>
</html>