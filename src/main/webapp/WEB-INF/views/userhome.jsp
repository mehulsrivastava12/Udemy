<%@page import="org.hibernate.internal.build.AllowSysOut"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page isELIgnored="false"%>
<%@ include file="./base.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>User Home Page</title>
</head>
<body>
	<form action="search" method="post" class="ml-5 mt-3">
		<input style="border-radius:10px;width: 500px;" type="text" placeholder="Search Here" name="instructor">
		<button class="btn btn-primary" style="border-radius:20px;">Search</button>
	</form>
	<ul>
		<li><a href="detail/${uid }">My Details</a></li>
		<li><a href="mycourses/${uid }">My Courses</a></li>
		<li><a href="allCourses/${uid }">All Courses</a></li>
	</ul>
</body>
</html>