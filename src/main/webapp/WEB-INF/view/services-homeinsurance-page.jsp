<!DOCTYPE html>
<html lang="en">
<head>
  <title>Home Insurance</title>
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
      <h1>Home Insurance</h1>
      <p>A <span style="font-weight: bold;">home insurance policy</span> in simple terms is an investment an individual makes which, in the event their home (or the belongings within) receive damage, coverage can be expected. Home Insurance policies usually come in two different types: Structural and liabilities. They can be confusing and often do not cover everything.</p>
      <p><span style="font-weight: bold;">Structural home insurance</span> covers the specific types of damage an individual has paid for within their policy, when damage or theft harms their home or belongings. This can include personal belongings within the home (or the home itself) being damaged by a natural disaster specified in the policy or being stolen or vandalized. The rates can vary significantly, flood prone areas usually mean more expensive flood coverage for example, ideally an individual should take out the plan most relevant to their situation. Structural insurance can also cover rent or room and board in the event an individual's dwelling is temporarily put out of commission and they can no longer live there. It is important to review and see which disasters, theft or vandalism, or relocation is covered within a home insurance policy.</p>
      <p><span style="font-weight: bold;">Liability home insurance</span> covers injuries or legal lawsuits caused by your property (or you or your relative) to another individual. If you left your rake out for instance and an guest you invited steps on it and smacks themselves in the face, and sues you, liability coverage will go towards this. It additionally covers damage you, your pets, or your relatives accidently do to the home. </p>
      <hr>
      

    </div>
    
  </div>
</div>

<footer class="container-fluid text-center" style="background-color:#e27a7f">
  <p class="pull-right" style="font-weight: bold;">© Okmont Financial 2018</p>
</footer>


</body>
</html>
