<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<%@taglib prefix="d" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page isELIgnored="false" %>
<head>
<meta charset="UTF-8">
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<title>Log In As Instructor</title>
</head>
<body>
	<div>
		<h3>LogIn As Instructor</h3>
		<div>
			<form action="instructorhome" method="post">
				<div>
					<label for="exampleInputEmail1">Email</label><input type="email"
						id="exapmleInputEmail1" placeholder="Enter The Email" name="email">
				</div>
				
				<div>
					<label for="password">Password</label><input type="password"
						id="password" placeholder="Enter the Password" name="password">
				</div>
				<div>
					<button type="submit">LogIn</button>
				</div>
				<div>
					<span>Don't Have A Account? 
					<a href="signupInstructor">Sign Up</a></span>
				</div>
			</form>
		</div>
	</div>
</body>
</html>