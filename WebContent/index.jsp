<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Ejemplo Servlet</h1>
	<!-- En action especificamos a que mapping queremos que nos redirija -->
	<form action="Mainservlet" method=post>
		<label>Username:</label><input name="user" type="text">
		<label>Password:</label><input name="pass" type="password">
		<input type="submit" value="enviar">
	</form>
</body>
</html>