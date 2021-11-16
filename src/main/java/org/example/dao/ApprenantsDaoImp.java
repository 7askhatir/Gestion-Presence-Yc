package org.example.dao;

import java.util.ArrayList;
import java.util.List;

import org.example.model.Apprenants;
import org.example.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class ApprenantsDaoImp implements Dao<Apprenants> {
	
	public void init() {
		
	}

	
	private List<Apprenants> apprenants =new ArrayList<Apprenants>();
	
	 
	@Override
	public void addProduit(Apprenants p) {
		Session session= HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		session.save(p);
		session.getTransaction().commit();
		
	}

	@Override
	public void deleteProduit(Long id) {
		 Session session = HibernateUtil.getSessionFactory().openSession();
	        session.beginTransaction();

	        Apprenants user = (Apprenants) session.get(Apprenants.class, id);
	        session.delete(user);
	        session.getTransaction().commit();
	}

	@Override
	public Apprenants getProduitById(Long id) {
	         Session session=HibernateUtil.getSessionFactory().openSession();
	         session.beginTransaction();
	         Apprenants apprenants=(Apprenants) session.load(Apprenants.class, id);
	         session.beginTransaction().commit();
	         return apprenants;
	}

	@Override
	public List<Apprenants> getAllProduits() {
		  Session session = HibernateUtil.getSessionFactory().openSession();
	        session.beginTransaction();
	        @SuppressWarnings("unchecked")
	        List<Apprenants> users = (List<Apprenants>) session.createQuery("FROM Apprenants ORDER BY id_user ASC").list();
	        session.getTransaction().commit();
	        return users;
	}


	@Override
	public List<Apprenants> getByActive(Boolean active) {
		 Session session = HibernateUtil.getSessionFactory().openSession();
	        session.beginTransaction();
	        @SuppressWarnings("unchecked")
	        List<Apprenants> users = (List<Apprenants>) session.createQuery("FROM Apprenants where active=0 and role=0 ").list();
	        session.getTransaction().commit();
	        return users;
	}
	@Override
	public void updateProduit(Apprenants p, Long id) {
		 Session session = HibernateUtil.getSessionFactory().openSession();
	        session.beginTransaction();
	        Apprenants user = (Apprenants) session.get(Apprenants.class, id);
	        user.setActive(p.isActive());
	        session.update(user);
	        session.getTransaction().commit();
		
	}

	@Override
	public List<Apprenants> getAllAgenda() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Apprenants> getAllFabrique() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Apprenants> getResevationNul() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Apprenants> getReservationByUser(Long id) {
		// TODO Auto-generated method stub
		return null;
	}
	

}
