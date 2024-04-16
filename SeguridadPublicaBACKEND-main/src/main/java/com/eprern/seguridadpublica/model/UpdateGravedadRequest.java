package com.eprern.seguridadpublica.model;

import lombok.Getter;
import lombok.Setter;

public class UpdateGravedadRequest {

    @Getter @Setter
    private Long id;
    @Getter @Setter
    private String gravedad;

//    @Getter @Setter
//    private String codigo;
}
