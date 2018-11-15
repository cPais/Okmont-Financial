<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="security" uri="http://www.springframework.org/security/tags" %>

<!DOCTYPE html>

<html>
	<head>
		<title>List Recruits</title>
		
		<link type="text/css"
			rel="stylesheet"
			href="${pageContext.request.contextPath}/resources/css/style.css" />
	</head>
	<body>
		<div id="wrapper">
			<div id="header">
				<h2>DBMS - Clients Snapshot</h2>
			</div>
		</div>
		
		<div id="container">
			
			<div id="content">
			
			<!-- add button -->
			<input type="button" value="Add Client"
				onclick="window.location.href='showFormForAdd'; return false;"
				class="add-button"
			/>
			
			<!--  add a search box -->
            <form:form action="search" method="POST">
                Search clients: <input type="text" name="theSearchName" />
                
                <input type="submit" value="Search" class="add-button" />
            </form:form>
            
				<!-- add out html table here -->
				
				<table>
					<tr>
						<th>First Name</th>
						<th>Last Name</th>
						<th>Email</th>
						<th>Phone</th>
						<th>Address</th>
						<th>Business Rating</th>
						<th>Last Correspondence Date</th>
						<th>Action</th>
					</tr>
					<c:forEach var="tempClient" items="${clients}">
						<!-- construct an "update" link with client id -->
						<c:url var="updateLink" value="/client/showFormForUpdate">
							<c:param name="clientId" value="${tempClient.id}"/>
						</c:url>
						
						<c:url var="deleteLink" value="/client/delete">
							<c:param name="clientId" value="${tempClient.id}"/>
						</c:url>
						<tr>
							<td>${tempClient.firstName}</td>
							<td>${tempClient.lastName}</td>
							<td>${tempClient.email}</td>
							<td>${tempClient.phoneNumber}</td>
							<td>${tempClient.address}</td>
							<td>${tempClient.businessRating}</td>
							<td>${tempClient.lastCorrespondenceDate}</td>
							
							<td>
								<!-- display the update link -->
								<a href="${updateLink}">Update</a>
								|
								<a href="${deleteLink}"
									onclick="if(!(confirm('Are you sure you want to delete this client?'))) return false">Delete</a>
							</td>					
					</c:forEach>
				</table>
				<div style="clear; both;"></div>
				
				<input type="button" value="Clients In-Detail"
				onclick="window.location.href='listAll'; return false;"
				class="add-button"
			/>
			<p>
				<a href="${pageContext.request.contextPath}/recruit/database">Back to Home</a>
			</p>
			
			</div>
		
		</div>
	</body>
</html>