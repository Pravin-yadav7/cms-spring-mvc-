<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page import="java.util.List"%>
<%@ page import="com.divergent.clinicspringmvc.entity.Patient"%>

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
	
<script src="/springweb-jpa-sample//resources/js/bootstrap.min.js"></script>
<link href="/springweb-jpa-sample//resources/css/bootstrap.min.css"
	rel="stylesheet">

</head>
<body>

	<div class="text-center mt-5">
		<form action="patient" method="post"
			style="max-width: 480px; margin: auto;">

			<h1 class="h3 mb-3 font-weight-normal">Insert Patient Data</h1>

			<input type="number" class="form-control" placeholder="Patient Id"
				name="patient_id" required autofocus> 
			<input type="text"class="form-control" placeholder="Patient Name" 
				name="patient_name"required autofocus> 
			<input type="text" class="form-control"
				placeholder="Address" name="address" required autofocus>

			<!-- <div class="mt-2 mb-2">
				<label>Gender</label>
				<input type="radio" name="gender" value="Male">
				<input type="radio" name="gender" value="Female">
			</div> -->

			<input type="text" class="form-control" placeholder="Disease"
				name="patient_disease" required autofocus>
		    <input type="number" class="form-control" placeholder="Age" 
		    	name="age" required autofocus> 
		    <input type="number"class="form-control" placeholder="Contact Number"
		    	 name="contactNo" required autofocus>


			<div class="mt-3">
				<button class="btn btn-lg btn-primary btn-block" type="submit">Insert</button>
			</div>

		</form>
	</div>

	<div class="text-center mt-5">


		<table class="table caption-top">
			<caption>List of Patients</caption>
			<thead>
				<tr>
					<th scope="col">Patient Id</th>
					<th scope="col">Name</th>
					<th scope="col">Address</th>
					<th scope="col">Disease</th>
					<th scope="col">Age</th>
					<th scope="col">Contact Number</th>
					<th scope="col">Delete</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${allPatient}" var="patient">
					<tr>
						<td scope="row"><c:out value="${patient.patientId}" /></td>
						<td><c:out value="${patient.patientName}" /></td>
						<td><c:out value="${patient.address}" /></td>
						<td><c:out value="${patient.disease}" /></td>
						<td><c:out value="${patient.age}" /></td>
						<td><c:out value="${patient.contactNo}" /></td>

						<td><a href="patient/delete?patientId=${patient.patientId}"
							class="btn btn-danger" type="button">Delete</a></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>


	</div>



</body>
</html>

