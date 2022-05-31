<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Add Video</title>
</head>
<body>
	<div>
		<h3>Add Video</h3>
		<div>
			<form
				action="${pageContext.request.contextPath }/addvideo/${cid }"
				method="post" class="bg-white">
				<div>
					<label for="cid">Course Id</label> <input type="text"
						class="form-control" id="cid" placeholder="Enter Course Id"
						name="cid" value="${cid }" required>
				</div>

				<div>
					<label for="title">Video Title</label> <input type="text"
						class="form-control" id="title" placeholder="Enter Video Title"
						name="title" required>
				</div>

				<div>
					<label for="description">Course Description</label> <input
						type="text" id="description"
						placeholder="Enter Course Description" name="description" required>
				</div>

				<div>
					<label for="link">Tutorial Link</label> <input type="text"
						id="link" placeholder="Enter The Tutorial Link" name="link"
						required>
				</div>

				<div class="container text-center mb-3">
					<button type="submit">ADD VIDEO</button>
				</div>
			</form>
		</div>
	</div>

</body>
</html>