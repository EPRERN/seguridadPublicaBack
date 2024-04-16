package com.eprern.seguridadpublica.model;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "localidades_n")
public class Localidad implements Serializable{
	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String nombreLocalidad;
	private int codigoPostal;
	@ManyToOne
	@JoinColumn(name = "id_distrito")
	private Distrito distrito;
	@ManyToOne
	@JoinColumn(name = "id_distribuidora")
	private Distribuidora distribuidora;
	
	public Localidad() {}

	public Localidad(Long id, String nombreLocalidad, int codigoPostal, Distrito distrito,
			Distribuidora distribuidora) {
		super();
		this.id = id;
		this.nombreLocalidad = nombreLocalidad;
		this.codigoPostal = codigoPostal;
		this.distrito = distrito;
		this.distribuidora = distribuidora;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombreLocalidad() {
		return nombreLocalidad;
	}

	public void setNombreLocalidad(String nombreLocalidad) {
		this.nombreLocalidad = nombreLocalidad;
	}

	public int getCodigoPostal() {
		return codigoPostal;
	}

	public void setCodigoPostal(int codigoPostal) {
		this.codigoPostal = codigoPostal;
	}

	public Distrito getDistrito() {
		return distrito;
	}

	public void setDistrito(Distrito distrito) {
		this.distrito = distrito;
	}

	public Distribuidora getDistribuidora() {
		return distribuidora;
	}

	public void setDistribuidora(Distribuidora distribuidora) {
		this.distribuidora = distribuidora;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	
	
}
