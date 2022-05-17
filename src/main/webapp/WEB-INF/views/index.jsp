
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
					aria-expanded="false"> Courses </a>
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
			<form action="log-in" method="post">
				<button class="btn btn-outline-dark ml-5">LogIn</button>
			</form>
			<form action="sign-up" method="post">
				<button class="btn btn-outline-dark my-2 my-sm-0 ml-5">SignUp</button>
			</form>
		</div>
	</nav>

	<h1 class="text-center mb-5">Welcome To OnLearning</h1>
	<div class="container mt-5 d-flex">
	<d:forEach items="${courses }" var="p">
	<div class="card" style="width: 18rem;">
  <img class="card-img-top" src="2.png" alt="Card image cap">
  <div class="card-body">
  
    <h5 class="card-title">${p.title }</h5>
    <p class="card-text">${p.description }</p>
    <p class="card-text font-weight-bold">${p.instructor}</p>
    <a href="#" class="btn btn-primary">Go To Course</a>
    
  </div>
</div>
</d:forEach>
	</div>
</body>
</html>