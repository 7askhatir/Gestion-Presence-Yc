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
@Table(name="Apprenants")
public class Apprenants implements Serializable {
	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id_user;
	@Column
	private String nom_user;
	@Column
	private String email_user;
	@Column
	private String pass_user;
	@Column
	private boolean active;
	
	@Column
	private boolean role;

	public boolean isRole() {
		return role;
	}
	public void setRole(boolean role) {
		this.role = role;
	}
	@OneToMany(mappedBy="Apprenants")
    private Set<Reservation> Reservation;
	
	
	public Apprenants(String nom_user, String email_user, String pass_user, boolean active, boolean role) {
		super();
		this.nom_user = nom_user;
		this.email_user = email_user;
		this.pass_user = pass_user;
		this.active = active;
		this.role = role;
	}
	public Apprenants() {
		super();
		// TODO Auto-generated constructor stub
	}
	public long getId_user() {
		return id_user;
	}
	public void setId_user(long id_user) {
		this.id_user = id_user;
	}
	public String getNom_user() {
		return nom_user;
	}
	public void setNom_user(String nom_user) {
		this.nom_user = nom_user;
	}
	public String getEmail_user() {
		return email_user;
	}
	public void setEmail_user(String email_user) {
		this.email_user = email_user;
	}
	public String getPass_user() {
		return pass_user;
	}
	public void setPass_user(String pass_user) {
		this.pass_user = pass_user;
	}
	public boolean isActive() {
		return active;
	}
	public void setActive(boolean active) {
		this.active = active;
	}
	
	
	

}
