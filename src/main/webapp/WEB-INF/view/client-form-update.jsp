<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
						 
<!DOCTYPE html>
<html>
	<head>
		<title>Save Client</title>
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
				<h2>CRM - Client Relationship Manager</h2>
			</div>
		</div>
		
		<div id="container">
			<h3>Save Client</h3>
			
			<form:form action="saveClient" modelAttribute="client" method="POST">
			<!-- need to associate this data with client id -->
			<form:hidden path="id" />
			
			<!-- need to associate this data with clientDetail id -->
			<form:hidden path="ClientDetail.id" />
			
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
								<td><label>Business Rating:</label></td>
								<td><form:input path="businessRating" /></td>
							</tr>
							<tr>
								<td><label>Last Correspondence Date:</label></td>
								<td><form:input path="lastCorrespondenceDate" /></td>
							</tr>
							<tr>
								<td><label>Life Insurance Policy #:</label></td>
								<td><form:input path="ClientDetail.lifeInsurancePolicyNumber" /></td>
							</tr>
							<tr>
								<td><label>Life Insurance Coverage:</label></td>
								<td><form:input path="ClientDetail.lifeInsuranceCoverage" /></td>
							</tr>
							<tr>
								<td><label>Home Insurance Policy #:</label></td>
								<td><form:input path="ClientDetail.homeInsurancePolicyNumber" /></td>
							</tr>
							<tr>
								<td><label>Home Insurance Coverage:</label></td>
								<td><form:input path="ClientDetail.homeInsuranceCoverage" /></td>
							</tr>
							<tr>
								<td><label>Auto Insurance Policy #:</label></td>
								<td><form:input path="ClientDetail.autoInsurancePolicyNumber" /></td>
							</tr>
							<tr>
								<td><label>Auto Insurance Coverage:</label></td>
								<td><form:input path="ClientDetail.autoInsuranceCoverage" /></td>
							</tr>
							<tr>
								<td><label>Debt Consolidation Policy #:</label></td>
								<td><form:input path="ClientDetail.debtConsolidationPolicyNumber" /></td>
							</tr>
							<tr>
								<td><label>Debt Consolidation Coverage:</label></td>
								<td><form:input path="ClientDetail.debtConsolidationCoverage" /></td>
							</tr>
							<tr>
								<td><label>Tax Resolution Policy #:</label></td>
								<td><form:input path="ClientDetail.taxResolutionPolicyNumber" /></td>
							</tr>
							<tr>
								<td><label>Tax Resolution Coverage:</label></td>
								<td><form:input path="ClientDetail.taxResolutionCoverage" /></td>
							</tr>
							<tr>
								<td><label>Pre-Paid Legal Policy #:</label></td>
								<td><form:input path="ClientDetail.prePaidLegalPolicyNumber" /></td>
							</tr>
							<tr>
								<td><label>Pre-Paid Legal Coverage:</label></td>
								<td><form:input path="ClientDetail.prePaidLegalCoverage" /></td>
							</tr>
							<tr>
								<td><label>Identity Theft Policy #:</label></td>
								<td><form:input path="ClientDetail.identityTheftPolicyNumber" /></td>
							</tr>
							<tr>
								<td><label>Identity Theft Coverage:</label></td>
								<td><form:input path="ClientDetail.identityTheftCoverage" /></td>
							</tr>
							<tr>
								<td><label>College Fund Portfolio #:</label></td>
								<td><form:input path="ClientDetail.collegeFundPortfolioNumber" /></td>
							</tr>
							<tr>
								<td><label>College Fund Portfolio:</label></td>
								<td><form:input path="ClientDetail.collegeFundPortfolio" /></td>
							</tr>
							<tr>
								<td><label>Mutual Fund Portfolio #:</label></td>
								<td><form:input path="ClientDetail.mutualFundPortfolioNumber" /></td>
							</tr>
							<tr>
								<td><label>Mutual Fund Portfolio:</label></td>
								<td><form:input path="ClientDetail.mutualFundPortfolio" /></td>
							</tr>
							<tr>
								<td><label>Ira Portfolio #:</label></td>
								<td><form:input path="ClientDetail.iraPortfolioNumber" /></td>
							</tr>
							<tr>
								<td><label>Ira Portfolio:</label></td>
								<td><form:input path="ClientDetail.iraPortfolio" /></td>
							</tr>
							<tr>
								<td><label>Roth Ira Portfolio #:</label></td>
								<td><form:input path="ClientDetail.rothIraPortfolioNumber" /></td>
							</tr>
							<tr>
								<td><label>Roth Ira Portfolio:</label></td>
								<td><form:input path="ClientDetail.rothIraPortfolio" /></td>
							</tr>
							<tr>
								<td><label>401K Portfolio #:</label></td>
								<td><form:input path="ClientDetail.fourOneKPortfolioNumber" /></td>
							</tr>
							<tr>
								<td><label>401K Portfolio:</label></td>
								<td><form:input path="ClientDetail.fourOneKPortfolio" /></td>
							</tr>
							<tr>
								<td><label>43B Portfolio #:</label></td>
								<td><form:input path="ClientDetail.fourThreeBPortfolioNumber" /></td>
							</tr>
							<tr>
								<td><label>43B Portfolio:</label></td>
								<td><form:input path="ClientDetail.fourThreeBPortfolio" /></td>
							</tr>
							<tr>
								<td><label>Variable Annuity Portfolio #:</label></td>
								<td><form:input path="ClientDetail.variableAnnuityPortfolioNumber" /></td>
							</tr>
							<tr>
								<td><label>Variable Annuity Portfolio:</label></td>
								<td><form:input path="ClientDetail.variableAnnuityPortfolio" /></td>
							</tr>
						<!-- class member fields end here -->
							<tr>
								<td><label></label></td>
								<td><input type="submit" value="Save" class="save"/></td>
							</tr>
							
								</tbody>
							</table>
						</form:form>
		
		
			<div style="clear; both;"></div>
			<p>
				<a href="${pageContext.request.contextPath}/client/list">Back to List</a>
			</p>
			
			
		</div>
		
	</body>
</html>