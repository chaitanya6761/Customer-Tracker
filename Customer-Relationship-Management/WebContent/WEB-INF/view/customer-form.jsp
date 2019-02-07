<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>


<!DOCTYPE html>

<html>

<head>
<title>Save Customer</title>

<!-- reference our style sheet -->

<link type="text/css" rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/css/style.css" />

<link type="text/css" rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/css/add-customer-style.css" />

</head>

<body>

	<div id="wrapper">
		<div id="header">
			<h2>CRM - Customer Relationship Manager</h2>
		</div>
	</div>

	<div id="container">

		<h3>Save Customer</h3>

		<form:form action="saveCustomer" modelAttribute="customer"
			method="POST">

		<form:hidden path="id"/>
		
			<table>

				<tbody>
					<tr>
						<td>First name:</td>
						<td><form:input path="firstName" /></td>
					</tr>

					<tr>
						<td>Last name:</td>
						<td><form:input path="lastName" /></td>
					</tr>

					<tr>
						<td>Email:</td>
						<td><form:input path="email" /></td>
					</tr>

					<tr>
						<td></td>
						<td><input class="save" type="submit" value="save" /></td>
					</tr>


				</tbody>

			</table>


		</form:form>

		<div style="clear: both;">

			<p>

				<a href="${pageContext.request.contextPath}/customer/list">Back
					to List</a>

			</p>

		</div>

	</div>


</body>

</html>









