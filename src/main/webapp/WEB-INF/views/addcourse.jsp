<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Add Course</title>
</head>
<body>
	<div>
		<h3>ADD COURSE</h3>
		<div>
			<form action="courseform/${i.id }" method="post">
				<div>
					<label for="title">Title</label><input type="text" id="title"
						placeholder="Enter the Course Title" name="title" required>
				</div>
				<div>
					<label for="description">Description</label><input type="text"
						id="description" placeholder="Enter The Decription"
						name="description" required>
				</div>
				<div>
					<label for="link">Link</label><input type="text" id="link"
						placeholder="Enter The Link" name="link" required>
				</div>
				<div>
					<label for="price">Price</label><input type="text" id="price"
						placeholder="Enter The Price" name="price" required>
				</div>
				<div>
					<label for="id">Instructor Id</label><input type="text" id="id"
						placeholder="Instructor Id" name="id" value="${i.id}">
				</div>
				<div>
					<button type="submit">ADD</button>
				</div>
			</form>
		</div>
	</div>
</body>
</html>