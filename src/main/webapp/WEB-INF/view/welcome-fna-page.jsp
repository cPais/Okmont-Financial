<!DOCTYPE html>
<html lang="en">
<head>
  <title>Financial Needs Analysis</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
  <style>
    /* Remove the navbar's default margin-bottom and rounded borders */ 
    .navbar {
      margin-bottom: 0;
      border-radius: 0;
    }
    
    /* Set height of the grid so .sidenav can be 100% (adjust as needed) */
    .row.content {height: 450px}
    
    /* Set gray background color and 100% height */
    .sidenav {
      padding-top: 20px;
      background-color: #f1f1f1;
      height: 100%;
    }
    
    /* Set black background color, white text and some padding */
    footer {
      background-color: #555;
      color: white;
      padding: 15px;
    }
    
    /* On small screens, set height to 'auto' for sidenav and grid */
    @media screen and (max-width: 767px) {
      .sidenav {
        height: auto;
        padding: 15px;
      }
      .row.content {height:auto;}
      
      .details {
      	font-family: 'Lato', sans-serif;
      
      	}
      	
      .bigText{
      	color: blue;
      } 

    
  </style>
</head>
<body>

<nav class="navbar navbar-inverse">
  <div class="container-fluid">
    <div class="navbar-header">
      <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#myNavbar">
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>                        
      </button>
       <a class="navbar-brand" href="${pageContext.request.contextPath}/home">Primerica</a>
    </div>
    <div class="collapse navbar-collapse" id="myNavbar">
      <ul class="nav navbar-nav">
        <li class="dropdown"><a href="#" class="dropdown-toggle" data-toggle="dropdown">Services <span class="caret"></span></a>
        	<ul class="dropdown-menu">
        		<li><a href="${pageContext.request.contextPath}/lifeInsurance">Life Insurance</a></li>
        		<li><a href="${pageContext.request.contextPath}/homeInsurance">Home Insurance</a></li>
        		<li><a href="${pageContext.request.contextPath}/autoInsurance">Auto Insurance</a></li>
        		<li><a href="${pageContext.request.contextPath}/debtConsolidation">Debt Consolidation</a></li>
        		<li><a href="${pageContext.request.contextPath}/taxResolution">Tax Resolution</a></li>
        		<li><a href="${pageContext.request.contextPath}/prepaidLegal">Pre-Paid Legal</a></li>
        		<li><a href="${pageContext.request.contextPath}/identityTheft">Identity Theft</a></li>
        		<li><a href="${pageContext.request.contextPath}/collegeFund">College Fund</a></li>
        		<li><a href="${pageContext.request.contextPath}/mutualFund">Mutual Fund</a></li>
        		<li><a href="${pageContext.request.contextPath}/iraPortfolio">IRA Portfolio</a></li>
        		<li><a href="${pageContext.request.contextPath}/rothIraPortfolio">Roth IRA Portfolio</a></li>
        		<li><a href="${pageContext.request.contextPath}/401KPortfolio">401K Portfolio</a></li>
        		<li><a href="${pageContext.request.contextPath}/43BPortfolio">43B Portfolio</a></li>
        		<li><a href="${pageContext.request.contextPath}/variableAnnuity">Variable Annuity</a></li>
        	</ul>
        </li>
        <li><a href="${pageContext.request.contextPath}/about">About</a></li>
        <li><a href="${pageContext.request.contextPath}/contact">Contact</a></li>
      </ul>
      <ul class="nav navbar-nav navbar-right">
        <li><a href="${pageContext.request.contextPath}/recruit/list"><span class="glyphicon glyphicon-log-in"></span> Login</a></li>
      </ul>
    </div>
  </div>
</nav>
  
<div class="container-fluid text-center">    
  <div class="row content">
    
    <div class="col-sm-12 text-left"> 
      <h3 style="font-style:italic">Financial Needs Analysis</h3>
      <hr>
      <p style="font-size:1.35em">Primerica's financial needs analysis form asks a prospective client for details. Details regarding incoming revenue, outgoing costs, and various other factors. We use these financial factors detect strengths, shortcomings, and recommend financial advise. For prospective clients.</p>
      <hr>
      
      <div class="container">
  		<form action="/action_page.php">
		    <div class="form-group">
		      	<label for="fName">First Name:</label>
		      	<input type="text" class="form-control" id="fname" placeholder="First name" name="firstname">
		    </div>
		    <div class="form-group">
		      	<label for="lName">Last Name:</label>
		      	<input type="text" class="form-control" id="lname" placeholder="Last name" name="lastname">
		    </div>
		    <div class="form-group">
		      	<label for="subject">Date of Birth:</label>
		      	<input type="text" class="form-control" id="subject" placeholder="Date of birth" name="subject">
		    </div>
		    <div class="form-group">
		      	<label for="subject">Option:</label>
		      	<input type="text" class="form-control" id="subject" placeholder="Option" name="subject">
		    </div>
		    <div class="form-group">
		      	<label for="subject">Option:</label>
		      	<input type="text" class="form-control" id="subject" placeholder="Option" name="subject">
		    </div>
		    
		    
		    <button type="submit" class="btn btn-default">Submit</button>
		  </form>
		</div>
      

    </div>
    
  </div>
</div>

<footer class="container-fluid text-center" style="background-color:#e27a7f">
  <p class="pull-right" style="font-weight: bold;">© Primerica Financial Services 2018</p>
</footer>


</body>
</html>
