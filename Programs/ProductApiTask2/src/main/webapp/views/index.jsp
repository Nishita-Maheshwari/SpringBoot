<%@page import="in.sp.main.beans.Products"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
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
		
	<%
		List<Products> productsList = (List<Products>) request.getAttribute("model_productsList");
		for(Products products : productsList)
		{
			%>
		<tr>
			<td> <%= products.getId() %> </td>
			<td> <%= products.getTitle() %> </td>
			<td> <%= products.getPrice() %> </td>
			<td> <img src="<%= products.getThumbnail() %>" alt="" width="100" /></td>
		</tr>
			<%
		}
	%>
	</table>
	
	<%
		int total_pages = (int) request.getAttribute("model_totalPages");
		for(int i=1; i<=total_pages; i++)
		{
			%>
			<a href="/products?page=<%=i%>"><%=i%></a>
			<%
		}
	%>
</body>
</html>