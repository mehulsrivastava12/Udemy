<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page isELIgnored="false"%>
<%@ include file="./base.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Instructor Details</title>
</head>
<body>
	<nav class="navbar navbar-expand-lg navbar-light bg-secondary">
		<div class="collapse navbar-collapse" id="navbarSupportedContent">
			<ul class="navbar-nav mr-auto ml-5">
				<li class="nav-item active"><a
					class="nav-link text-white font-weight-bold"
					href="getinstructor/${id }">Profile <span class="sr-only">(current)</span>
				</a></li>
				<li class="nav-item active ml-5"><a
					class="nav-link text-white font-weight-bold"
					href="addcourse/${id }">Add Course</a></li>
				<li class="nav-item active ml-5"><a
					class="nav-link text-white font-weight-bold"
					href="instructorcourse/${id }">My Courses <span class="sr-only">(current)</span></a>
				</li>
				<li class="nav-item active ml-5"><a
					class="nav-link text-white font-weight-bold"
					href="${pageContext.request.contextPath }/">Log Out <span
						class="sr-only">(current)</span></a></li>
			</ul>
		</div>
	</nav>
</body>
</html>