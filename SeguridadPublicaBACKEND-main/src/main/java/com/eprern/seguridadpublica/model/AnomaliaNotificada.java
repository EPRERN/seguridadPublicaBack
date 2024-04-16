package com.eprern.seguridadpublica.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "anomalia_notificada")
public class AnomaliaNotificada {


    @Getter @Setter
    @Id
    @javax.persistence.Id
    @javax.persistence.GeneratedValue(strategy = javax.persistence.GenerationType.IDENTITY)
    private Long id;


    @Getter
    @Setter
    private String caratulaSeleccionada;

    @Getter @Setter
    private int nroExpediente;

    @Getter
    @Setter
    private int caso;


    @Getter @Setter
    private String distribuidora;

    @Getter
    @Setter
    private String codigo;

    @Getter
    @Setter
    private String descripcion;

    @Getter
    @Setter
    private String fecha;

    @Getter
    @Setter
    private boolean otros;

    @Getter
    @Setter
    @javax.persistence.Column(name = "fotos")
    private List<String> fotos;

    @Getter
    @Setter
    private String medidor;

    @Getter
    @Setter
    private String direccion;

    @Getter
    @Setter
    private String localidad;

    @Getter
    @Setter
    private String denunciante;

    @Getter
    @Setter
    private String empleado;

    @Getter
    @Setter
    private String gravedad;

    @Getter
    @Setter
    private long latitud;

    @Getter
    @Setter
    private long longitud;

    @Getter
    @Setter
    private int reclamoSara;

    @Getter @Setter
    private String fechaNotificacion;


    @Getter @Setter
    private String riesgo;


    @Getter @Setter
    private boolean notificada;




    public AnomaliaNotificada(){}

    public AnomaliaNotificada(Long id, String caratulaSeleccionada, int nroExpediente, int caso, String distribuidora, String codigo, String descripcion, String fecha, boolean otros, List<String> fotos, String medidor, String direccion, String localidad, String denunciante, String empleado, String gravedad, long latitud, long longitud, int reclamoSara, String fechaNotificacion, String riesgo, boolean notificada) {
        this.id = id;
        this.caratulaSeleccionada = caratulaSeleccionada;
        this.nroExpediente = nroExpediente;
        this.caso = caso;
        this.distribuidora = distribuidora;
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.fecha = fecha;
        this.otros = otros;
        this.fotos = fotos;
        this.medidor = medidor;
        this.direccion = direccion;
        this.localidad = localidad;
        this.denunciante = denunciante;
        this.empleado = empleado;
        this.gravedad = gravedad;
        this.latitud = latitud;
        this.longitud = longitud;
        this.reclamoSara = reclamoSara;
        this.fechaNotificacion = fechaNotificacion;
        this.riesgo = riesgo;
        this.notificada = notificada;
    }
}