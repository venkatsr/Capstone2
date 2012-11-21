<?xml version="1.0" encoding="ISO-8859-1" ?>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
<link rel="stylesheet" type="text/css" href="style.css" />
<title>Mechanic View</title>
</head>
<body>
	<div id="logo">
		<img src="ASASLogo.png" />
	</div>

<h3 align="center">Profile | Settings</h3>

<div id="box">
	
	<div align="center">
	<table>
	<tr>
	<th>Cust Info</th>
	<th>Vehicle</th>
	</tr>
		<tr>
			<td valign="top">
				
					<table class="inTable">
						<tr>
							<td>Name</td>
							<td>Test Name</td>
						</tr>
						<tr>
							<td>Address</td>
							<td>Test Address</td>
						</tr>
						<tr>
							<td>Phone</td>
							<td>Test Phone</td>
						</tr>
					</table>
				
			</td>
			<td>
			
				<table class="inTable">
					<tr>
						<th>Model</th>
						<th>Colour</th>
						<th>Plate</th>
						<th>Status</th>
					</tr>
					<%
						int count = 6;
						for (int i = 0; i < count; i++) {
							out.println("<tr><td><a>Test Model " + i + "</a></td>");
							out.println("<td>Test Colour " + i + "</td>");
							out.println("<td>Test Plate " + i + "</td>");
							out.println("<td>Test Status " + i + "</td></tr>");
						}
					%>

				</table>
				<form action="add_edit.jsp" method="post">
					<input type="submit" name="vehicleButton" value="Add Vehicle" />
				</form>
			</td>
		</tr>
	</table>
	</div>
	</div>
</body>
</html>