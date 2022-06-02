<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@page isELIgnored="false" %>
	<%@ include file="./base.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Add Video</title>
</head>
<body class="bg-light">
	<div class="card mt-5 shadow p-3 mb-5 bg-white rounded" style="width:500px;margin-left:450px">
		<h3 class="text-center mt-5">Add Video To Course</h3>
		<div>
			<form
				action="${pageContext.request.contextPath }/addvideo/${cid }"
				method="post" class="bg-white">
				<div>
				<input type="hidden"
						class="form-control" id="cid" placeholder="Enter Course Id"
						name="cid" value="${cid }" required>
				</div>

				<div>
					<label for="title" class="mt-5">Video Title</label> <input type="text"
						class="form-control" id="title" placeholder="Enter Video Title"
						name="title" required>
				</div>

				<div>
					<label for="description" class="mt-3">Course Description</label> <input
						type="text" id="description" class="form-control" 
						placeholder="Enter Course Description" name="description" required>
				</div>

				<div>
					<label for="link" class="mt-3">Tutorial Link</label> <input type="text"
						id="link" class="form-control" placeholder="Enter The Tutorial Link" name="link"
						required>
				</div>

				<div class="container text-center mb-3 mt-5">
					<button type="submit" class="btn btn-outline-success">ADD VIDEO</button>
				</div>
			</form>
		</div>
	</div>

</body>
</html>