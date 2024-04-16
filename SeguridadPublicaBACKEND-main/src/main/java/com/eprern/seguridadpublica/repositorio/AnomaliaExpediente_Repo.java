package com.eprern.seguridadpublica.repositorio;

import com.eprern.seguridadpublica.model.AnomaliaExpediente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface AnomaliaExpediente_Repo extends JpaRepository<AnomaliaExpediente, Long> {

    @Query("SELECT DISTINCT ae.codigo FROM AnomaliaExpediente ae")
    List<String> obtenerCodigosAnomalias();
}
