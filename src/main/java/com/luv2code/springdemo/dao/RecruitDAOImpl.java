package com.luv2code.springdemo.dao;



import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.luv2code.springdemo.entity.Recruit;
import com.luv2code.springdemo.entity.RecruitDetail;


@Repository
public class RecruitDAOImpl implements RecruitDAO {

	// need to inject the session factory
	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public List<Recruit> getRecruits() {
		
		// get the current hibernate session 
		Session currentSession = sessionFactory.getCurrentSession();
		
		// create a query
		Query<Recruit> theQuery = currentSession.createQuery("from Recruit order by lastName", Recruit.class);
		
		// execute query and get result list
		List<Recruit> recruits = theQuery.getResultList();
		
		// return the results
		return recruits;
		
	}
	
	@Override
	public List<Recruit> getRecruitsByPromotion() {
		
		// get the current hibernate session 
				Session currentSession = sessionFactory.getCurrentSession();
				
		// create a query
				Query<Recruit> theQuery = currentSession.createQuery("from Recruit order by recruitDetail.promotionLevel", Recruit.class);
				
		// execute query and get result list
				List<Recruit> recruits = theQuery.getResultList();
				
		// return the results
				return recruits;
	}

	@Override
	public List<Recruit> getRecruitsByEnthusiasm() {
		// get the current hibernate session 
		Session currentSession = sessionFactory.getCurrentSession();
		
		// create a query
		Query<Recruit> theQuery = currentSession.createQuery("from Recruit order by recruitDetail.enthusiasmLevel", Recruit.class);
		
		// execute query and get result list
		List<Recruit> recruits = theQuery.getResultList();
		
		// return the results
		return recruits;
	}

	@Override
	public void saveRecruit(Recruit theRecruit) {
		
		
		// get current hibernate session
		Session currentSession = sessionFactory.getCurrentSession();
		
		// save or update the recruit
		theRecruit.setRecruitDetail(theRecruit.getRecruitDetail());
		currentSession.saveOrUpdate(theRecruit);
		
	}

	@Override
	public Recruit getRecruit(int theId) {
		
			//get current hibernate session 
			Session currentSession = sessionFactory.getCurrentSession();
				// retreive/read from the database using the primary key
			Recruit theRecruit = currentSession.get(Recruit.class, theId);
			

		return theRecruit;
	}

	@Override
	public void deleteRecruit(Recruit tempRecruit) {
		// get the current hibernate session
		Session currentSession = sessionFactory.getCurrentSession();
		
		// delete object with primary key
		currentSession.delete(tempRecruit);
	}

	@Override
	public RecruitDetail getRecruitDetail(int recruitDetailId) {
		
		//get current hibernate session 
		Session currentSession = sessionFactory.getCurrentSession();
		
		// retrieve/read from the database using the primary key
		RecruitDetail theDetail = currentSession.get(RecruitDetail.class, recruitDetailId);
		

	return theDetail;

	}

	@Override
	public List<Recruit> searchRecruits(String theSearchName) {
		
		 // get the current hibernate session
        Session currentSession = sessionFactory.getCurrentSession();
        
        Query theQuery = null;
        
        //
        // only search by name if theSearchName is not empty
        //
        if (theSearchName != null && theSearchName.trim().length() > 0) {

            // search for firstName or lastName ... case insensitive
            theQuery =currentSession.createQuery("from Recruit where lower(firstName) like :theName or lower(lastName) like :theName", Recruit.class);
            theQuery.setParameter("theName", "%" + theSearchName.toLowerCase() + "%");

        }
        else {
            // theSearchName is empty ... so just get all customers
            theQuery =currentSession.createQuery("from Recruit", Recruit.class);            
        }
        
        // execute query and get result list
        List<Recruit> recruits = theQuery.getResultList();
                
        // return the results        
        return recruits;
        
	}

	

}
