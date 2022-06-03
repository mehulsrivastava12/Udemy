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
			<ul>
				<img style="height: 100px; width: 100px; border-radius: 20px;"
					class="card-img-top mt-2"
					src="https://st2.depositphotos.com/3096625/7016/v/950/depositphotos_70164723-stock-illustration-online-language-learning-logo.jpg"
					alt="Card image cap" />
			</ul>
			<form action="search/${id }" method="post" class="ml-5 mt-3">
				<input style="border-radius: 10px; width: 500px;" type="text"
					placeholder="Search Here" name="instructor">
				<button class="tn btn-outline-info text-white my-2 my-sm-0"
					style="border-radius: 20px;">Search</button>
			</form>
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
	<c:forEach items="${instructorCourse }" var="p">
		<div class="card d-inline-flex ml-5 mr-5 mt-5" style="width: 18rem;">
			<a href="#"><img class="card-img-top"
				src="https://www.onlinecoursereport.com/wp-content/uploads/2020/06/shutterstock_1150510607-1024x512.jpg"
				alt="Card image cap"></a>
			<div class="card-body">
				<h5 class="card-title">${p.title }</h5>
				<p class="card-text">${p.description }</p>
				<p class="card-title">Price:- &#x20B9; ${p.price }</p>
			</div>
		</div>
	</c:forEach>
</body>
</html>