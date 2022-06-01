<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page isELIgnored="false"%>
<%@ include file="./base.jsp"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Instructor Details</title>
</head>
<body>
<h1>Instructor Details</h1>
	<table>
		<thead>
			<tr>
				<th scope="col">Instructor Id</th>
				<th scope="col">First Name</th>
				<th scope="col">Last Name</th>
				<th scope="col">Date Of Birth</th>
				<th scope="col">Email</th>
			</tr>
		</thead>
		<tbody>
			<tr>
				<th scope="row">${instructor.id }</th>
				<td>${instructor.firstName }</td>
				<td>${instructor.lastName }</td>
				<td>${instructor.dob }</td>
				<td>${instructor.email }</td>
			</tr>
		</tbody>
	</table>
			<button type="submit">
			<a href="${pageContext.request.contextPath }/updateinstructor/${instructor.id }">Click
				To Update Details</a>
		</button>
	</div>
	<div>
		<button type="submit">
			<a href="${pageContext.request.contextPath }/deleteinstructor/${instructor.id }">Delete Account</a>
		</button>
</body>
</html>