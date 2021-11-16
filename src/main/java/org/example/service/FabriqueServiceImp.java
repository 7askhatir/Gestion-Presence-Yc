package org.example.service;

import java.util.List;

import org.example.dao.Dao;
import org.example.model.Fabrique;

public class FabriqueServiceImp implements FabriqueService {

	private Dao dao;
	
	public Dao getDao() {
		return dao;
	}

	public void setDao(Dao dao) {
		this.dao = dao;
	}

	@Override
	public void addFabrique(Fabrique p) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deletFabrique(Long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Fabrique> getAllFabrique() {
		return dao.getAllFabrique();
	}

	@Override
	public Fabrique getFabriqueById(Long id) {
		return (Fabrique) dao.getProduitById(id);
	}

	@Override
	public void updateFabrique(Fabrique p, Long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Fabrique> getByAction(boolean active) {
		// TODO Auto-generated method stub
		return null;
	}

	
}
