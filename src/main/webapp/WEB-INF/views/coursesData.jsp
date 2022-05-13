<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!doctype html>
<html lang="en">
<head>
<%@ include file="./base.jsp"%>
</head>
<body>
	<div class="container mt-5">
		<h3 class="text-center mb-5">Fill The Details Of Courses</h3>
		<div class="card" style="width: 600px; margin-left: 250px;">
			<form action="home" method="post">
				<div class="form-group mt-5 ml-5 mr-5">
					<label for="title">Course Title</label> <input type="text"
						class="form-control" id="title" placeholder="Enter Course Title"
						name="title" required>
				</div>

				<div class="form-group ml-5 mr-5">
					<label for="description">Course Description</label> <input
						type="text" class="form-control" id="description"
						aria-describedby="emailHelp"
						placeholder="Enter Course Description" name="description" required>
				</div>

				<div class="form-group ml-5 mr-5">
					<label for="tutorial">Tutorial Link</label> <input
						type="text" class="form-control" id="tutorial"
						placeholder="Enter The Tutorial Link" name="tutorial" required>
				</div>



			</form>
		</div>
	</div>
</body>
</html>