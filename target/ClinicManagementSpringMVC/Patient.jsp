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

<script src="/springweb-jpa-sample//resources/js/bootstrap.min.js"></script>
<link href="/springweb-jpa-sample//resources/css/bootstrap.min.css"
	rel="stylesheet">

</head>
<body
	style="background: #fff url(resources/images/background.jpg) center center/cover no-repeat fixed;">

	<div class="text-center mt-5">
		<form action="patient" method="post"
			style="max-width: 480px; margin: auto;">

			<h1 class="h3 mb-3 font-weight-normal">Insert Patient Data</h1>

			<input type="number" class="form-control" placeholder="Patient Id"
				name="patient_id" required autofocus> <input type="text"
				class="form-control" placeholder="Patient Name" name="patient_name"
				required autofocus> <input type="text" class="form-control"
				placeholder="Address" name="address" required autofocus>

			<!-- <div class="mt-2 mb-2">
				<label>Gender</label>
				<input type="radio" name="gender" value="Male">
				<input type="radio" name="gender" value="Female">
			</div> -->

			<input type="text" class="form-control" placeholder="Disease"
				name="patient_disease" required autofocus> <input
				type="number" class="form-control" placeholder="Age" name="age"
				required autofocus> <input type="number"
				class="form-control" placeholder="Contact Number" name="contactNo"
				required autofocus>


			<div class="mt-3">
				<button class="btn btn-lg btn-primary btn-block" type="submit">Insert</button>
			</div>

		</form>
	</div>


	<div class="row">
		<div class="col-md-6">
			<legend>Patient List</legend>
			<div class="table-responsive">
				<table id="example" class="table table-striped table-bordered">
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
								<td scope="row"><c:out value="${patient.id}" /></td>
								<td><c:out value="${patient.name}" /></td>
								<td><c:out value="${patient.address}" /></td>
								<td><c:out value="${patient.disease}" /></td>
								<td><c:out value="${patient.age}" /></td>
								<td><c:out value="${patient.contactNo}" /></td>

								<td><a href="patient/delete?id=${patient.id}"
									class="btn btn-danger" type="button">Delete</a></td>
							</tr>
						</c:forEach>
					</tbody>
				</table>
			</div>
		</div>
		<div class="col-md-6"></div>
	</div>

</body>
</html>

