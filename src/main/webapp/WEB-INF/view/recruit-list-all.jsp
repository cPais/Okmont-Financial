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
				<h2>DBMS - Recruits In-Detail</h2>
			</div>
		</div>
		
		<div id="container">
			
			<div id="content">
			
			<!-- add button -->
			<input type="button" value="Add Recruit"
				onclick="window.location.href='showFormForAdd'; return false;"
				class="add-button"
			/>
				
			<!--  add a search box -->
            <form:form action="search" method="POST">
                Search recruit: <input type="text" name="theSearchName" />
                
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
						<th style="border: 1px solid black; cursor:pointer;" onclick="window.location.href='listByPromotion'; return false;">Promotion Level</th>
						<th style="border: 1px solid black; cursor:pointer;" onclick="window.location.href='listByEnthusiasm'; return false;">Enthusiasm Level</th>
						<th>Last Correspondence</th>
						<th>Additional Information</th>
						<th>Action</th>
					</tr>
					<c:forEach var="tempRecruit" items="${recruits}">
						<!-- construct an "update" link with recruit id -->
						<c:url var="updateLink" value="/recruit/showFormForUpdate">
							<c:param name="recruitId" value="${tempRecruit.id}"/>
						</c:url>
						
						<c:url var="deleteLink" value="/recruit/delete">
							<c:param name="recruitId" value="${tempRecruit.id}"/>
						</c:url>
						<tr>
						<!-- <td>${tempRecruit.recruitDetail.enthusiasmLevel}</td> -->
							<td>${tempRecruit.firstName}</td>
							<td>${tempRecruit.lastName}</td>
							<td>${tempRecruit.email}</td>
							<td>${tempRecruit.phoneNumber}</td>
							<td>${tempRecruit.address}</td>
							<td>${tempRecruit.recruitDetail.promotionLevel}</td>
							<td>${tempRecruit.recruitDetail.enthusiasmLevel}</td>
							<td>${tempRecruit.recruitDetail.lastCorrespondenceDate}</td>
							<td>${tempRecruit.recruitDetail.additionalInformation}</td>
							
							<td>
								<!-- display the update link -->
								<a href="${updateLink}">View</a>
								|
								<a href="${deleteLink}"
									onclick="if(!(confirm('Are you sure you want to delete this recruit?'))) return false">Delete</a>
							</td>
						<!-- removed to realign deleteLink underneath the "Action" <th> 6/26/2018
							<td>
								<!-- display the delete link 
								<a href="${deleteLink}"
									onclick="if(!(confirm('Are you sure you want to delete this recruit?'))) return false">Delete</a>
							</td>
						-->
					
					</c:forEach>
				</table>
				<div style="clear; both;"></div>
				
				<input type="button" value="Recruits Snapshot"
				onclick="window.location.href='list'; return false;"
				class="add-button"
			/>
			
			<p>
				<a href="${pageContext.request.contextPath}/recruit/database">Back to Home</a>
			</p>
			
			</div>
		
		</div>
	</body>
</html>