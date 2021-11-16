package org.example.model;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="Reservation")
public class Reservation implements Serializable {
	private static final long serialVersionUID = 1L;
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
private Long id_reservation;
@Column
private boolean active_reservation;

@ManyToOne(cascade=CascadeType.ALL)
@JoinColumn(name="id_agenda", nullable=false,referencedColumnName="id_agenda")
private Agenda Agenda;

@ManyToOne(cascade=CascadeType.ALL)
@JoinColumn(name="id_user", nullable=false,referencedColumnName="id_user")
private Apprenants Apprenants;

@ManyToOne(cascade=CascadeType.ALL)
@JoinColumn(name="id_fabrique", nullable=false,referencedColumnName="id_fabrique")
private Fabrique Fabrique;

public Reservation() {
	super();
	// TODO Auto-generated constructor stub
}



public Reservation(boolean active_reservation, org.example.model.Agenda agenda, org.example.model.Apprenants apprenants,
		org.example.model.Fabrique fabrique) {
	super();
	this.active_reservation = active_reservation;
	Agenda = agenda;
	Apprenants = apprenants;
	Fabrique = fabrique;
}



public Long getId_reservation() {
	return id_reservation;
}

public void setId_reservation(Long id_reservation) {
	this.id_reservation = id_reservation;
}

public boolean isActive_reservation() {
	return active_reservation;
}

public void setActive_reservation(boolean active_reservation) {
	this.active_reservation = active_reservation;
}



public Agenda getAgenda() {
	return Agenda;
}



public void setAgenda(Agenda agenda) {
	Agenda = agenda;
}



public Apprenants getApprenants() {
	return Apprenants;
}



public void setApprenants(Apprenants apprenants) {
	Apprenants = apprenants;
}



public Fabrique getFabrique() {
	return Fabrique;
}



public void setFabrique(Fabrique fabrique) {
	Fabrique = fabrique;
}

}
