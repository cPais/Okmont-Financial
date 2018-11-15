<!DOCTYPE html>
<html lang="en">
<head>
  <title>Debt Consolidation</title>
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
       <a class="navbar-brand" href="${pageContext.request.contextPath}/home">Okmont Financial</a>
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
      <h1>Debt Consolidation</h1>
      <p><span style="font-weight: bold;">Debt consolidation description</span> covers private passenger vehicles. It provides protection against economic loss to an insured from bodily injury or property damage to others (liability) arising from the operation, maintenance, or use of a covered automobile. Coverage may also be purchased for damage to vehicles owned by you </p>
      <p><span style="font-weight: bold;">Type A (A) Coverage:</span> pays for death or serious and permanent injury to others when you are legally liable for those damages. If an insured is sued, the insurer will provide legal representation.</p>
      <p><span style="font-weight: bold;">Type B (B) Coverage:</span> pays for damages that an insured is legally liable for resulting in the physical damage to, or destruction of, tangible property of another, including loss of use. If an insured is sued, the insurer will provide legal representation. Florida law requires a minimum of $10,000 in this coverage.</p>
      <p><span style="font-weight: bold;">Type C (C) Coverage:</span> pays 80 percent of all necessary and reasonable medical expenses incurred as a result of a covered injury, regardless of who caused the accident. This includes medically necessary medical, surgical, x-ray, dental, and rehabilitative services, including prosthetic devices and medically necessary ambulance, hospital, and nursing services. </p>
      <hr>
      
    </div>
    
  </div>
</div>

<footer class="container-fluid text-center" style="background-color:#e27a7f">
  <p class="pull-right" style="font-weight: bold;">© Okmont Financial 2018</p>
</footer>


</body>
</html>
