package com.luv2code.springdemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.luv2code.springdemo.entity.Recruit;
import com.luv2code.springdemo.entity.RecruitDetail;
import com.luv2code.springdemo.service.RecruitService;


@Controller
@RequestMapping("/recruit")
public class RecruitController {
	
	// need to inject the recruit dao
	@Autowired
	private RecruitService recruitService;
	
	
	@GetMapping("/database")
	public String showWelcomePage() {
		
		return "welcome-database-page";
		
	}
	
	
	@GetMapping("/list")
	public String listRecruits(Model theModel) {
		
		// get recruits from the dao
		List<Recruit> theRecruits = recruitService.getRecruits();
		
		// add the recruits to the model
		theModel.addAttribute("recruits", theRecruits);
	
		return "recruit-list";
	}
	
	@GetMapping("/listAll")
	public String listAllRecruits(Model theModel) {
		
		// get recruits from the dao
		List<Recruit> theRecruits = recruitService.getRecruits();
		
		// add the recruits to the model
		theModel.addAttribute("recruits", theRecruits);
	
		return "recruit-list-all";
	}
	
	@GetMapping("/listByPromotion")
	public String listByPromotion(Model theModel) {
		
		// get recruits from the dao
		List<Recruit> theRecruits = recruitService.getRecruitsByPromotion();
		
		// add the recruits to the model
		theModel.addAttribute("recruits", theRecruits);
	
		return "recruit-list-all";
	}
	
	@GetMapping("/listByEnthusiasm")
	public String listByEnthusiasm(Model theModel) {
		
		// get recruits from the dao
		List<Recruit> theRecruits = recruitService.getRecruitsByEnthusiasm();
		
		// add the recruits to the model
		theModel.addAttribute("recruits", theRecruits);
	
		return "recruit-list-all";
	}
	
	@PostMapping("/search")
    public String searchRecruits(@RequestParam("theSearchName") String theSearchName,
                                    Model theModel) {

        // search recruits from the service
        List<Recruit> theRecruits = recruitService.searchRecruits(theSearchName);
                
        // add the recruits to the model
        theModel.addAttribute("recruits", theRecruits);

        return "recruit-list-all";        
    }
	
	@GetMapping("/showFormForAdd")
	public String showFormForAdd(Model theModel) {
		
		Recruit theRecruit = new Recruit(); 
        theModel.addAttribute("recruit", theRecruit);
        
		return "recruit-form";
	}
	
	@PostMapping("/saveRecruit")
	public String saveRecruit(@ModelAttribute("recruit") Recruit theRecruit){
		
		// If the recruit's detail is empty, associate a new detail with it
		if(theRecruit.getRecruitDetail() == null) {
			theRecruit.setRecruitDetail(new RecruitDetail());
		}
	
		recruitService.saveRecruit(theRecruit);
		return "redirect:/recruit/list";
	}
	
	
	@GetMapping("/showFormForUpdate")
	public String showFormForUpdate(@RequestParam("recruitId") int theId,
													Model theModel) {
		// retrieve the recruit from the database 
		Recruit theRecruit = recruitService.getRecruit(theId);
		
		// retrieve the details from the database (using recruit's information)
		RecruitDetail theDetail  = recruitService.getRecruitDetail(theRecruit.getRecruitDetail().getId());
		
		// associate the objects
		theRecruit.setRecruitDetail(theDetail);
		
		
		// set recruit as a model attribute to pre-populate the form
		theModel.addAttribute("recruit", theRecruit);
		
		// send over to our form
		return "recruit-form-update";
	}
	
	@GetMapping("/delete")
	public String deleteRecruit(@RequestParam("recruitId") int theId) {
		
		// retrieve the recruit from the database
		Recruit tempRecruit = recruitService.getRecruit(theId);
		recruitService.deleteRecruit(tempRecruit);
		
		return "redirect:/recruit/list";
	}
	
	


}


