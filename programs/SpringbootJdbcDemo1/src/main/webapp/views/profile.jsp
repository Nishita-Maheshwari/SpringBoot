<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h3> Welcome : ${model_student.getName()} </h3>
	<h3> Email : ${model_student.getEmail()} </h3>
	<h3> Gender : ${model_student.getGender()} </h3>
	<h3> City : ${model_student.getCity()} </h3>
</body>
</html>