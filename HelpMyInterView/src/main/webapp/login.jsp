<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<title>Login Page</title>
	<link rel="stylesheet" type="text/css" href="style1.css">
</head>
<body>
	<div class="login-box">
		<img src="user.png" class="avatar">
		<h1>Login Here</h1>
		<form action="getLogin" method="post">
			<p>Email ID</p>
			<input type="email" name="email" placeholder="Email ID" required>
			<p>Password</p>
			<input type="password" name="pass" placeholder="Password" required> 
			<input type="submit" name="submit" value="Login">
			<a href="reset.jsp">Forgot Password</a><br><br>
			<a href="registration.jsp">Create new account</a>
		</form>
	</div>

</body>
</html>