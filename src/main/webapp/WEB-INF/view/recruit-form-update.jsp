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
		
		<script src="jquery-3.3.1.min.js"></script>
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
			
			<!-- need to associate this data with recruitDetail id -->
			<form:hidden path="RecruitDetail.id" />
			
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
								<td><label>Promotion Level:</label></td>
								<td>
									<form:select path="RecruitDetail.promotionLevel"> 
										<form:option value="Associate" label="Associate" />
										<form:option value="Representative" label="Representative" />
										<form:option value="Senior Representative" label="Senior Representative" />
										<form:option value="District Leader" label="District Leader" />
										<form:option value="Division Leader" label="Division Leader" />
										<form:option value="Regional Leader" label="Regional Leader" />
										<form:option value="Regional Vice President" label="Regional Vice President" />
									</form:select>
								</td>
							</tr>
							<tr>
								<td><label>Enthusiasm Level:</label></td>
								<td>
									<form:select path="RecruitDetail.enthusiasmLevel"> 
										<form:option value="Low Interest" label="Low Interest" />
										<form:option value="Moderate Interest" label="Moderate Interest" />
										<form:option value="High Interest" label="High Interest" />
									</form:select>
								</td>
							</tr>
							<tr>
								<td><label>Last Correspondence:</label></td>
								<td><form:input path="RecruitDetail.lastCorrespondenceDate" /></td>
							</tr>
							<tr>
								<td><label>Additional Information:</label></td>
								<td><form:input path="RecruitDetail.additionalInformation" /></td>
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