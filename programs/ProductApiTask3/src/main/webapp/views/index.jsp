<%@page import="in.sp.main.beans.Products"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<table>
		<tr>
			<th> Id </th>
			<th> title </th>
			<th> Price </th>
			<th> Image </th>
		</tr>
		<c:forEach var="productsList" items="${model_productsList}">
			<tr>
				<td> ${productsList.getId()} </td>
				<td> ${productsList.getTitle()} </td>
				<td> ${productsList.getPrice()} </td>
				<td> <img src="${productsList.getThumbnail()}" alt="" width="100" /> </td>
			</tr>
		</c:forEach>
	</table>
	
	<c:if test="${model_currentPage > 1}">
		<a href="/products?page=${model_currentPage-1}">Previous</a>
	</c:if>
	
	<c:forEach var="pageNo" begin="1" end="${model_totalPages}">
		<a href="/products?page=${pageNo}">${pageNo}</a>
	</c:forEach>
	
	<c:if test="${model_currentPage < model_totalPages}">
		<a href="/products?page=${model_currentPage+1}">Next</a>
	</c:if>

</body>
</html>