package com.luv2code.springdemo.service;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.luv2code.springdemo.dao.RecruitDAO;
import com.luv2code.springdemo.entity.Recruit;
import com.luv2code.springdemo.entity.RecruitDetail;



@Service
public class RecruitServiceImpl implements RecruitService {

	// need to inject recruit dao
	
	@Autowired
	private RecruitDAO recruitDAO;
	
	@Override
	@Transactional
	public List<Recruit> getRecruits() {
		
		return recruitDAO.getRecruits();
	}

	@Override
	@Transactional
	public void saveRecruit(Recruit theRecruit) {
		recruitDAO.saveRecruit(theRecruit);
		
	}

	@Override
	@Transactional
	public Recruit getRecruit(int theId) {
		
		return recruitDAO.getRecruit(theId);
	}

	@Override
	@Transactional
	public void deleteRecruit(Recruit tempRecruit) {
		
		recruitDAO.deleteRecruit(tempRecruit);
	}

	@Override
	@Transactional
	public RecruitDetail getRecruitDetail(int recruitDetailId) {
		
		return recruitDAO.getRecruitDetail(recruitDetailId);
	}

	@Override
	@Transactional
	public List<Recruit> searchRecruits(String theSearchName) {
		
		 return recruitDAO.searchRecruits(theSearchName);
	}

	@Override
	@Transactional
	public List<Recruit> getRecruitsByPromotion() {
		// TODO Auto-generated method stub
		return recruitDAO.getRecruitsByPromotion();
	}

	@Override
	@Transactional
	public List<Recruit> getRecruitsByEnthusiasm() {
		// TODO Auto-generated method stub
		return recruitDAO.getRecruitsByEnthusiasm();
	}

}
