<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
	<title>CS4 - Home</title>
	<link rel="stylesheet" type="text/css" href="resources/css/main.css">
	<link rel="stylesheet" type="text/css" href="http://fontawesome.io/assets/font-awesome/css/font-awesome.css">
</head>
<body>
	<div class="header">
		<h1>Appointment Management System</h1>
		<ul>
		  <li><a class="active" href="index.html">Home</a></li>
		  <li><a href="search.html">Doctors</a></li>
		  <li><a href="profile.html">Profile</a></li>
		  <li><a href="appointment.html">Appointment</a></li>
		  <li><a href="profile.html">List</a></li>
		  <li class="right"><a href="#about">Login</a></li>
		  <li class="right">
		  	<form> <input type="text" class="search" placeholder="Search..."></input></form>
		  </li>
		  
		</ul>
	</div>
	<div class="content">
		<h1>DashBoard</h1>
		<!-- main content -->

		<div class="main">
			<!-- latest posts related to the user -->
			<div class="lists">
				<p>
					<i class="fa fa-heartbeat redcolor" aria-hidden="true"></i> <a href="#!">Tek Ale</a> want to set appointment with you at Aug 2nd 2016. 

					<a class="readmore" href="#">View Details</a>
				</p>
			</div>

			<div class="lists">
				<p>
					<i class="fa fa-user-md redcolor" aria-hidden="true"></i> <a href="#!">Dr. Angelona Jolie</a> set a appointment for you for 3rd Aug 2016.
					<a class="readmore" href="#">View Details</a>
				</p>
			</div>

			<div class="lists">
				<p>
					<i class="fa fa-heartbeat redcolor" aria-hidden="true"></i> <a href="#!">Brad Pitt</a> want to set appointment with you at Aug 2nd 2016. 

					<a class="readmore" href="#">View Details</a>
				</p>
			</div>

			<div class="lists">
				<p>
					<i class="fa fa-heartbeat redcolor" aria-hidden="true"></i> <a href="#!">Jack Sparrow</a> want to set appointment with you at Aug 2nd 2016. 

					<a class="readmore" href="#">View Details</a>
				</p>
			</div>
			<!-- latest posts ends -->
		</div>

		<!-- side bar -->
		<div class="sidebar">
			<ol>
			  <li><a href="#home">New Requests</a></li>
			  <li><a href="#news">My Patients</a></li>
			  <li><a href="#contact">Calender</a></li>
			  <li><a href="#about">Annual Report</a></li>
			</ol>
		</div>
	</div>

	<div class="footer">
		<p>All right reserved @2016</p>
		<p>Appointment reserved system</p>
	</div>
</body>
</html>