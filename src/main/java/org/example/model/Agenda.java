package org.example.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
@Entity
@Table(name="Agenda")

public class Agenda implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id_agenda;
	@Column
	private String desc_agenda;
	@Column
	private Date Date;
	
	public Agenda(long id_agenda, String desc_agenda, java.util.Date date, Set<org.example.model.Reservation> reservation) {
		super();
		this.id_agenda = id_agenda;
		this.desc_agenda = desc_agenda;
		Date = date;
		Reservation = reservation;
	}

	@OneToMany(mappedBy="Agenda")
    private Set<Reservation> Reservation;

	public long getId_agenda() {
		return id_agenda;
	}

	public void setId_agenda(long id_agenda) {
		this.id_agenda = id_agenda;
	}

	public String getDesc_agenda() {
		return desc_agenda;
	}

	public void setDesc_agenda(String desc_agenda) {
		this.desc_agenda = desc_agenda;
	}

	public Date getDate() {
		return Date;
	}

	public void setDate(Date date) {
		Date = date;
	}

	public Agenda() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Agenda(String desc_agenda, java.util.Date date) {
		super();
		this.desc_agenda = desc_agenda;
		Date = date;
	}
	

}

