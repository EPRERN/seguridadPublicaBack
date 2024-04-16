package com.eprern.seguridadpublica.rest;


import com.eprern.seguridadpublica.model.AnomaliaNotificada;
import com.eprern.seguridadpublica.servicios.AnomaliaNotificada_Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;


@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/anomaliaNotificada_rest/")
public class AnomaliaNotificada_Rest {

    private final AnomaliaNotificada_Service anomaliaNotificadaService;

    @Autowired
    public AnomaliaNotificada_Rest(AnomaliaNotificada_Service anomaliaNotificadaService) {
        this.anomaliaNotificadaService = anomaliaNotificadaService;
    }

    // Endpoint para obtener todas las anomalías notificadas
    @GetMapping
    private ResponseEntity<List<AnomaliaNotificada>> obtenerTodasLasAnomaliasNotificadas() {
        return ResponseEntity.ok(anomaliaNotificadaService.obtenerTodasLasAnomaliasNotificadas());
    }

    // Endpoint para obtener una anomalía notificada por su ID
    @GetMapping("/{id}")
    public AnomaliaNotificada obtenerAnomaliaNotificadaPorId(@PathVariable Long id) {
        return anomaliaNotificadaService.obtenerAnomaliaNotificadaPorId(id)
                .orElseThrow(() -> new RuntimeException("Anomalía notificada no encontrada con id: " + id));
    }

    // Endpoint para guardar una nueva anomalía notificada
    @PostMapping
    private ResponseEntity<AnomaliaNotificada> guardarAnomaliaNotificada(@RequestBody AnomaliaNotificada anomaliaNotificada) {
        try {
            AnomaliaNotificada anomaliaNotificadaGuardado = anomaliaNotificadaService.guardarAnomaliaNotificada(anomaliaNotificada);
            return ResponseEntity.created(new URI("/anomaliaNotificada_rest/"+anomaliaNotificadaGuardado.getId())).body(anomaliaNotificadaGuardado);
        }catch (Exception e){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }

    }

    // Endpoint para eliminar una anomalía notificada por su ID
    @DeleteMapping("/{id}")
    public void eliminarAnomaliaNotificadaPorId(@PathVariable Long id) {
        anomaliaNotificadaService.eliminarAnomaliaNotificadaPorId(id);
    }
}