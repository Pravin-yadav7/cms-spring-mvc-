<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page import="java.util.List"%>
<%@ page import="com.divergent.clinicspringmvc.entity.LabTest"%>

<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8" />
<meta http-equiv="X-UA-Compatible" content="IE=edge" />
<meta name="viewport" content="width=device-width, initial-scale=1.0" />
<title>CMS</title>


<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-eOJMYsd53ii+scO/bJGFsiCZc+5NDVN2yr8+0RDqr0Ql0h+rP48ckxlpbzKgwra6"
	crossorigin="anonymous">

<!--  <link rel="stylesheet" href="resources/styles.css">
-->
<script src="/springweb-jpa-sample//resources/js/bootstrap.min.js"></script>
<link href="/springweb-jpa-sample//resources/css/bootstrap.min.css"
	rel="stylesheet">

</head>
<body
	style="background: #fff url(resources/images/background.jpg) center center/cover no-repeat fixed;">

	<div class="text-center mt-5">
		<form action="labTest" method="post"
			style="max-width: 480px; margin: auto;">

			<h1 class="h3 mb-3 font-weight-normal">Insert Test Data</h1>
			
			<input type="number" class="form-control"
				placeholder="Test Id" name="test_id" required autofocus> 
			
			<input type="text" class="form-control"
				placeholder="Test Name" name="test_name" required autofocus>
							
			<input type="number" class="form-control"
				placeholder="Test Rate" name="test_rate" required autofocus>
			
			
			<div class="mt-3">
				<button class="btn btn-lg btn-primary btn-block" type="submit">Insert</button>
			</div>

		</form>
	</div>
	
	<table class="table caption-top">
			<caption>List of Test</caption>
			<thead>
				<tr>
					<th scope="col">Test Id</th>
					<th scope="col">Test Name</th>
					<th scope="col">Test Rate</th>
					<th scope="col">Delete</th>
				</tr>
			</thead>
			<tbody>
				
				

				<c:forEach items="${allLabTest}" var="test">
					<tr>
						<td scope="row"><c:out value="${test.testId}" /></td>
						<td><c:out value="${test.testName}" /></td>
						<td><c:out value="${test.testRate}" /></td>
						
						<td><a href="labTest/delete?id=${test.testId}"
							class="btn btn-danger" type="button">Delete</a></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>


	</div>


</body>
</html>

