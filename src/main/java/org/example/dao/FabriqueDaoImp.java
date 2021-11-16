package org.example.dao;

import java.util.List;

import org.example.model.Agenda;
import org.example.model.Apprenants;
import org.example.model.Fabrique;
import org.example.util.HibernateUtil;
import org.hibernate.Session;

public class FabriqueDaoImp implements Dao<Fabrique> {

	@Override
	public void addProduit(Fabrique p) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteProduit(Long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Fabrique getProduitById(Long id) {
		Session session=HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        Fabrique fabrique=(Fabrique) session.load(Fabrique.class, id);
        session.close();
        return fabrique;
	}
public void init4() {
		System.out.print("444cccccc");
	}

	@Override
	public List<Fabrique> getAllProduits() {
		return null;
	}

	@Override
	public void updateProduit(Fabrique p, Long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Fabrique> getByActive(Boolean active) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Fabrique> getAllAgenda() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Fabrique> getAllFabrique() {
		Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        @SuppressWarnings("unchecked")
        List<Fabrique> fabrique = (List<Fabrique>) session.createQuery("FROM Fabrique").list();
        session.getTransaction().commit();
        return fabrique;
	}

	@Override
	public List<Fabrique> getResevationNul() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Fabrique> getReservationByUser(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

}
