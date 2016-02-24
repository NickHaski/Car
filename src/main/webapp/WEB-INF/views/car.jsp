<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Spring 4 MVC -HelloWorld</title>
</head>
<body>
	<center>
		<h2>Car Test</h2>
		<form:form method="POST" commandName="car" >
			<table>
				<tbody>
					<tr>
						<td><form:input path="name"></form:input></td>
					</tr>
					<tr>
						<td colspan="2"><input type="submit" value="Submit">
						</td>
						<td></td>
						<td></td>
					</tr>
				</tbody>
			</table>
		</form:form>

	</center>
</body>
</html>