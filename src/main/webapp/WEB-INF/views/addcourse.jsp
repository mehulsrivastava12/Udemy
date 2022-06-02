<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page isELIgnored="false" %>
<%@ include file="./base.jsp"%>
<!doctype html>
<html lang="en">
<head>
</head>
<body class="bg-light">
	<div class="card mt-5 shadow p-3 mb-5 bg-white rounded" style="width:500px;margin-left:450px">
		<h3 class="text-center">Add Details Of Course</h3>
		<div>
			<form action="${pageContext.request.contextPath }/createcourse/${id }" method="post" class="bg-white">
				<div>
					<label for="title" class="mt-5">Course Title</label> <input type="text"
						class="form-control" id="title" placeholder="Enter Course Title"
						name="title" required>
				</div>

				<div>
					<label for="description" class="mt-3">Course Description</label> <input
						type="text" id="description" class="form-control"
						placeholder="Enter Course Description" name="description" required>
				</div>

				
				<div>
					<label for="price" class="mt-3">Course Price</label> <input type="text"
						id="price" placeholder="Enter Price Of Course" class="form-control"
						name="price" required>
				</div>

				<div>
				<input type="hidden"
						id="instructor_id" placeholder="Enter Id Of Course Instructor"
						name="instructor_id" value="${id }" >
				</div>

				<div class="container text-center mb-3 mt-5">
					<button type="submit" class="btn btn-outline-success">ADD</button>
				</div>
			</form>
		</div>
	</div>
</body>
</html>