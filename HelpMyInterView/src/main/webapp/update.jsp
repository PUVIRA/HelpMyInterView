<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<title>Update Password</title>
	<link rel="stylesheet" type="text/css" href="style4.css">
</head>
<body>
	<div class="login-box">
		<img src="user.png" class="avatar">
		<h1>Update Password</h1>
		<form action="getUpdate" method="post">
			<p>Password</p>
			<input type="password" name="pass" required>
			<p>Retype Password</p>
			<input type="password" name="repass" required> 
			<input type="submit" name="submit" value="Update Password">
		</form>
	</div>

</body>
</html>
