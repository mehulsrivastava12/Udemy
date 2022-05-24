<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page isELIgnored="false"%>
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
				<th scope="row">${getInstructorDetail.id }</th>
				<td>${getInstructorDetail.firstName }</td>
				<td>${getInstructorDetail.lastName }</td>
				<td>${getInstructorDetail.dob }</td>
				<td>${getInstructorDetail.email }</td>
			</tr>
		</tbody>
	</table>
</body>
</html>