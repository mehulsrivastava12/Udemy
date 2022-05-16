<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!doctype html>
<html lang="en">
<head>
<%@ include file="./base.jsp"%>
</head>
<body class="bg-secondary">
	<div class="container mt-5">
		<h3 class="text-center mb-5">Fill The Details Of Courses</h3>
		<div class="card" style="width: 600px; margin-left: 250px;">
			<form action="courses" method="post" class="bg-white">
				<div class="form-group mt-5 ml-5 mr-5">
					<label for="title">Course Title</label> <input type="text"
						class="form-control" id="title" placeholder="Enter Course Title"
						name="title" required>
				</div>

				<div class="form-group ml-5 mr-5">
					<label for="description">Course Description</label> <input
						type="text" class="form-control" id="description"
						placeholder="Enter Course Description" name="description" required>
				</div>

				<div class="form-group ml-5 mr-5">
					<label for="link">Tutorial Link</label> <input type="text"
						class="form-control" id="link"
						placeholder="Enter The Tutorial Link" name="link" required>
				</div>

				<div class="form-group mt-5 ml-5 mr-5">
					<label for="instructor">Course Instructor</label> <input type="text"
						class="form-control" id="instructor" placeholder="Enter Name Of Course Instructor"
						name="instructor" required>
				</div>

				<div class="container text-center mb-3">
					<button type="submit" class="btn btn-primary">ADD</button>
				</div>


			</form>
		</div>
	</div>
</body>
</html>