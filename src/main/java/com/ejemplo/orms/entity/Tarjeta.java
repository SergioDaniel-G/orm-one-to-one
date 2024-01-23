package com.ejemplo.orms.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tarjetas")
public class Tarjeta {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private Date fechaDecaducidad;

	@OneToOne
	@JoinColumn(name = "id_socio")
	private Socio socio;

	public Tarjeta(Date fechaDecaducidad, Socio socio) {
		super();
		this.fechaDecaducidad = fechaDecaducidad;
		this.socio = socio;
	}

	public Tarjeta() {
		super();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getFechaDecaducidad() {
		return fechaDecaducidad;
	}

	public void setFechaDecaducidad(Date fechaDecaducidad) {
		this.fechaDecaducidad = fechaDecaducidad;
	}

	public Socio getSocio() {
		return socio;
	}

	public void setSocio(Socio socio) {
		this.socio = socio;
	}

}
