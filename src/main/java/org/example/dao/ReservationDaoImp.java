package org.example.dao;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.example.model.*;
import org.example.util.HibernateUtil;
import org.hibernate.Session;

public class ReservationDaoImp implements Dao<Reservation> {
	private List<Reservation> reservation = new ArrayList<Reservation>();
	Date date = new Date();

	public void init2() {

	}

	@Override
	public void addProduit(Reservation r) {
		Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        
        //Add new Employee object
        Reservation emp = new Reservation();
        emp=r;
        session.save(emp);
 
        //Commit the transaction
        session.getTransaction().commit();
        HibernateUtil.shutdown();
		
	}

	@Override
	public void deleteProduit(Long id) {
		Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        Reservation user = (Reservation) session.get(Reservation.class, id);
        user.setApprenants(null);
        user.setAgenda(null);
        user.setFabrique(null);
        session.delete(user);
        session.getTransaction().commit();

	}

	@Override
	public List<Reservation> getAllProduits() {
		return reservation;
	}

	@Override
	public void updateProduit(Reservation p, Long id) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		Reservation user = (Reservation) session.get(Reservation.class, id);
		user.setActive_reservation(p.isActive_reservation());
		session.update(user);
		session.getTransaction().commit();
	}

	@Override
	public Reservation getProduitById(Long id) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		return (Reservation) session.load(Reservation.class, id);

	}

	@Override
	public List<Reservation> getByActive(Boolean active) {

		return null;
	}

	@Override
	public List<Reservation> getAllAgenda() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Reservation> getAllFabrique() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Reservation> getResevationNul() {
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		@SuppressWarnings("unchecked")
		List<Reservation> users = (List<Reservation>) session.createQuery("FROM Reservation where active_reservation=0")
				.list();
		session.getTransaction().commit();
		return users;
	}

	@Override
	public List<Reservation> getReservationByUser(Long id) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		@SuppressWarnings("unchecked")
		List<Reservation> users = (List<Reservation>) session.createQuery("FROM Reservation where id_user="+id)
				.list();
		session.getTransaction().commit();
		return users;
	}

}
