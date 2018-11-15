package com.luv2code.springdemo.dao;



import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.luv2code.springdemo.entity.Client;
import com.luv2code.springdemo.entity.ClientDetail;
import com.luv2code.springdemo.entity.Recruit;


@Repository
public class ClientDAOImpl implements ClientDAO {

	// need to inject the session factory
	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public List<Client> getClients() {
		
		// get the current hibernate session 
		Session currentSession = sessionFactory.getCurrentSession();
		
		// create a query
		Query<Client> theQuery = currentSession.createQuery("from Client order by lastName", Client.class);
		
		// execute query and get result list
		List<Client> clients = theQuery.getResultList();
		
		// return the results
		return clients;
		
	}

	@Override
	public void saveClient(Client theClient) {
		
		
		// get current hibernate session
		Session currentSession = sessionFactory.getCurrentSession();
		
		// save or update the recruit
		theClient.setClientDetail(theClient.getClientDetail());
		currentSession.saveOrUpdate(theClient);
		
	}

	@Override
	public Client getClient(int theId) {
		
			//get current hibernate session 
			Session currentSession = sessionFactory.getCurrentSession();
				// retreive/read from the database using the primary key
			Client theClient = currentSession.get(Client.class, theId);
			

		return theClient;
	}

	@Override
	public void deleteClient(Client tempClient) {
		// get the current hibernate session
		Session currentSession = sessionFactory.getCurrentSession();
		
		// delete object with primary key
		currentSession.delete(tempClient);
	}

	@Override
	public ClientDetail getClientDetail(int clientDetailId) {
		
		//get current hibernate session 
		Session currentSession = sessionFactory.getCurrentSession();
		
		// retrieve/read from the database using the primary key
		ClientDetail theDetail = currentSession.get(ClientDetail.class, clientDetailId);
		

	return theDetail;

	}

	@Override
	public List<Client> searchClients(String theSearchName) {

		 // get the current hibernate session
       Session currentSession = sessionFactory.getCurrentSession();
       
       Query theQuery = null;
       
       //
       // only search by name if theSearchName is not empty
       //
       if (theSearchName != null && theSearchName.trim().length() > 0) {

           // search for firstName or lastName ... case insensitive
           theQuery =currentSession.createQuery("from Client where lower(firstName) like :theName or lower(lastName) like :theName", Client.class);
           theQuery.setParameter("theName", "%" + theSearchName.toLowerCase() + "%");

       }
       else {
           // theSearchName is empty ... so just get all customers
           theQuery =currentSession.createQuery("from Client", Client.class);            
       }
       
       // execute query and get result list
       List<Client> clients = theQuery.getResultList();
               
       // return the results        
       return clients;
	}

	@Override
	public List<Client> getClientsByRating() {
		// get the current hibernate session 
				Session currentSession = sessionFactory.getCurrentSession();
				
		// create a query
				Query<Client> theQuery = currentSession.createQuery("from Client order by businessRating", Client.class);
				
		// execute query and get result list
				List<Client> clients = theQuery.getResultList();
				
		// return the results
		return clients;
	}
	
	@Override
	public List<Client> getClientsByLife() {
		// get the current hibernate session 
		Session currentSession = sessionFactory.getCurrentSession();
		
		// create a query
		Query<Client> theQuery = currentSession.createQuery("from Client order by clientDetail.lifeInsuranceCoverage", Client.class);
		
		// execute query and get result list
		List<Client> clients = theQuery.getResultList();
		
		// return the results
		return clients;
	}

	@Override
	public List<Client> getClientsByHome() {
		// get the current hibernate session 
				Session currentSession = sessionFactory.getCurrentSession();
				
		// create a query
				Query<Client> theQuery = currentSession.createQuery("from Client order by clientDetail.homeInsuranceCoverage", Client.class);
				
		// execute query and get result list
				List<Client> clients = theQuery.getResultList();
				
		// return the results
		return clients;
	}

	@Override
	public List<Client> getClientsByAuto() {
		// get the current hibernate session 
				Session currentSession = sessionFactory.getCurrentSession();
				
		// create a query
				Query<Client> theQuery = currentSession.createQuery("from Client order by clientDetail.autoInsuranceCoverage", Client.class);
				
		// execute query and get result list
				List<Client> clients = theQuery.getResultList();
				
		// return the results
		return clients;
	}

	@Override
	public List<Client> getClientsByDebt() {
		// get the current hibernate session 
				Session currentSession = sessionFactory.getCurrentSession();
				
		// create a query
				Query<Client> theQuery = currentSession.createQuery("from Client order by clientDetail.debtConsolidationCoverage", Client.class);
				
		// execute query and get result list
				List<Client> clients = theQuery.getResultList();
				
		// return the results
		return clients;
	}

	@Override
	public List<Client> getClientsByTax() {
		// get the current hibernate session 
				Session currentSession = sessionFactory.getCurrentSession();
				
		// create a query
				Query<Client> theQuery = currentSession.createQuery("from Client order by clientDetail.taxResolutionCoverage", Client.class);
				
		// execute query and get result list
				List<Client> clients = theQuery.getResultList();
				
		// return the results
		return clients;
	}

	@Override
	public List<Client> getClientsByLegal() {
		// get the current hibernate session 
				Session currentSession = sessionFactory.getCurrentSession();
				
		// create a query
				Query<Client> theQuery = currentSession.createQuery("from Client order by clientDetail.prePaidLegalCoverage", Client.class);
				
		// execute query and get result list
				List<Client> clients = theQuery.getResultList();
				
		// return the results
				return clients;
	}

	@Override
	public List<Client> getClientsByIdentity() {
		// get the current hibernate session 
				Session currentSession = sessionFactory.getCurrentSession();
				
		// create a query
				Query<Client> theQuery = currentSession.createQuery("from Client order by clientDetail.identityTheftCoverage", Client.class);
				
		// execute query and get result list
				List<Client> clients = theQuery.getResultList();
				
		// return the results
		return clients;
	}

	@Override
	public List<Client> getClientsByCollege() {
		// get the current hibernate session 
				Session currentSession = sessionFactory.getCurrentSession();
				
		// create a query
				Query<Client> theQuery = currentSession.createQuery("from Client order by clientDetail.collegeFundPortfolio", Client.class);
				
		// execute query and get result list
				List<Client> clients = theQuery.getResultList();
				
		// return the results
		return clients;
	}

	@Override
	public List<Client> getClientsByMutual() {
		// get the current hibernate session 
				Session currentSession = sessionFactory.getCurrentSession();
				
		// create a query
				Query<Client> theQuery = currentSession.createQuery("from Client order by clientDetail.mutualFundPortfolio", Client.class);
				
		// execute query and get result list
				List<Client> clients = theQuery.getResultList();
				
		// return the results
		return clients;
	}

	@Override
	public List<Client> getClientsByIra() {
		// get the current hibernate session 
				Session currentSession = sessionFactory.getCurrentSession();
				
		// create a query
				Query<Client> theQuery = currentSession.createQuery("from Client order by clientDetail.iraPortfolio", Client.class);
				
		// execute query and get result list
				List<Client> clients = theQuery.getResultList();
				
		// return the results
		return clients;
	}

	@Override
	public List<Client> getClientsByRoth() {
		// get the current hibernate session 
				Session currentSession = sessionFactory.getCurrentSession();
				
		// create a query
				Query<Client> theQuery = currentSession.createQuery("from Client order by clientDetail.rothIraPortfolio", Client.class);
				
		// execute query and get result list
				List<Client> clients = theQuery.getResultList();
				
		// return the results
		return clients;
	}

	@Override
	public List<Client> getClientsByFourOneK() {
		// get the current hibernate session 
				Session currentSession = sessionFactory.getCurrentSession();
				
		// create a query
				Query<Client> theQuery = currentSession.createQuery("from Client order by clientDetail.fourOneKPortfolio", Client.class);
				
		// execute query and get result list
				List<Client> clients = theQuery.getResultList();
				
		// return the results
		return clients;
	}

	@Override
	public List<Client> getClientsByFourThreeB() {
		// get the current hibernate session 
				Session currentSession = sessionFactory.getCurrentSession();
				
		// create a query
				Query<Client> theQuery = currentSession.createQuery("from Client order by clientDetail.fourThreeBPortfolio", Client.class);
				
		// execute query and get result list
				List<Client> clients = theQuery.getResultList();
				
		// return the results
		return clients;
	}

	@Override
	public List<Client> getClientsByAnnuity() {
		// get the current hibernate session 
				Session currentSession = sessionFactory.getCurrentSession();
				
		// create a query
				Query<Client> theQuery = currentSession.createQuery("from Client order by clientDetail.variableAnnuityPortfolio", Client.class);
				
		// execute query and get result list
				List<Client> clients = theQuery.getResultList();
				
		// return the results
		return clients;
	}

}
