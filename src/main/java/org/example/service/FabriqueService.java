package org.example.service;

import java.util.List;

import org.example.model.Fabrique;

public interface FabriqueService {
	public void addFabrique(Fabrique p);
	public void deletFabrique(Long id);
	public List<Fabrique> getAllFabrique();
	public Fabrique getFabriqueById(Long id);
	public void updateFabrique(Fabrique p,Long id);
	public List<Fabrique> getByAction(boolean active);

}
