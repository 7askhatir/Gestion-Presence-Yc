package org.example.service;

import java.util.List;

import org.example.model.Reservation;

public interface ReservationService  {
	public void addReservation(Reservation r);
	public void deletReservations(Long id);
	public List<Reservation> getAllReservation();
	public Reservation getReservationById(Long id);
	public void updateReservation(Reservation r,Long id);
	public List<Reservation> getByAction();
	public List<Reservation> getReservationByUser(Long id);
}
