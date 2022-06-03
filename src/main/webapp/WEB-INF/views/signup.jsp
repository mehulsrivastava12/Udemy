<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!doctype html>
<html lang="en">
<head>
<!-- Required meta tags -->
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">

<!-- Bootstrap CSS -->
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">

<title>Sign Up Here</title>
</head>
<body style="background-color:#95B9C7">
	<div class="container mt-2">
		<div class="card" style="width: 600px; margin-left: 250px;">
			<div class="mt-2 text-center"
				style="width: 350px; margin-left:125px;" >
				<h3 class="text-center mt-3 mb-3">Sign Up As User</h3>
			</div>
			<form action="register" method="post">
				<div class="form-group mt-5 ml-5 mr-5">
					<label for="firstName">First Name</label> <input type="text"
						class="form-control" id="firstName" aria-describedby="emailHelp"
						placeholder="Enter Name" name="firstName" required>
				</div>

				<div class="form-group ml-5 mr-5">
					<label for="lastName">Last Name</label> <input type="text"
						class="form-control" id="lastName" aria-describedby="emailHelp"
						placeholder="Enter Name" name="lastName" required>
				</div>
				<div class="form-group ml-5 mr-5">
					<label for="dob">Date Of Birth</label> <input type="date"
						class="form-control" id="dob" aria-describedby="emailHelp"
						placeholder="Enter Name" name="dob" required>
				</div>

				<div class="form-group ml-5 mr-5">
					<label for="exampleInputEmail1">Email Address</label> <input
						type="email" class="form-control" id="exampleInputEmail1"
						aria-describedby="emailHelp" placeholder="Enter email"
						name="email" required>
				</div>

				<div class="form-group ml-5 mr-5">
					<label for="password">Password</label> <input type="password"
						class="form-control" id="password" aria-describedby="emailHelp"
						placeholder="Enter Password" name="password" required>
				</div>

				<div class="container text-center mb-3">
					<button type="submit" class="btn btn-success">Sign Up</button>
				</div>

				<div class="text-center mb-2">
					<span>SignUp As Instructor !! <a href="signInstructor">SignUp
							As Instructor</a></span>
				</div>

			</form>
		</div>

	</div>

	<!-- Optional JavaScript -->
	<!-- jQuery first, then Popper.js, then Bootstrap JS -->
	<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"
		integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN"
		crossorigin="anonymous"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/popper.js@1.12.9/dist/umd/popper.min.js"
		integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q"
		crossorigin="anonymous"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/js/bootstrap.min.js"
		integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl"
		crossorigin="anonymous"></script>
</body>
</html>