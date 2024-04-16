package com.eprern.seguridadpublica.model;

import java.io.Serializable;
import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "caratulas_n")
public class Caratula implements Serializable{
	

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private Date fecha;
	private boolean tieneExpediente;
	private String aclaracion;
	@ManyToOne
	@JoinColumn(name = "id_distribuidora")
	private Distribuidora distribuidora;  		 //CEB - CEARC - EDERSA
	@ManyToOne
	@JoinColumn(name = "id_tipocaratula")
	private TipoCaratula tipoCaratula; 		 //Anomalía Seguridad Publica Epre
	private String tipoGravedad;  		 //LEVE - GRAVE
	private String caratulaSeleccionada;  //tipoCaratula + tipoGravedad + aclaracion
	
	
	public Caratula() {}


	public Caratula( Date fecha, boolean tieneExpediente, String aclaracion, Distribuidora distribuidora,
			TipoCaratula tipoCaratula, String tipoGravedad, String caratulaSeleccionada) {
		super();
//		this.id = id;
		this.fecha = fecha;
		this.tieneExpediente = tieneExpediente;
		this.aclaracion = aclaracion;
		this.distribuidora = distribuidora;
		this.tipoCaratula = tipoCaratula;
		this.tipoGravedad = tipoGravedad;
		this.caratulaSeleccionada = caratulaSeleccionada;
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


	public boolean isTieneExpediente() {
		return tieneExpediente;
	}


	public void setTieneExpediente(boolean tieneExpediente) {
		this.tieneExpediente = tieneExpediente;
	}


	public String getAclaracion() {
		return aclaracion;
	}


	public void setAclaracion(String aclaracion) {
		this.aclaracion = aclaracion;
	}


	public Distribuidora getDistribuidora() {
		return distribuidora;
	}


	public void setDistribuidora(Distribuidora distribuidora) {
		this.distribuidora = distribuidora;
	}


	public TipoCaratula getTipoCaratula() {
		return tipoCaratula;
	}


	public void setTipoCaratula(TipoCaratula tipoCaratula) {
		this.tipoCaratula = tipoCaratula;
	}


	public String getTipoGravedad() {
		return tipoGravedad;
	}


	public void setTipoGravedad(String tipoGravedad) {
		this.tipoGravedad = tipoGravedad;
	}


	public String getCaratulaSeleccionada() {
		return caratulaSeleccionada;
	}


	public void setCaratulaSeleccionada(String caratulaSeleccionada) {
		this.caratulaSeleccionada = caratulaSeleccionada;
	}


	public static long getSerialversionuid() {
		return serialVersionUID;
	}



}
