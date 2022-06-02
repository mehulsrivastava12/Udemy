<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page isELIgnored="false" %>
<%@ include file="./base.jsp"%>
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
							<th scope="col">Course Price</th>
							<th scope="col">Instructor Id</th>
							<th scope="col">Add Video</th>
							<th scope="col">Show Tutorial</th>
						</tr>
					</thead>
					<tbody>
						<c:forEach items="${instructorCourse }" var="p">
						<tr>
								<th scope="row">${p.cid }</th>
								<td>${p.title }</td>
								<td>${p.description }</td>
								<td>${p.price }</td>
								<td>${p.instructor_id }</td>
								<td><a href="${pageContext.request.contextPath }/addvideoform/${p.cid}">Add Video</a></td>
								<td><a href="${pageContext.request.contextPath }/mycoursevideo/${p.cid}">Click Here</a></td>
							</tr>
						</c:forEach>
					</tbody>
				</table>
			</div>
		</div>
	</div>
</body>
</html>