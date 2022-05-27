<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
</head>
<body>
	<h1 class=>Change Your Details</h1>
	<form action="${pageContext.request.contextPath }/updateinstructor" method="post">
		<input type="text" value="${instructor.id }" name="id" readOnly />
		<div>
			<label for="firstName">First Name</label><input type="text"
				id="firstName" name="firstName" placeholder="Enter Your First Name"
				value="${instructor.firstName }">
		</div>
		<div>
			<label for="lastName">Last Name</label><input type="text"
				id="lastName" name="lastName" placeholder="Enter Your Last Name"
				value="${instructor.lastName }">
		</div>
		<div>
			<label for="dob">Date Of Birth</label><input type="text" id="dob"
				name="dob" placeholder="Enter Your Date Of Birth"
				value="${instructor.dob }">
		</div>
		<div>
			<label for="email">Email</label><input type="text" id="email"
				name="email" placeholder="Enter Your Email" value="${instructor.email }">
		</div>
		<div>
			<label for="password">Password</label><input type="text" id="password"
				name="password" placeholder="Enter Your Password" value="${instructor.password }">
		</div>
		<div>
			<button type="submit">Submit</button>
		</div>
	</form>
</body>
</html>