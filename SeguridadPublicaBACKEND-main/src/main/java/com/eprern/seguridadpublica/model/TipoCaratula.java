package com.eprern.seguridadpublica.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name= "tipocaratula_n")
public class TipoCaratula {

	
	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String tipoDeCaratula;
	
	
	
	
	public TipoCaratula(){}

	public TipoCaratula( String tipoDeCaratula) {
		super();
//		this.id = id;
		this.tipoDeCaratula = tipoDeCaratula;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTipoDeCaratula() {
		return tipoDeCaratula;
	}

	public void setTipoDeCaratula(String tipoDeCaratula) {
		this.tipoDeCaratula = tipoDeCaratula;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
}
