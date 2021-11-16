package org.example.dao;

import java.util.List;


public interface Dao<T> {
	public void addProduit(T p);
	public void deleteProduit(Long id);
	public T getProduitById(Long id);
	public List<T> getAllProduits();
	public void updateProduit(T p,Long id);
	public List<T> getByActive(Boolean active);
	public List<T> getAllAgenda();
	public List<T> getAllFabrique();
	public List<T> getResevationNul();
	public List<T> getReservationByUser(Long id);
}
