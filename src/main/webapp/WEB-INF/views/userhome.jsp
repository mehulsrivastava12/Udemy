<%@page import="org.hibernate.internal.build.AllowSysOut"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>User Home Page</title>
</head>
<body>
	<form action="searchinstructor" method="post">
		<input type="text" placeholder="Search Here" name="instructor">
		<button>Search</button>
	</form>
	<div>
		<a href="detail/${uid }">My Details</a>
	</div>
	<div>
		<a href="mycourses/${uid }">My Courses</a>
	</div>
	<div>
		<a href="allCourses/${uid }">All Courses</a>
	</div>
</body>
</html>