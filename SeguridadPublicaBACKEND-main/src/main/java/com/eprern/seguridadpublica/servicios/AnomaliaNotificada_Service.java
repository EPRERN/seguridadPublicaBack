package com.eprern.seguridadpublica.servicios;

import com.eprern.seguridadpublica.model.AnomaliaNotificada;
import com.eprern.seguridadpublica.repositorio.AnomaliaNotificada_Repo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AnomaliaNotificada_Service {
    private final AnomaliaNotificada_Repo anomaliaNotificadaRepo;

    @Autowired
    public AnomaliaNotificada_Service(AnomaliaNotificada_Repo anomaliaNotificadaRepo) {
        this.anomaliaNotificadaRepo = anomaliaNotificadaRepo;
    }

    // Método para guardar una anomalía notificada en la base de datos
    public AnomaliaNotificada guardarAnomaliaNotificada(AnomaliaNotificada anomaliaNotificada) {
        return anomaliaNotificadaRepo.save(anomaliaNotificada);
    }

    // Método para obtener todas las anomalías notificadas
    public List<AnomaliaNotificada> obtenerTodasLasAnomaliasNotificadas() {
        return anomaliaNotificadaRepo.findAll();
    }

    // Método para obtener una anomalía notificada por su ID
    public Optional<AnomaliaNotificada> obtenerAnomaliaNotificadaPorId(Long id) {
        return anomaliaNotificadaRepo.findById(id);
    }

    // Método para eliminar una anomalía notificada por su ID
    public void eliminarAnomaliaNotificadaPorId(Long id) {
        anomaliaNotificadaRepo.deleteById(id);
    }

}
