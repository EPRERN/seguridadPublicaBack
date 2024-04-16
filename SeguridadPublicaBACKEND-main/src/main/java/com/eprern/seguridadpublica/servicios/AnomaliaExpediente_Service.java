package com.eprern.seguridadpublica.servicios;

import com.eprern.seguridadpublica.model.AnomaliaExpediente;
import com.eprern.seguridadpublica.repositorio.AnomaliaExpediente_Repo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

@Service
public class AnomaliaExpediente_Service {
    @Autowired
    private AnomaliaExpediente_Repo anomaliaExpediente_repo;





    public <S extends AnomaliaExpediente> S save(S entity) {
        return anomaliaExpediente_repo.save(entity);
    }

    public Optional<AnomaliaExpediente> findById(Long id) {
        return anomaliaExpediente_repo.findById(id);
    }

    public List<AnomaliaExpediente> findAll() {
        return anomaliaExpediente_repo.findAll();
    }

    public void deleteById(Long id) {
        anomaliaExpediente_repo.deleteById(id);
    }


    public void delete(AnomaliaExpediente entity) {
        anomaliaExpediente_repo.delete(entity);
    }
    public List<AnomaliaExpediente> findAll(Sort sort) {
        return anomaliaExpediente_repo.findAll(sort);
    }

    public Page<AnomaliaExpediente> findAll(Pageable pageable) {
        return anomaliaExpediente_repo.findAll(pageable);
    }


}
