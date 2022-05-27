<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>User Details</title>
</head>
<body>
	<h1>User Details</h1>
	<table>
		<thead>
			<tr>
				<th scope="col">First Name</th>
				<th scope="col">Last Name</th>
				<th scope="col">Date Of Birth</th>
				<th scope="col">Email</th>
			</tr>
		</thead>
		<tbody>
			<tr>
				<td>${user.firstName }</td>
				<td>${user.lastName }</td>
				<td>${user.dob }</td>
				<td>${user.email }</td>
			</tr>
		</tbody>
	</table>
	<div>
		<button type="submit">
			<a href="${pageContext.request.contextPath }/update/${user.uid }">Click
				To Update Details</a>
		</button>
	</div>
	<div>
		<button type="submit">
			<a href="${pageContext.request.contextPath }/delete/${user.uid }">Delete Account</a>
		</button>
	</div>
</body>
</html>