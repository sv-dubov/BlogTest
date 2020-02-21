<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="stag" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>News site list</title>
<style>
table {
  font-family: arial, sans-serif;
  border-collapse: collapse;
  width: 60%;
}

td, th {
  border: 1px solid #dddddd;
  text-align: left;
  padding: 8px;
}
</style>
</head>
<body style="background-color: #FFFFE0;">

<div style="margin-top:50px; margin-left:200px; height:50px;"><h2>Post List</h2></div>
	<table style="margin-top: 0px;margin-left: 100px; ">
		<tr>
			<th>Title</th>
			<th>Short description</th>
			<th>Description</th>
			<th>Meta</th>
			<th>URL slug</th>
			<th>Posted on</th>
			<th>Category</th>
			<th>Emp Id</th>
			<th></th>
			<th></th>
		</tr>
		<c:forEach items="${postList}" var="post">
			<tr>
				<td>${post.title}</td>
				<td>${post.shortDescription}</td>
				<td>${post.description}</td>
				<td>${post.meta}</td>
				<td>${post.urlSlug}</td>
				<td>${post.postedOn}</td>
				<td>${post.category}</td>
				
				<td>
					<a href="/edit?id=${post.id}" >Edit</a>
				</td>
				<td>
					<form action="/delete?id=${post.id}" method="post">
						<input type="submit" value="Delete" style="background:none;border:0px;cursor: pointer;"/>
					</form>
				</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>