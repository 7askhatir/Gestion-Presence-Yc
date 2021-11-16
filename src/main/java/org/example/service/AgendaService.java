package org.example.service;

import java.util.List;

import org.example.model.Agenda;
import org.example.model.Apprenants;

public interface AgendaService {
	public void addAgenda(Agenda p);
	public void deletAgenda(Long id);
	public List<Agenda> getAllAgenda();
	public Agenda getAgendaById(Long id);
	public void updateAgenda(Agenda p,Long id);
	public List<Agenda> getByAction(boolean active);
}
