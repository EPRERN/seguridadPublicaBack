package com.eprern.seguridadpublica.model;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "distribuidora_n")
public class Distribuidora implements Serializable{
	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String nombreDistribuidora;
	
	public Distribuidora() {}
	
	public Distribuidora( String nombreDistribuidora) {
		super();
//		this.id = id;
		this.nombreDistribuidora = nombreDistribuidora;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombreDistribuidora() {
		return nombreDistribuidora;
	}

	public void setNombreDistribuidora(String nombreDistribuidora) {
		this.nombreDistribuidora = nombreDistribuidora;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	
	
	

}
