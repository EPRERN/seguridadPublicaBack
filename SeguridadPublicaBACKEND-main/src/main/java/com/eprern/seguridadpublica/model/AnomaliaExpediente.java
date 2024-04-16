package com.eprern.seguridadpublica.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Entity
@Table(name = "anomalia_expediente")
public class AnomaliaExpediente {

    @Getter
    @Setter
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Getter
    @Setter
    private String caratulaSeleccionada;

    @Getter
    @Setter
//    @ManyToOne    //SI NO FUNCIONA PROBAR CON ID_EXPEDIENTE
//    @JoinColumn(name = "id_expediente")
//    private Expediente nroExpediente;
    private int nroExpediente; ///ESTÁ MAL HACER ESTO, PERO POR LOS TIEMPOS QUE TENGO IMPUESTOS NECESITO CUANTO ANTES HACERLO FUNCIONAR, LO CORRECTO SERÍA QUE SEA DE LA FORMA QUE ESTÁ COMENTADA, ES DECIR UN ATRIBUTO DE TIPO OBJETO Y NO UN TIPO DE DATO COMUN


    @Getter
    @Setter
    private int caso;



    @Getter @Setter
    private String distribuidora;

    @Getter
    @Setter
//    @ManyToOne
//    @JoinColumn(name = "codigo")
//    private Anomalia codigo; ///ESTÁ MAL HACER ESTO, PERO POR LOS TIEMPOS QUE TENGO IMPUESTOS NECESITO CUANTO ANTES HACERLO FUNCIONAR, LO CORRECTO SERÍA QUE SEA DE LA FORMA QUE ESTÁ COMENTADA, ES DECIR UN ATRIBUTO DE TIPO OBJETO Y NO UN TIPO DE DATO COMUN
    private String codigo;





    @Getter
    @Setter
//  @ManyToOne
//  @JoinColumn(name = "descripcion")
//  private Anomalia descripcion; ///ESTÁ MAL HACER ESTO, PERO POR LOS TIEMPOS QUE TENGO IMPUESTOS NECESITO CUANTO ANTES HACERLO FUNCIONAR, LO CORRECTO SERÍA QUE SEA DE LA FORMA QUE ESTÁ COMENTADA, ES DECIR UN ATRIBUTO DE TIPO OBJETO Y NO UN TIPO DE DATO COMUN
    private String descripcion;


    @Getter
    @Setter
    private String fecha;

    @Getter
    @Setter
    private boolean otros;

    @Getter
    @Setter
    @ElementCollection
    @CollectionTable(name = "fotos", joinColumns = @JoinColumn(name = "anomalia_expediente_id"))
    @Column(name = "fotos")
    private List<String> fotos;


    @Getter
    @Setter
    private String medidor;


    @Getter
    @Setter
    private String direccion;


    @Getter
    @Setter
//    @ManyToOne
//    @JoinColumn(name = "id_localidad")
//    private Localidad localidad;  ///ESTÁ MAL HACER ESTO, PERO POR LOS TIEMPOS QUE TENGO IMPUESTOS NECESITO CUANTO ANTES HACERLO FUNCIONAR, LO CORRECTO SERÍA QUE SEA DE LA FORMA QUE ESTÁ COMENTADA, ES DECIR UN ATRIBUTO DE TIPO OBJETO Y NO UN TIPO DE DATO COMUN
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
    private boolean oculto = false;


    public AnomaliaExpediente(Long id, String caratulaSeleccionada, int nroExpediente, int caso, String distribuidora, String codigo, String descripcion, String fecha, boolean otros, List<String> fotos, String medidor, String direccion, String localidad, String denunciante, String empleado, String gravedad, long latitud, long longitud, int reclamoSara, String fechaNotificacion, String riesgo, boolean oculto) {
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
        this.oculto = oculto;
    }

    public AnomaliaExpediente() {}



}
