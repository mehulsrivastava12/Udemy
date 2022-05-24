<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!doctype html>
<html lang="en">
<head>
<!-- Required meta tags -->
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">

<title>Sign Up Here</title>
</head>
<body>

	<div>

		<h3>Sign Up As Instructor</h3>
		<div>
		<form action="instructorregister" method="post">
			<div>
				<label for="firstName">First Name</label> <input type="text"
					id="firstName" aria-describedby="emailHelp"
					placeholder="Enter Name" name="firstName" required>
			</div>

			<div>
				<label for="lastName">Last Name</label> <input type="text"
					id="lastName" aria-describedby="emailHelp"
					placeholder="Enter Name" name="lastName" required>
			</div>
			<div>
				<label for="dob">Date Of Birth</label> <input type="date"
					id="dob" aria-describedby="emailHelp"
					placeholder="Enter Name" name="dob" required>
			</div>

			<div>
				<label for="exampleInputEmail1">Email Address</label> <input
					type="email" id="exampleInputEmail1"
					aria-describedby="emailHelp" placeholder="Enter email" name="email" required>
			</div>

			<div>
				<label for="password">Password</label> <input type="password"
					id="password" aria-describedby="emailHelp"
					placeholder="Enter Password" name="password" required>
			</div>

			<div>
				<button type="submit">Sign Up</button>
			</div>
		</form>
		</div>

	</div>
</body>
</html>