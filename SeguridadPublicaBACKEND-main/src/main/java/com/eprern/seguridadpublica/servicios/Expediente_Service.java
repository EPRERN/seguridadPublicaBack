package com.eprern.seguridadpublica.servicios;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.eprern.seguridadpublica.model.Expediente;
import com.eprern.seguridadpublica.repositorio.Expediente_Repo;



@Service
public class Expediente_Service {

	@Autowired
	private Expediente_Repo expediente_Repo;
	
	public List<Expediente> findAll() {
		// TODO Auto-generated method stub
		return expediente_Repo.findAll();
	}
	public List<Expediente> findAllById(Iterable<Long> ids) {
		// TODO Auto-generated method stub
		return null;
	}
	public <S extends Expediente> S save(S entity) {
		// TODO Auto-generated method stub
		return expediente_Repo.save(entity);
	}
	public Optional<Expediente> findById(Long id) {
		// TODO Auto-generated method stub
		return expediente_Repo.findById(id);
	}
	public void deleteById(Long id) {
		// TODO Auto-generated method stub
		expediente_Repo.deleteById(id);
	}
	public void delete(Expediente entity) {
		// TODO Auto-generated method stub
		expediente_Repo.delete(entity);
	}
	public List<Expediente> findAll(Sort sort) {
		// TODO Auto-generated method stub
		return expediente_Repo.findAll(sort);
	}
	public Page<Expediente> findAll(Pageable pageable) {
		// TODO Auto-generated method stub
		return expediente_Repo.findAll(pageable);
	}
}
