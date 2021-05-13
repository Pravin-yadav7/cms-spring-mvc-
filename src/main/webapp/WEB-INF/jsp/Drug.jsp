<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page import="java.util.List"%>
<%@ page import="com.divergent.clinicspringmvc.entity.Drug"%>

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
		<form action="drug" method="post"
			style="max-width: 480px; margin: auto;">

			<h1 class="h3 mb-3 font-weight-normal">Insert Drug Data</h1>
			
			<input type="number" class="form-control"
				placeholder="Drug Id" name="drug_id" required autofocus> 
			
			<input type="text" class="form-control"
				placeholder="Drug Name" name="drug_name" required autofocus>
			
			<input type="text" class="form-control"
				placeholder="Drug Weight" name="drug_weight" required autofocus>	

			<!-- <div class="mt-2 mb-2">
				<label>Gender</label>
				<input type="radio" name="gender" value="Male">
				<input type="radio" name="gender" value="Female">
			</div> -->
			
			<input type="text" class="form-control"
				placeholder="Drug Content" name="drug_content" required autofocus>
				
			<input type="number" class="form-control"
				placeholder="Expiry Date" name="expityDate" required autofocus>	
				
			<input type="text" class="form-control"
				placeholder="Brand Name" name="brandName" required autofocus>		
				
			<input type="number" class="form-control"
				placeholder="MRP" name="MRP" required autofocus>
			
			
			<div class="mt-3">
				<button class="btn btn-lg btn-primary btn-block" type="submit">Insert</button>
			</div>

		</form>
	</div>
	
	<div class="text-center mt-5">


		<table class="table caption-top">
			<caption>List of Drugs</caption>
			<thead>
				<tr>
					<th scope="col">Drug Id</th>
					<th scope="col">Name</th>
					<th scope="col">Weight</th>
					<th scope="col">Content</th>
					<th scope="col">Expiry Date</th>
					<th scope="col">Brand Name</th>
					<th scope="col">MRP</th>
					<th scope="col">Delete</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${allDrug}" var="drug">
					<tr>
						<td scope="row"><c:out value="${drug.drugId}" /></td>
						<td><c:out value="${drug.drugName}" /></td>
						<td><c:out value="${drug.drugWeight}" /></td>
						<td><c:out value="${drug.drugContent}" /></td>
						<td><c:out value="${drug.expiryDate}" /></td>
						<td><c:out value="${drug.brandName}" /></td>
						<td><c:out value="${drug.MRP}" /></td>

						<td><a href="drug/delete?id=${drug.drugId}"
							class="btn btn-danger" type="button">Delete</a></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>


	</div>


</body>
</html>

