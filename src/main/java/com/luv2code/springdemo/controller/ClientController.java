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

import com.luv2code.springdemo.entity.Client;
import com.luv2code.springdemo.entity.ClientDetail;
import com.luv2code.springdemo.entity.Recruit;
import com.luv2code.springdemo.service.ClientService;


@Controller
@RequestMapping("/client")
public class ClientController {
	
	// need to inject the client service
	@Autowired
	private ClientService clientService;
	
	@GetMapping("/list")
	public String listClients(Model theModel) {
		
		// get clients from the dao
		List<Client> theClients = clientService.getClients();
		
		// add the clients to the model
		theModel.addAttribute("clients", theClients);
	
		return "client-list";
	}
	
	@GetMapping("/listAll")
	public String listAllClients(Model theModel) {
		
		// get clients from the dao
		List<Client> theClients = clientService.getClients();
		
		// add the clients to the model
		theModel.addAttribute("clients", theClients);
	
		return "client-list-all";
	}
	// the following methods are for sorting
	
	@GetMapping("/listByRating")
	public String listByRating(Model theModel) {
		
		// get clients from the dao
		List<Client> theClients = clientService.getClientsByRating();
		
		// add the clients to the model
		theModel.addAttribute("clients", theClients);
	
		return "client-list-all";
	}
	
	@GetMapping("/listByLife")
	public String listByLife(Model theModel) {
		
		// get clients from the dao
		List<Client> theClients = clientService.getClientsByLife();
		
		// add the clients to the model
		theModel.addAttribute("clients", theClients);
	
		return "client-list-all";
	}
	
	@GetMapping("/listByHome")
	public String listByHome(Model theModel) {
		
		// get clients from the dao
		List<Client> theClients = clientService.getClientsByHome();
		
		// add the clients to the model
		theModel.addAttribute("clients", theClients);
	
		return "client-list-all";
	}
	
	@GetMapping("/listByAuto")
	public String listByAuto(Model theModel) {
		
		// get clients from the dao
		List<Client> theClients = clientService.getClientsByAuto();
		
		// add the clients to the model
		theModel.addAttribute("clients", theClients);
	
		return "client-list-all";
	}
	
	@GetMapping("/listByDebt")
	public String listByDebt(Model theModel) {
		
		// get clients from the dao
		List<Client> theClients = clientService.getClientsByDebt();
		
		// add the clients to the model
		theModel.addAttribute("clients", theClients);
	
		return "client-list-all";
	}
	
	@GetMapping("/listByTax")
	public String listByTax(Model theModel) {
		
		// get clients from the dao
		List<Client> theClients = clientService.getClientsByTax();
		
		// add the clients to the model
		theModel.addAttribute("clients", theClients);
	
		return "client-list-all";
	}
	
	@GetMapping("/listByLegal")
	public String listByLegal(Model theModel) {
		
		// get clients from the dao
		List<Client> theClients = clientService.getClientsByLegal();
		
		// add the clients to the model
		theModel.addAttribute("clients", theClients);
	
		return "client-list-all";
	}
	
	@GetMapping("/listByIdentity")
	public String listByIdentity(Model theModel) {
		
		// get clients from the dao
		List<Client> theClients = clientService.getClientsByIdentity();
		
		// add the clients to the model
		theModel.addAttribute("clients", theClients);
	
		return "client-list-all";
	}
	
	@GetMapping("/listByCollege")
	public String listByCollege(Model theModel) {
		
		// get clients from the dao
		List<Client> theClients = clientService.getClientsByCollege();
		
		// add the clients to the model
		theModel.addAttribute("clients", theClients);
	
		return "client-list-all";
	}
	
	@GetMapping("/listByMutual")
	public String listByMutual(Model theModel) {
		
		// get clients from the dao
		List<Client> theClients = clientService.getClientsByMutual();
		
		// add the clients to the model
		theModel.addAttribute("clients", theClients);
	
		return "client-list-all";
	}
	
	@GetMapping("/listByIra")
	public String listByIra(Model theModel) {
		
		// get clients from the dao
		List<Client> theClients = clientService.getClientsByIra();
		
		// add the clients to the model
		theModel.addAttribute("clients", theClients);
	
		return "client-list-all";
	}
	
	@GetMapping("/listByRoth")
	public String listByRoth(Model theModel) {
		
		// get clients from the dao
		List<Client> theClients = clientService.getClientsByRoth();
		
		// add the clients to the model
		theModel.addAttribute("clients", theClients);
	
		return "client-list-all";
	}
	
	@GetMapping("/listBy401K")
	public String listByFourOneK(Model theModel) {
		
		// get clients from the dao
		List<Client> theClients = clientService.getClientsByFourOneK();
		
		// add the clients to the model
		theModel.addAttribute("clients", theClients);
	
		return "client-list-all";
	}
	
	@GetMapping("/listBy43B")
	public String listByFourThreeB(Model theModel) {
		
		// get clients from the dao
		List<Client> theClients = clientService.getClientsByFourThreeB();
		
		// add the clients to the model
		theModel.addAttribute("clients", theClients);
	
		return "client-list-all";
	}
	
	@GetMapping("/listByAnnuity")
	public String listByAnnuity(Model theModel) {
		
		// get clients from the dao
		List<Client> theClients = clientService.getClientsByAnnuity();
		
		// add the clients to the model
		theModel.addAttribute("clients", theClients);
	
		return "client-list-all";
	}
	// sorting method end here
	
	@PostMapping("/search")
    public String searchClients(@RequestParam("theSearchName") String theSearchName,
                                    Model theModel) {

        // search recruits from the service
        List<Client> theClients = clientService.searchClients(theSearchName);
                
        // add the recruits to the model
        theModel.addAttribute("clients", theClients);

        return "client-list-all";        
    }
	
	@GetMapping("/showFormForAdd")
	public String showFormForAdd(Model theModel) {
		
		Client theClient = new Client(); 
        theModel.addAttribute("client", theClient);
        
		return "client-form";
	}
	
	@PostMapping("/saveClient")
	public String saveClient(@ModelAttribute("client") Client theClient){
		
		// If the client's detail is empty, associate a new detail with it
		if(theClient.getClientDetail() == null) {
			theClient.setClientDetail(new ClientDetail());
		}
	
		clientService.saveClient(theClient);
		return "redirect:/client/list";
	}
	
	
	@GetMapping("/showFormForUpdate")
	public String showFormForUpdate(@RequestParam("clientId") int theId,
													Model theModel) {
		// retrieve the client from the database 
		Client theClient = clientService.getClient(theId);
		
		// retrieve the details from the database (using client's information)
		ClientDetail theDetail  = clientService.getClientDetail(theClient.getClientDetail().getId());
		
		// associate the objects
		theClient.setClientDetail(theDetail);
		
		
		// set client as a model attribute to pre-populate the form
		theModel.addAttribute("client", theClient);
		
		// send over to our form
		return "client-form-update";
	}
	
	@GetMapping("/delete")
	public String deleteClient(@RequestParam("clientId") int theId) {
		
		// retrieve the client from the database
		Client tempClient = clientService.getClient(theId);
		clientService.deleteClient(tempClient);
		
		return "redirect:/client/list";
	}
	
	


}


