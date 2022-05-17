
<!doctype html>
<html lang="en">
<%@ include file="./base.jsp"%>
<%@taglib prefix="d" uri="http://java.sun.com/jsp/jstl/core"%>
<head>
<title>Online Courses</title>
</head>
<body>
	<nav class="navbar navbar-expand-lg navbar-light bg-light">
		<div class="collapse navbar-collapse" id="navbarSupportedContent">
			<ul class="navbar-nav mr-auto">
				<li class="nav-item dropdown"><a
					class="nav-link dropdown-toggle" href="#" id="navbarDropdown"
					role="button" data-toggle="dropdown" aria-haspopup="true"
					aria-expanded="false">My Courses </a>
					<div class="dropdown-menu" aria-labelledby="navbarDropdown">
						<a class="dropdown-item" href="#">Data Structure</a> <a
							class="dropdown-item" href="#">Full Stack Developer</a> <a
							class="dropdown-item" href="#">Java Core</a> <a
							class="dropdown-item" href="#">Python</a> <a
							class="dropdown-item" href="#">Machine Learning</a>
						<div class="dropdown-divider"></div>
						<a class="dropdown-item" href="#">Communication</a>
					</div></li>
			</ul>
			
			<form class="form-inline my-2 my-lg-0">
				<input class="form-control mr-sm-2" type="search"
					style="width: 600px;" placeholder="Search" aria-label="Search">
				<button class="btn btn-outline-primary my-2 my-sm-0 ml-2"
					type="submit">Search</button>
			</form>
		</div>
		<div>
		<ul class="navbar-nav mr-auto">
				<li class="nav-item dropdown"><a
					class="nav-link dropdown-toggle" href="#" id="navbarDropdown"
					role="button" data-toggle="dropdown" aria-haspopup="true"
					aria-expanded="false">User Name </a>
					<div class="dropdown-menu" aria-labelledby="navbarDropdown">
						<a class="dropdown-item" href="myprofile/${us.uid }">My Profile</a> <a
							class="dropdown-item" href="log-out">Log Out</a>
					</div></li>
			</ul>
		</div>

	</nav>

	<div class="container mt-3">
		<div class="row">
			<div class="col-md-12">
				<h1 class="text-center mb-3">Welcome To OnLearning</h1>
				<table class="table table-hover">
					<thead class="thead-dark">
						<tr>
							<th scope="col">Course Title</th>
							<th scope="col">Course Instructor</th>
							<th scope="col">Course Description</th>
							<th scope="col">Course Link</th>
						</tr>
					</thead>
					<tbody>
						<d:forEach items="${courses }" var="p">
							<tr>
								<th scope="row">${p.title }</th>
								<td>${p.instructor }</td>
								<td>${p.description }</td>
								<td><a href="${p.link }">Click Here</a></td>
							</tr>
						</d:forEach>
					</tbody>
				</table>
			</div>
		</div>
	</div>
</body>
</html>