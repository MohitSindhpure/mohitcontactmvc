<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<script>
	function confirmDelete() {
		return confirm("Are you Sure you want to delete ?");
	}
</script>
</head>
<body>
	<h1>View All Contacts</h1>

	<table>
		<tr>
			<th>Name</th>
			<th>Email</th>
			<th>Number</th>
		</tr>

		<tbody>
			<c:forEach items="${contact}" var="cot">
				<tr>
					<td>${cot.contactname}</td>
					<td>${cot.contactemail}</td>
					<td>${cot.contactnumber}</td>
					<td><a href="edit?contactid=${cot.contactid}"><label
							style="color: Green;font-size:20px;">Edit</label></a><a
						href="delete?contactid=${cot.contactid}"
						onclick="return confirmDelete()"><label style="color: Red;font-size:20px;">Delete</label></a></td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
	<a href="contact"><label style="color: Green;font-size:20px;">SignUp Again</a>
</body>
</html>