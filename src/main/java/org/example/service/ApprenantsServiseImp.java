package org.example.service;

import java.util.List;

import org.example.dao.Dao;
import org.example.model.Apprenants;

public class ApprenantsServiseImp implements  ApprenantsService {
     private Dao<Apprenants> dao;

	public Dao getDao() {
		return dao;
	}

	public void setDao(Dao dao) {
		this.dao = dao;
	}

	@Override
	public void addApprenants(Apprenants p) {
		dao.addProduit(p);
		
	}

	@Override
	public void deletApprenants(Long id) {
		dao.deleteProduit(id);
		
	}

	

	@Override
	public Apprenants getApprenantsById(Long id) {
		return (Apprenants) dao.getProduitById(id);
	}

	@Override
	public List<Apprenants> getAllApprenants() {
		return dao.getAllProduits();
	}

	@Override
	public List<Apprenants> getByAction(boolean active) {
		return dao.getByActive(active);
				}

	@Override
	public void updateApprenants(Apprenants p,Long id) {
		dao.updateProduit(p,id);
		
	}


	

}
