<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<title>Login Page</title>
	<link rel="stylesheet" type="text/css" href="style2.css">
</head>
<body>
	<div class="login-box">
		<img src="user.png" class="avatar">
		<h1>Register Here</h1>
		<form action="getRegister" method="post">
			<p>Email ID</p>
			<input type="email" name="email" placeholder="Email ID" required>
			<p>Institute Name</p>
			<input type="text" name="inst" placeholder="Institute" required>
			<p>User Id</p>
			<input type="text" name="userid" placeholder="User Id" required>
			<p>Password</p>
			<input type="password" name="pas" placeholder="Password" required> 
			<input type="submit" name="submit" value="Register">
			<a href="login.jsp">Already have an account</a>
		</form>
	</div>

</body>
</html>
    