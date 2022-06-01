<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page isELIgnored="false" %>
<%@ include file="./base.jsp"%>
<!doctype html>
<html lang="en">
<head>
</head>
<body>
	<div>
		<h3>Fill The Details Of Courses</h3>
		<div>
			<form action="${pageContext.request.contextPath }/createcourse/${id }" method="post" class="bg-white">
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
					<label for="price">Course Price</label> <input type="text"
						id="price" placeholder="Enter Price Of Course"
						name="price" required>
				</div>

				<div>
				<input type="hidden"
						id="id" placeholder="Enter Id Of Course Instructor"
						name="id" value="${id }" >
				</div>

				<div class="container text-center mb-3">
					<button type="submit">ADD</button>
				</div>
			</form>
		</div>
	</div>
</body>
</html>