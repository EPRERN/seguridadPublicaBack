package com.eprern.seguridadpublica.model;

import java.io.Serializable;
import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="expediente_n")
public class Expediente implements Serializable{
	
//	 @Enumerated(EnumType.STRING)
//	 private Roles rol;
	
	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	@Column(name="fecha")
	private Date fecha; 
	
	private String distribuidora; 
	private String caratulaSeleccionada;
	
	@Column(name="nro_expediente")
	private int nroExpediente;
	
	
//	@ManyToOne
//	@JoinColumn(name = "id_distribuidora")
//	private Distribuidora distribuidora;
//	@ManyToOne
//	@JoinColumn(name = "id_caratula")
//	private Caratula caratulaSeleccionada;		//CARATULA SELECCIONADA:
	
	
	public Expediente() {}


public Expediente(Long id, Date fecha, String distribuidora, String caratulaSeleccionada, int nroExpediente) {
	super();
	this.id = id;
	this.fecha = fecha;
	this.distribuidora = distribuidora;
	this.caratulaSeleccionada = caratulaSeleccionada;
	this.nroExpediente = nroExpediente;
}


public Long getId() {
	return id;
}


public void setId(Long id) {
	this.id = id;
}


public Date getFecha() {
	return fecha;
}


public void setFecha(Date fecha) {
	this.fecha = fecha;
}


public String getDistribuidora() {
	return distribuidora;
}


public void setDistribuidora(String distribuidora) {
	this.distribuidora = distribuidora;
}


public String getCaratulaSeleccionada() {
	return caratulaSeleccionada;
}


public void setCaratulaSeleccionada(String caratulaSeleccionada) {
	this.caratulaSeleccionada = caratulaSeleccionada;
}


public int getNroExpediente() {
	return nroExpediente;
}


public void setNroExpediente(int nroExpediente) {
	this.nroExpediente = nroExpediente;
}


public static long getSerialversionuid() {
	return serialVersionUID;
}
	
	
	
	

}
