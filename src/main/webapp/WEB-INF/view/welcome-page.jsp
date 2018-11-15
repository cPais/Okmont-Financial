<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="security" uri="http://www.springframework.org/security/tags" %>

<!DOCTYPE html>

<html>

<head>
	<title>Welcome Page</title>
	
	<!-- reference our style sheet -->

	<link type="text/css"
		  rel="stylesheet"
		  href="${pageContext.request.contextPath}/resources/css/style.css" />

</head>

<body>

	<div id="wrapper">
		<div id="header">
			<h2>Primerica Financial Services - Associate Relationship Manager</h2>
		</div>
	</div>
	
	<div id="container">
	
		<div id="content">
		
			<ul class="horizontalMenu">
			  <li><a href="http://www.google.com">Google</a></li>
			  <li><a href="http://www.primerica.com">Primerica</a></li>
			  <li><a href="#">Contact</a></li>
			  <li><a href="#">More Information</a></li>
		  	  <li class="tiny"> | User: <security:authentication property="principal.username" />, Role(s): <security:authentication property="principal.authorities" /></li> 
			</ul>
		<!--  
			<div id="content-area-01">This is content-area-01
				<p id="content-area-01-subdivision-01" class="tiny">This is subdivision-01</p>
			</div>
			<div id="content-area-02">This is content-area-02</div>
			<div id="content-area-03">This is content-area-03</div>
			<div id="content-area-04">This is content-area-04</div>
		-->
			<hr>
			
			<security:authorize access="hasAnyRole('MANAGER', 'ADMIN')">
							<div><a href="${pageContext.request.contextPath}/recruit/list">List Of Recruits</a></div>
							<div><a href="${pageContext.request.contextPath}/client/list">List Of Clients</a></div>
						</security:authorize>
				
		</div>
			
	
	</div>
	
	<p></p>
		
	<!-- Add a logout button -->
	<form:form action="${pageContext.request.contextPath}/logout" 
			   method="POST">
	
		<input type="submit" value="Logout" class="add-button" />
	
	</form:form>

</body>

</html>









