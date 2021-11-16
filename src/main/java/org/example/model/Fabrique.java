package org.example.model;


import java.io.Serializable;
import java.util.List;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
@Entity
@Table(name="Fabrique")
public class Fabrique implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id_fabrique;
	@Column
	private String nom_fabrique;
	@Column
	private int nbr_max;
	
	@OneToMany(mappedBy="Fabrique")
    private Set<Reservation> Reservation;
	
	public Fabrique() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Fabrique(String nom_fabrique, int nbr_max) {
		super();
		this.nom_fabrique = nom_fabrique;
		this.nbr_max = nbr_max;
	}
	public long getId_fabrique() {
		return id_fabrique;
	}
	public void setId_fabrique(long id_fabrique) {
		this.id_fabrique = id_fabrique;
	}
	public String getNom_fabrique() {
		return nom_fabrique;
	}
	public void setNom_fabrique(String nom_fabrique) {
		this.nom_fabrique = nom_fabrique;
	}
	public int getNbr_max() {
		return nbr_max;
	}
	public void setNbr_max(int nbr_max) {
		this.nbr_max = nbr_max;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	
	

	
}

