<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>Login</title>
	</head>
	<body>
		<form action="<c:url value="/login"></c:url>" method="post">
		
			<table>
				<tr>
					<th>
						<label>Username: </label>
					</th>
					<th>
						<input type="text" name="username"></input>
					</th>
				</tr>
				<tr>
					<th>
						<label>Password1: </label>
					</th>
					<th>
						<input type="password" name="password1"></input>
					</th>
				</tr>
				<tr>
					<th>
						<label>Password2: </label>
					</th>
					<th>
						<input type="password" name="password2"></input>
					</th>
				</tr>
				<tr>
					<th></th>
					<th><input type="submit" value="Submit"></th>
				</tr>
			</table>
		</form>
	</body>
</html>