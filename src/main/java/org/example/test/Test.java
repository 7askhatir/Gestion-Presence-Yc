package org.example.test;


import java.sql.SQLException;
import java.util.Date;
import java.util.List;

import org.example.model.Etudiant;
import org.example.service.EtudiantService;
import org.springframework.beans.factory.annotation.Autowired;

public class Test {
	
	@Autowired
	private static EtudiantService etudiantService;
	

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		/*Etudiant karim = new Etudiant("test", new Date(), "test@gmail.com", "tof-test");
		/*	etudiantService.save(karim);

			List<Etudiant> etudiants = etudiantService.findAll();


			System.out.println("Etudiant : " + etudiants.get(2).getNom());*/

			
}

}
