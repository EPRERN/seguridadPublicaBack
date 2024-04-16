package com.eprern.seguridadpublica.model;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "anomalia_n")
public class Anomalia implements Serializable{
	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	

	private String codigo; 
	private String descripcion; 
	private String riesgo; 
	private double cuantificacion; 
	private GravedadAnomalia gravedad;
	private boolean otros;
	
	public Anomalia() {}
	
	public Anomalia(Long id, String descripcion, String codigo, String riesgo, double cuantificacion,
			GravedadAnomalia gravedad, boolean otros) {
		super();
//		this.id = id;
		this.descripcion = descripcion;
		this.codigo = codigo;
		this.riesgo = riesgo;
		this.cuantificacion = cuantificacion;
		this.gravedad = gravedad;
		this.otros = otros;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getRiesgo() {
		return riesgo;
	}

	public void setRiesgo(String riesgo) {
		this.riesgo = riesgo;
	}

	public double getCuantificacion() {
		return cuantificacion;
	}

	public void setCuantificacion(double cuantificacion) {
		this.cuantificacion = cuantificacion;
	}

	public GravedadAnomalia getGravedad() {
		return gravedad;
	}

	public void setGravedad(GravedadAnomalia gravedad) {
		this.gravedad = gravedad;
	}

	public boolean isOtros() {
		return otros;
	}

	public void setOtros(boolean otros) {
		this.otros = otros;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	
	
	
	

}
