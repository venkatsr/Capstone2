<?xml version="1.0" encoding="ISO-8859-1" ?>
<%@ page language="java" import="java.util.*, capstone.*" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
<title>New User Created</title>
</head>
<body>
	<div>
		<img src="ASASLogo.png" />
	</div>
	<div>
		<h2>New User Created</h2>
	</div>
	<%
	if(session != null){
		if(session.getAttribute("buttonPressed").equals("createUser")){
			ArrayList<UserInfo> userList = (ArrayList<UserInfo>)session.getAttribute("statename");
			if(userList != null){
				for(UserInfo users : userList){
					out.println("User Type: " + users.getType() + " First Name: " + "<b>" + users.getFirstName() + "</b>" + " Last Name: " + users.getLastName() + " User Name: " + users.getUserName());
					out.println("<br />");
				}
			}
		}
	}
	%>
	<div style="float:center">
	<a href="register.xhtml">Register Another User</a>
	</div>
</body>
</html>