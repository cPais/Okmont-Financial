<!DOCTYPE html>
<html lang="en">
<head>
  <title>Home Page</title>
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
      <a class="navbar-brand" title="You are already on the home page." >Okmont Financial</a>
    </div>
    <div class="collapse navbar-collapse" id="myNavbar">
      <ul class="nav navbar-nav">
        <li class="dropdown"><a href="#" class="dropdown-toggle" data-toggle="dropdown">Services <span class="caret"></span></a>
        	<ul class="dropdown-menu">
        		<li><a href="${pageContext.request.contextPath}/lifeinsurance">Life Insurance</a></li>
        		<li><a href="${pageContext.request.contextPath}/homeinsurance">Home Insurance</a></li>
        		<li><a href="${pageContext.request.contextPath}/autoinsurance">Auto Insurance</a></li>
        		<li><a href="${pageContext.request.contextPath}/debtconsolidation">Debt Consolidation</a></li>
        		<li><a href="${pageContext.request.contextPath}/taxresolution">Tax Resolution</a></li>
        		<li><a href="${pageContext.request.contextPath}/prepaidlegal">Pre-Paid Legal</a></li>
        		<li><a href="${pageContext.request.contextPath}/identitytheft">Identity Theft</a></li>
        		<li><a href="${pageContext.request.contextPath}/collegefunds">College Fund</a></li>
        		<li><a href="${pageContext.request.contextPath}/mutualfunds">Mutual Fund</a></li>
        		<li><a href="${pageContext.request.contextPath}/IRAportfolios">IRA Portfolio</a></li>
        		<li><a href="${pageContext.request.contextPath}/rothIRAportfolios">Roth IRA Portfolio</a></li>
        		<li><a href="${pageContext.request.contextPath}/401Kportfolios">401K Portfolio</a></li>
        		<li><a href="${pageContext.request.contextPath}/43Bportfolios">43B Portfolio</a></li>
        		<li><a href="${pageContext.request.contextPath}/variableannuity">Variable Annuity</a></li>
        	</ul>
        </li>
        <li><a href="${pageContext.request.contextPath}/about">About</a></li>
        <li><a href="${pageContext.request.contextPath}/contact">Contact</a></li>
      <!-- ${pageContext.request.contextPath}/contact -->
      </ul>
      
      <ul class="nav navbar-nav navbar-right">
        <li><a href="${pageContext.request.contextPath}/recruit/database"><span class="glyphicon glyphicon-log-in"></span> Login</a></li>
      </ul>
    </div>
  </div>
</nav>
  
<div class="container-fluid text-center">    
  <div class="row content">
    <div class="col-sm-2 sidenav">
     
      <p class="button"><a href="#">Financial Needs Analysis</a></p>
      <p><a href="#">Learn More</a></p>
    </div>
    <div class="col-sm-10 text-left"> 
     
     <img src="${pageContext.request.contextPath}/resources/images/picture01.png" class="img-responsive" />
    
      <p>Hello and welcome to <span style="color:#f2ab13;  font-weight: bold;">Okmont Financial</span>. At Okmont we ease our clients through financial difficulties such as: </p>
      <ul>
      	<li style="color:blue;">Debt Consolidation</li>
      	<li style="color:blue;">Life Insurance</li>
      	<li style="color:blue;">Auto Insurance</li>
      	<li style="color:blue;">Retirement Planning</li>
      	<li style="color:blue;">Emergency Funds</li>
      	<li style="color:blue;">College Funds</li>
      </ul>
      <p>These services are tailored and can range from acquiring a brand new plan to lowering the cost of your current plan.</p>
      <p><span style="font-style:italic;">Life Happens;</span> don't get caught out in the rain. Invest in plans for your future and the future of your children for a financially secure and stable life.</p>
      <hr>
      
    </div>
    
  </div>
</div>

<footer class="container-fluid text-center" style="background-color:#e27a7f">
  <p class="pull-right" style="font-weight: bold;">© Okmont Financial 2018</p>
</footer>

</body>
</html>
