package com.luv2code.springdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.luv2code.springdemo.entity.Client;
import com.luv2code.springdemo.entity.ClientDetail;

@Controller
public class LoginController {

	//These functions show the home page, the login page, and database home page
	@GetMapping("/showMyLoginPage")
	public String showMyLoginPage() {
		
		return "fancy-login";
		
	}
	
	@GetMapping("/home")
	public String showHomePage() {
		
		return "welcome-home-page";
		
	}
	
	
	//These functions show the fna, about, and contact pages
	@GetMapping("/fna")
	public String showFnaPage() {
		
		return "welcome-fna-page";
		
	}
	
	@GetMapping("/contact")
	public String showContactPage() {
		
		return "welcome-contact-page";
	}
	
	@PostMapping("/contactFormEntry")
	public String contactFormEntry(){
		
		return "form-to-email";
	}
	
	@GetMapping("/about")
	public String showAboutPage() {
		
		return "welcome-about-page";
	}
	
	@GetMapping("/oppurtunities")
	public String showOppurtunitiesPage() {
		
		return "welcome-oppurtunities-page";
	}
	
	// add request mapping for /access-denied
	@GetMapping("/access-denied")
	public String showAccessDenied() {
		
		return "access-denied";
		
	}
	
	// add request mapping for service pages 
	@GetMapping("/lifeinsurance")
	public String showLifeInsurancePage() {
		
		return "services-lifeinsurance-page";
	}
	
	@GetMapping("/homeinsurance")
	public String showHomeInsurancePage() {
		
		return "services-homeinsurance-page";
	}
	
	@GetMapping("/autoinsurance")
	public String showAutoInsurancePage() {
		
		return "services-autoinsurance-page";
	}
	
	@GetMapping("/debtconsolidation")
	public String showDebtConsolidationPage() {
		
		return "services-debtconsolidation-page";
	}
	
	@GetMapping("/taxresolution")
	public String showTaxResolutionPage() {
		
		return "services-taxresolution-page";
	}
	
	@GetMapping("/prepaidlegal")
	public String showPrepaidLegalPage() {
		
		return "services-prepaidlegal-page";
	}
	
	@GetMapping("/identitytheft")
	public String showIdentityTheftPage() {
		
		return "services-identitytheft-page";
	}
	
	@GetMapping("/collegefunds")
	public String showCollegeFundPage() {
		
		return "services-collegefunds-page";
	}
	
	@GetMapping("/mutualfunds")
	public String showMutualFundPage() {
		
		return "services-mutualfunds-page";
	}
	
	@GetMapping("/IRAportfolios")
	public String showIraPortfolioPage() {
		
		return "services-IRAportfolios-page";
	}
	
	@GetMapping("/rothIRAportfolios")
	public String showRothIraPortfolioPage() {
		
		return "services-rothIRAportfolios-page";
	}
	
	// slightly different name convention
	@GetMapping("/401Kportfolios")
	public String showFourOneKPage() {
		
		return "services-401Kportfolios-page";
	}
	
	// slightly different name convention
		@GetMapping("/43Bportfolios")
		public String showFourThreeBPage() {
			
			return "services-43Bportfolios-page";
		}
	
	@GetMapping("/variableannuity")
	public String showVariableAnnuityPage() {
		
		return "services-variableannuity-page";
	}
	
	//service Pages end here
	
	
	
	
	
}









