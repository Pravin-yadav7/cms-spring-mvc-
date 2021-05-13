<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>



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

<script src="resources/js/bootstrap.min.js"></script>
<link href="resources/css/bootstrap.min.css" rel="stylesheet">

</head>
<body
	style="background: #fff url(resources/images/background.jpg) center center/cover no-repeat fixed;">


		<div class="text-center mt-5">
		<form action="appointment" method="post"
			style="max-width: 480px; margin: auto;">

			<h1 class="h3 mb-3 font-weight-normal">Make Appointment</h1>
			
			<input type="number" class="form-control"
				placeholder="Patient Name" name="patient_name" required autofocus> 
			
			<input type="text" class="form-control"
				placeholder="Doctor Name" name="doctor_name" required autofocus>
			
			<input type="number" class="form-control"
				placeholder="Date" name="appointment_date" required autofocus>	
				
			<input type="number" class="form-control"
				placeholder="Time" name="appointment_time" required autofocus>
			
			
			<div class="mt-3">
				<button class="btn btn-lg btn-primary btn-block" type="submit">Appoint</button>
			</div>

		</form>
	</div>


</body>
</html>

