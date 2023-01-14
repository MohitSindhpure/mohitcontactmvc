<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"  %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>WWW.MOHITch.com</title>
</head>
<body bgcolor="#ffe0b3">
<div align="center" style="border:2px">
<h1>Save Contact HERE</h1>

<font color='green'> ${saveSuccess} </font>
<font color='red'> ${fail} </font>

<form:form action="saveContact? contactID=${contact.contactid}" modelAttribute="contact" method="POST">

<table>

<tr>
<td> Contact Name</td>
<td><form:input path="contactname"/></td>
</tr>

<tr>
<td> Contact EMAIL</td>
<td><form:input path="contactemail"/></td>
</tr>

<tr>
<td> Contact Number</td>
<td><form:input path="contactnumber"/></td>
</tr>

<tr>
<td><input type="submit" value="Save"/></td>
</tr>


</table>
<a href="viewContacts">View All Contact</a>
</form:form>
</div>
</body>
</html>