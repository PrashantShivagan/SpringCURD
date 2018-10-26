package com.cg.springmvc2.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.cg.springmvc2.dto.Mobile;
@Repository("mobiledao")
public class MobileDaoImpl implements MobileDao {
	@PersistenceContext
	EntityManager em;
	@Override
	public void addMobile(Mobile mobile) {
		// TODO Auto-generated method stub
		em.persist(mobile);
		em.flush();
	}

	@Override
	public List<Mobile> showAllMobile() {
		// TODO Auto-generated method stub
		Query query = em.createQuery("FROM Mobile");
		List<Mobile> myAll = query.getResultList();
		return myAll;
	}

	@Override
	public void deleteMobile(int mobId) {
		// TODO Auto-generated method stub
		

	}

	@Override
	public Mobile searchMobile(int mobId) {
		// TODO Auto-generated method stub
		Query querySearch = em.createQuery("From Mobile where mobid=:mobdata");
		querySearch.setParameter("mobdata",mobId);
		Mobile mob=(Mobile) querySearch.getResultList().get(0);
		return mob;
	}

}
