<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<html>
<head>
	<title>Spring MVC Hello World</title>
</head>

<body style="background-color:powderblue;">
	<h2 align="center">All Employee in System</h2>

	<table border="1" align="center">
		<tr>
			<th style="background-color:MediumSeaGreen;">Employee Id</th>
			<th style="background-color:MediumSeaGreen;">First Name</th>
			<th style="background-color:MediumSeaGreen;">Last Name</th>
			<th style="background-color:MediumSeaGreen;">Salary</th>
			<th style="background-color:MediumSeaGreen;">City</th>
		</tr>
		<c:forEach items="${employees}" var="employee">
			<tr>
				<td  style="background-color:LightGreen;">${employee.id}</td>
				<td  style="background-color:LightGreen;">${employee.firstName}</td>
				<td  style="background-color:LightGreen;">${employee.lastName}</td>
				<td  style="background-color:LightGreen;">${employee.salary}</td>
				<td  style="background-color:LightGreen;">${employee.city}</td>
			</tr>
		</c:forEach>
	</table>

</body>
</html>