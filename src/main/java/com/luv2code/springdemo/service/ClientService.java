package com.luv2code.springdemo.service;


import java.util.List;

import com.luv2code.springdemo.entity.Client;
import com.luv2code.springdemo.entity.ClientDetail;


public interface ClientService {
	
	public List<Client> getClients();

	public void saveClient(Client theClient);

	public Client getClient(int theId);

	public void deleteClient(Client tempClient);

	public ClientDetail getClientDetail(int clientDetailId);

	public List<Client> searchClients(String theSearchName);

	public List<Client> getClientsByLife();

	public List<Client> getClientsByRating();

	public List<Client> getClientsByHome();

	public List<Client> getClientsByAuto();

	public List<Client> getClientsByDebt();

	public List<Client> getClientsByTax();

	public List<Client> getClientsByLegal();

	public List<Client> getClientsByIdentity();

	public List<Client> getClientsByCollege();

	public List<Client> getClientsByMutual();

	public List<Client> getClientsByIra();

	public List<Client> getClientsByRoth();

	public List<Client> getClientsByFourOneK();

	public List<Client> getClientsByFourThreeB();

	public List<Client> getClientsByAnnuity();
	

}
