package org.example.service;

import java.util.List;

import org.example.dao.Dao;
import org.example.model.Agenda;

public class AgendaServiceImp implements AgendaService {

	private Dao<Agenda> dao;
	
	public Dao<Agenda> getDao() {
		return dao;
	}

	public void setDao(Dao<Agenda> dao) {
		this.dao = dao;
	}

	@Override
	public void addAgenda(Agenda p) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deletAgenda(Long id) {
		// TODO Auto-generated method stub
		
	}

	
	

	@Override
	public Agenda getAgendaById(Long id) {
		return dao.getProduitById(id);
	}

	@Override
	public void updateAgenda(Agenda p, Long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Agenda> getByAction(boolean active) {
		return null;
	}

	@Override
	public List<Agenda> getAllAgenda() {
		return dao.getAllAgenda();
	}
    

}
