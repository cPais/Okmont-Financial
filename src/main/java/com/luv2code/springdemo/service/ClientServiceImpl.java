package com.luv2code.springdemo.service;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.luv2code.springdemo.dao.ClientDAO;
import com.luv2code.springdemo.entity.Client;
import com.luv2code.springdemo.entity.ClientDetail;



@Service
public class ClientServiceImpl implements ClientService {

	// need to inject recruit dao
	
	@Autowired
	private ClientDAO clientDAO;
	
	@Override
	@Transactional
	public List<Client> getClients() {
		
		return clientDAO.getClients();
	}

	@Override
	@Transactional
	public void saveClient(Client theClient) {
		clientDAO.saveClient(theClient);
		
	}

	@Override
	@Transactional
	public Client getClient(int theId) {
		
		return clientDAO.getClient(theId);
	}

	@Override
	@Transactional
	public void deleteClient(Client tempClient) {
		
		clientDAO.deleteClient(tempClient);
	}

	@Override
	@Transactional
	public ClientDetail getClientDetail(int clientDetailId) {
		
		return clientDAO.getClientDetail(clientDetailId);
	}

	@Override
	@Transactional
	public List<Client> searchClients(String theSearchName) {
		// TODO Auto-generated method stub
		return clientDAO.searchClients(theSearchName);
	}

	
	
	@Override
	@Transactional
	public List<Client> getClientsByRating() {
		// TODO Auto-generated method stub
		return clientDAO.getClientsByRating();
	}
	
	@Override
	@Transactional
	public List<Client> getClientsByLife() {
		// TODO Auto-generated method stub
		return clientDAO.getClientsByLife();
	}

	

	@Override
	@Transactional
	public List<Client> getClientsByHome() {
		// TODO Auto-generated method stub
		return clientDAO.getClientsByHome();
	}

	@Override
	@Transactional
	public List<Client> getClientsByAuto() {
		// TODO Auto-generated method stub
		return clientDAO.getClientsByAuto();
	}

	@Override
	@Transactional
	public List<Client> getClientsByDebt() {
		// TODO Auto-generated method stub
		return clientDAO.getClientsByDebt();
	}

	@Override
	@Transactional
	public List<Client> getClientsByTax() {
		// TODO Auto-generated method stub
		return clientDAO.getClientsByTax();
	}

	@Override
	@Transactional
	public List<Client> getClientsByLegal() {
		// TODO Auto-generated method stub
		return clientDAO.getClientsByLegal();
	}

	@Override
	@Transactional
	public List<Client> getClientsByIdentity() {
		// TODO Auto-generated method stub
		return clientDAO.getClientsByIdentity();
	}

	@Override
	@Transactional
	public List<Client> getClientsByCollege() {
		// TODO Auto-generated method stub
		return clientDAO.getClientsByCollege();
	}

	@Override
	@Transactional
	public List<Client> getClientsByMutual() {
		// TODO Auto-generated method stub
		return clientDAO.getClientsByMutual();
	}

	@Override
	@Transactional
	public List<Client> getClientsByIra() {
		// TODO Auto-generated method stub
		return clientDAO.getClientsByIra();
	}

	@Override
	@Transactional
	public List<Client> getClientsByRoth() {
		// TODO Auto-generated method stub
		return clientDAO.getClientsByRoth();
	}

	@Override
	@Transactional
	public List<Client> getClientsByFourOneK() {
		// TODO Auto-generated method stub
		return clientDAO.getClientsByFourOneK();
	}

	@Override
	@Transactional
	public List<Client> getClientsByFourThreeB() {
		// TODO Auto-generated method stub
		return clientDAO.getClientsByFourThreeB();
	}

	@Override
	@Transactional
	public List<Client> getClientsByAnnuity() {
		// TODO Auto-generated method stub
		return clientDAO.getClientsByAnnuity();
	}

}
