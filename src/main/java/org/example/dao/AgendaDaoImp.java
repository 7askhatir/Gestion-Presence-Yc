package org.example.dao;

import java.util.List;

import org.example.model.Agenda;
import org.example.model.Apprenants;
import org.example.util.HibernateUtil;
import org.hibernate.Session;

public class AgendaDaoImp implements Dao<Agenda> {
     
	 public void init3(){
 
	    }
	@Override
	public void addProduit(Agenda p) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteProduit(Long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Agenda getProduitById(Long id) {
		Session session=HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        Agenda agenda=(Agenda)session.load(Agenda.class, id);
        session.getTransaction().commit();
        return agenda ;
	}

	@Override
	public List<Agenda> getAllAgenda() {
		Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        @SuppressWarnings("unchecked")
        List<Agenda> agenda = (List<Agenda>) session.createQuery("FROM Agenda").list();
        session.getTransaction().commit();
        return agenda;
	}

	@Override
	public void updateProduit(Agenda p, Long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Agenda> getByActive(Boolean active) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public List<Agenda> getAllProduits() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public List<Agenda> getAllFabrique() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public List<Agenda> getResevationNul() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public List<Agenda> getReservationByUser(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

}
