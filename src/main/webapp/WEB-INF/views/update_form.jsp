<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page isELIgnored="false"%>
<%@ include file="./base.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
</head>
<body class="bg-light">
	<div class="card mt-5 shadow-lg p-3 mb-5 bg-white rounded" style="width:500px;margin-left:450px">
		<h1 class="mt-5 mb-5 text-center card bg-light">Update Your Details</h1>
		<form action="${pageContext.request.contextPath }/update"
			method="post">
			<input type="hidden" value="${user.uid }" name="id" readOnly />
			<div>
				<label for="firstName mb-5">First Name</label><input class="form-control" type="text"
					id="firstName" name="firstName" placeholder="Enter Your First Name"
					value="${user.firstName }">
			</div>
			<div>
				<label for="lastName" class="mt-3">Last Name</label><input class="form-control" type="text"
					id="lastName" name="lastName" placeholder="Enter Your Last Name"
					value="${user.lastName }">
			</div>
			<div>
				<label for="dob" class="mt-3">Date Of Birth</label><input class="form-control" type="text" id="dob"
					name="dob" placeholder="Enter Your Date Of Birth"
					value="${user.dob }">
			</div>
			<div>
				<label for="email" class="mt-3">Email</label><input class="form-control" type="text" id="email"
					name="email" placeholder="Enter Your Email"
					value="${user.email }">
			</div>
			<div>
				<label for="password" class="mt-3">Password</label><input class="form-control" type="password"
					id="password" name="password" placeholder="Enter Your Password"
					value="${user.password }">
			</div>
			<div class="text-center">
				<button type="submit" class="btn btn-outline-success mt-5 ">Submit</button>
			</div>
		</form>
	</div>
</body>
</html>