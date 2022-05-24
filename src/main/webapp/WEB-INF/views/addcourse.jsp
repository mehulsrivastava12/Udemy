<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page isELIgnored="false" %>
<!doctype html>
<html lang="en">
<head>
</head>
<body>
	<div>
		<h3>Fill The Details Of Courses</h3>
		<div>
			<form action="${pageContext.request.contextPath }/createcourse" method="post" class="bg-white">
				<div>
					<label for="title">Course Title</label> <input type="text"
						class="form-control" id="title" placeholder="Enter Course Title"
						name="title" required>
				</div>

				<div>
					<label for="description">Course Description</label> <input
						type="text" id="description"
						placeholder="Enter Course Description" name="description" required>
				</div>

				<div>
					<label for="link">Tutorial Link</label> <input type="text"
						id="link"
						placeholder="Enter The Tutorial Link" name="link" required>
				</div>
				
				<div>
					<label for="price">Course Price</label> <input type="text"
						id="price" placeholder="Enter Price Of Course"
						name="price" required>
				</div>

				<div>
					<label for="id">Course Instructor</label> <input type="text"
						id="id" placeholder="Enter Id Of Course Instructor"
						name="id" value="${id }">
				</div>

				<div class="container text-center mb-3">
					<button type="submit">ADD</button>
				</div>
			</form>
		</div>
	</div>
</body>
</html>