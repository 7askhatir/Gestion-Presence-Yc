package org.example.service;

import java.util.List;

import org.example.dao.Dao;
import org.example.model.Reservation;

public class ReservationServiceImp implements ReservationService {
    public Dao<Reservation> getDao() {
		return dao;
	}

	public void setDao(Dao<Reservation> dao) {
		this.dao = dao;
	}

	private Dao<Reservation> dao;

	@Override
	public void addReservation(Reservation r) {
		dao.addProduit(r);
		
	}

	@Override
	public void deletReservations(Long id) {
         dao.deleteProduit(id);	
	}

	@Override
	public List<Reservation> getAllReservation() {
		
		return dao.getAllProduits();
	}

	@Override
	public Reservation getReservationById(Long id) {
		
		return dao.getProduitById(id);
	}

	@Override
	public void updateReservation(Reservation r, Long id) {
               dao.updateProduit(r, id);		
	}

	@Override
	public List<Reservation> getByAction() {
		
  		return dao.getResevationNul();
	}

	@Override
	public List<Reservation> getReservationByUser(Long id) {
		// TODO Auto-generated method stub
		return dao.getReservationByUser(id);
	}

	

	
}
