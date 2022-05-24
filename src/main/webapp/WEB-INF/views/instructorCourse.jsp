<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page isELIgnored="false" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Instructor Course</title>
</head>
<body>
	<div>
		<div>
			<div>
				<h1>Instructor Courses</h1>
				<table>
					<thead>
						<tr>
							<th scope="col">Course Id</th>
							<th scope="col">Course Title</th>
							<th scope="col">Course Description</th>
							<th scope="col">Course Link</th>
							<th scope="col">Course Price</th>
							<th scope="col">Instructor Id</th>
						</tr>
					</thead>
					<tbody>
						<c:forEach items="${instructorCourse }" var="p">
							<tr>
								<th scope="row">${p.id }</th>
								<td>${p.title }</td>
								<td>${p.description }</td>
								<td><a href="${p.link }">Click Here</a></td>
								<td>${p.price }</td>
								<td>${p.id }</td>
							</tr>
						</c:forEach>
					</tbody>
				</table>
			</div>
		</div>
	</div>
</body>
</html>