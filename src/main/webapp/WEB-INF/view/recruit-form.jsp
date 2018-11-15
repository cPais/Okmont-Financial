<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
						 
<!DOCTYPE html>
<html>
	<head>
		<title>Save Recruit</title>
		<link type="text/css"
			rel="stylesheet"
			href="${pageContext.request.contextPath}/resources/css/style.css"
		/>
		
		<link type="text/css"
			rel="stylesheet"
			href="${pageContext.request.contextPath}/resources/css/add-customer-style.css"
		/>
	</head>
	
	<body>
		<div id="wrapper">
			<div id="header">
				<h2>CRM - Recruit Relationship Manager</h2>
			</div>
		</div>
		
		<div id="container">
			<h3>Save Recruit</h3>
			
			<form:form action="saveRecruit" modelAttribute="recruit" method="POST">
			<!-- need to associate this data with recruit id -->
			<form:hidden path="id" />
			
				<table>
					<tbody>
							<tr>
								<td><label>First Name:</label></td>
								<td><form:input path="firstName" /></td>
							</tr>
							<tr>
								<td><label>Last Name:</label></td>
								<td><form:input path="lastName" /></td>
							</tr>
							<tr>
								<td><label>Email Name:</label></td>
								<td><form:input path="email" /></td>
							</tr>
							<tr>
								<td><label>Phone Number:</label></td>
								<td><form:input path="phoneNumber" /></td>
							</tr>
							<tr>
								<td><label>Address:</label></td>
								<td><form:input path="address" /></td>
							</tr>
							<tr>
								<td><label></label></td>
								<td><input type="submit" value="Save" class="save"/></td>
							</tr>
							
								</tbody>
							</table>
						</form:form>
		
		
			<div style="clear; both;"></div>
			<p>
				<a href="${pageContext.request.contextPath}/recruit/list">Back to List</a>
			</p>
			
			
		</div>
		
	</body>
</html>