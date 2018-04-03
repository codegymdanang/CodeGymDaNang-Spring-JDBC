<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%> <!-- used to jstl -->
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>CODEGYM DANANG</h1>
	<h2>Topic: Model and View, use jstl view data.</h2>

	<table>
		<thead>
			<tr>
				<th>Name</th>
				<th>Age</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="item" items="${lists}">
				<tr>

					<td>${item.name}</td>
					<td>${item.age}</td>


				</tr>
			</c:forEach>
		</tbody>
	</table>
</body>
</html>