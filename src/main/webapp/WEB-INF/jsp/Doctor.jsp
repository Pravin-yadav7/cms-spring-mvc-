<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page import="java.util.List"%>
<%@ page import="com.divergent.clinicspringmvc.entity.Doctor"%>

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
		<form action="doctor" method="post"
			style="max-width: 480px; margin: auto;">

			<h1 class="h3 mb-3 font-weight-normal">Insert Doctor Data</h1>
			
			<input type="number" class="form-control"
				placeholder="Doctor Id" name="doctor_id" required autofocus> 
			
			<input type="text" class="form-control"
				placeholder="Doctor Name" name="doctor_name" required autofocus>
			
			<input type="text" class="form-control"
				placeholder="Email" name="email" required autofocus>	

			<!-- <div class="mt-2 mb-2">
				<label>Gender</label>
				<input type="radio" name="gender" value="Male">
				<input type="radio" name="gender" value="Female">
			</div> -->
			
			<input type="text" class="form-control"
				placeholder="Degree" name="degree" required autofocus>
			
			<input type="text" class="form-control"
				placeholder="Specialization" name="specilization" required autofocus>
				
			<input type="number" class="form-control"
				placeholder="Doctor Fee" name="doctor_fee" required autofocus>	
			
			<input type="text" class="form-control"
				placeholder="Address" name="address" required autofocus>	
				
			<input type="number" class="form-control"
				placeholder="Contact Number" name="contactNo" required autofocus>
			
			
			<div class="mt-3">
				<button class="btn btn-lg btn-primary btn-block" type="submit">Insert</button>
			</div>

		</form>
	</div>
	
	<div class="text-center mt-5">


		<table class="table caption-top">
			<caption>List of Doctors</caption>
			<thead>
				<tr>
					<th scope="col">Doctor Id</th>
					<th scope="col">Name</th>
					<th scope="col">Email</th>
					<th scope="col">Degree</th>
					<th scope="col">Specialization</th>
					<th scope="col">Fee</th>
					<th scope="col">Address</th>
					<th scope="col">Contact Number</th>
					<th scope="col">Delete</th>
				</tr>
			</thead>
			<tbody>
				
				

				<c:forEach items="${allDoctor}" var="doctor">
					<tr>
						<td scope="row"><c:out value="${doctor.doctorId}" /></td>
						<td><c:out value="${doctor.name}" /></td>
						<td><c:out value="${doctor.email}" /></td>
						<td><c:out value="${doctor.degree}" /></td>
						<td><c:out value="${doctor.specialization}" /></td>
						<td><c:out value="${doctor.fee}" /></td>
						<td><c:out value="${doctor.address}" /></td>
						<td><c:out value="${doctor.contactNo}" /></td>
						
						<td><a href="doctor/delete?doctorId=${doctor.doctorId}"
							class="btn btn-danger" type="button">Delete</a></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>


	</div>


</body>
</html>

