<!DOCTYPE html>
<html lang="en">
<head>
  <title>Life Insurance</title>
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
      <h1>Life Insurance</h1>
      <p>A <span style="font-weight: bold;">life insurance policy</span> in simple terms is an investment an individual makes which, in the event that individual dies, that person's friends or family will receive the accrued death benefit. Life Insurance policies usually comes in two different types: Temporary or Permanent.</p>
      <p><span style="font-weight: bold;">Temporary life insurance</span> is as the name suggests, temporary and meant to last usually 10 or 20 or 30 years. After that time period elapses, an individual's monthly premiums will often rise sharply (in some cases even by a factor of 10). Some policies enable the holder of term insurance to transition to a permanent insurance plan. In general Term insurance is the simplest, least expensive form of life insurance available. It is ideal for when you suspect you will no longer need insurance, such as after your morgage has been paid off or after your kids have grown up. It's also advantageous for young and healthy individual to get very cheap plans. A healthy 20 year old can potentially buy a $250,000 20 year term policy for as little as $20 a month. </p>
      <p><span style="font-weight: bold;">Permanent life insurance</span> is meant to last forever, and is more expensive than term life policies. Whether death occurs tomorrow or in 50 years, an individual can't outlive their permanent life insurance, and may level premiums such that the price remains the same throughout an individual's whole life. An individual can also decide to pay off their policy ahead of time, at which point they will own their policy and will no longer need to pay monthly premiums on it. Lastly, perm life insurance unlike term life can build cash-surrender value, enabling an individual to withdraw money from the policy for whatever reason. Perm insurance itself usually comes under two subtypes: universal life and whole life. Universal life enables an individual to change and manipulate the premiums and death benefits of their policy throughout the policy. Whole life is the most expensive type of permanent life insurance, and it can overtime accrue and grow the most significant amount of cash value.   </p>
      <hr>
      

    </div>
    
  </div>
</div>

<footer class="container-fluid text-center" style="background-color:#e27a7f">
  <p class="pull-right" style="font-weight: bold;">© Okmont Financial 2018</p>
</footer>


</body>
</html>
