<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<title>Login Page</title>
	<link rel="stylesheet" type="text/css" href="style3.css">
</head>
<body>
	<div class="login-box">
		<img src="user.png" class="avatar">
		<h1>Reset Password</h1>
		<form action="getForgot" method="post">
			<p>Email ID</p>
			<input type="email" name="email" placeholder="Email ID" required>
			<p>User ID</p>
			<input type="text" name="userid" placeholder="User Id" required> 
			<input type="submit" name="submit" value="Reset Password">
		</form>
	</div>

</body>
</html>
