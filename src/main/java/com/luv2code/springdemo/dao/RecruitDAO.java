package com.luv2code.springdemo.dao;



import java.util.List;

import com.luv2code.springdemo.entity.Recruit;
import com.luv2code.springdemo.entity.RecruitDetail;


public interface RecruitDAO {
	
	public List<Recruit> getRecruits();

	public void saveRecruit(Recruit theRecruit);

	public Recruit getRecruit(int theId);

	public void deleteRecruit(Recruit tempRecruit);

	public RecruitDetail getRecruitDetail(int recruitDetailId);

	public List<Recruit> searchRecruits(String theSearchName);

	public List<Recruit> getRecruitsByPromotion();

	public List<Recruit> getRecruitsByEnthusiasm();

}
