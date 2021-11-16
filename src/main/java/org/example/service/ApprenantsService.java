package org.example.service;


import java.util.List;

import org.example.model.Apprenants;

public interface ApprenantsService {
	public void addApprenants(Apprenants p);
	public void deletApprenants(Long id);
	public List<Apprenants> getAllApprenants();
	public Apprenants getApprenantsById(Long id);
	public void updateApprenants(Apprenants p,Long id);
	public List<Apprenants> getByAction(boolean active);

}
