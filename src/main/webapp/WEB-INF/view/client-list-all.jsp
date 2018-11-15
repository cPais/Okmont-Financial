<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="security" uri="http://www.springframework.org/security/tags" %>

<!DOCTYPE html>

<html>
	<head>
		<title>List Clients</title>
		
		<link type="text/css"
			rel="stylesheet"
			href="${pageContext.request.contextPath}/resources/css/style-client.css" />
	</head>
	<body>
		<div id="wrapper">
			<div id="header">
				<h2>DBMS - Clients In-Detail</h2>
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
                Search client: <input type="text" name="theSearchName" />
                
                <input type="submit" value="Search" class="add-button" />
            </form:form>
            
            <table id="vertical-1">
            	<tr>
						<th>First Name</th>
						<th>Last Name</th>
						<th>Email</th>
						<th>Phone</th>
						<th>Address</th>
						<th>Business Rating</th>
						<th>Last Correspondence Date</th>
						<th>Life Insurance Policy #</th>
						<th style="border: 1px solid black; cursor:pointer;" onclick="window.location.href='listByLife'; return false;">Life Insurance Coverage</th>
						<th>Home Insurance Policy #</th>
						<th style="border: 1px solid black; cursor:pointer;" onclick="window.location.href='listByHome'; return false;">Home Insurance Coverage</th>
						<th>Auto Insurance Policy #</th>
						<th style="border: 1px solid black; cursor:pointer;" onclick="window.location.href='listByAuto'; return false;">Auto Insurance Coverage</th>
						<th>Debt Consolidation Policy #</th>
						<th style="border: 1px solid black; cursor:pointer;" onclick="window.location.href='listByDebt'; return false;">Debt Consolidation Coverage</th>
						<th>Tax Resolution Policy #</th>
						<th style="border: 1px solid black; cursor:pointer;" onclick="window.location.href='listByTax'; return false;">Tax Resolution Coverage</th>
						<th>Pre-Paid Legal Policy #</th>
						<th style="border: 1px solid black; cursor:pointer;" onclick="window.location.href='listByLegal'; return false;">Pre-Paid Legal Coverage</th>
						<th>Identity Theft Policy #</th>
						<th style="border: 1px solid black; cursor:pointer;" onclick="window.location.href='listByIdentity'; return false;">Identity Theft Coverage</th>
						<th>College Fund Portfolio #</th>
						<th style="border: 1px solid black; cursor:pointer;" onclick="window.location.href='listByCollege'; return false;">College Fund Portfolio</th>
						<th>Mutual Fund Portfolio #</th>
						<th style="border: 1px solid black; cursor:pointer;" onclick="window.location.href='listByMutual'; return false;">Mutual Fund Portfolio</th>
						<th>IRA Portfolio #</th>
						<th style="border: 1px solid black; cursor:pointer;" onclick="window.location.href='listByIra'; return false;">IRA Portfolio</th>
						<th>Roth IRA Portfolio #</th>
						<th style="border: 1px solid black; cursor:pointer;" onclick="window.location.href='listByRoth'; return false;">Roth IRA Portfolio</th>
						<th>401k Portfolio #</th>
						<th style="border: 1px solid black; cursor:pointer;" onclick="window.location.href='listBy401K'; return false;">401k Portfolio</th>
						<th>43B Portfolio #</th>
						<th style="border: 1px solid black; cursor:pointer;" onclick="window.location.href='listBy43B'; return false;">43B Portfolio</th>
						<th>Variable Annuity Portfolio #</th>
						<th style="border: 1px solid black; cursor:pointer;" onclick="window.location.href='listByAnnuity'; return false;">Variable Annuity Portfolio</th>
						
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
							<td>${tempClient.clientDetail.lifeInsurancePolicyNumber}</td>
							<td>${tempClient.clientDetail.lifeInsuranceCoverage}</td>
							<td>${tempClient.clientDetail.homeInsurancePolicyNumber}</td>
							<td>${tempClient.clientDetail.homeInsuranceCoverage}</td>
							<td>${tempClient.clientDetail.autoInsurancePolicyNumber}</td>
							<td>${tempClient.clientDetail.autoInsuranceCoverage}</td>
							<td>${tempClient.clientDetail.debtConsolidationPolicyNumber}</td>
							<td>${tempClient.clientDetail.debtConsolidationCoverage}</td>
							<td>${tempClient.clientDetail.taxResolutionPolicyNumber}</td>
							<td>${tempClient.clientDetail.taxResolutionCoverage}</td>
							<td>${tempClient.clientDetail.prePaidLegalPolicyNumber}</td>
							<td>${tempClient.clientDetail.prePaidLegalCoverage}</td>
							<td>${tempClient.clientDetail.identityTheftPolicyNumber}</td>
							<td>${tempClient.clientDetail.identityTheftCoverage}</td>
							<td>${tempClient.clientDetail.collegeFundPortfolioNumber}</td>
							<td>${tempClient.clientDetail.collegeFundPortfolio}</td>
							<td>${tempClient.clientDetail.mutualFundPortfolioNumber}</td>
							<td>${tempClient.clientDetail.mutualFundPortfolio}</td>
							<td>${tempClient.clientDetail.iraPortfolioNumber}</td>
							<td>${tempClient.clientDetail.iraPortfolio}</td>
							<td>${tempClient.clientDetail.rothIraPortfolioNumber}</td>
							<td>${tempClient.clientDetail.rothIraPortfolio}</td>
							<td>${tempClient.clientDetail.fourOneKPortfolioNumber}</td>
							<td>${tempClient.clientDetail.fourOneKPortfolio}</td>
							<td>${tempClient.clientDetail.fourThreeBPortfolioNumber}</td>
							<td>${tempClient.clientDetail.fourThreeBPortfolio}</td>
							<td>${tempClient.clientDetail.variableAnnuityPortfolioNumber}</td>
							<td>${tempClient.clientDetail.variableAnnuityPortfolio}</td>
							
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
				
				<input type="button" value="Clients Snapshot"
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