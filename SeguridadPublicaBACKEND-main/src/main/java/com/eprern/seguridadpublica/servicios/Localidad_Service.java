package com.eprern.seguridadpublica.servicios;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.eprern.seguridadpublica.model.Localidad;
import com.eprern.seguridadpublica.repositorio.Localidad_Repo;


@Service
public class Localidad_Service {

	@Autowired
	private Localidad_Repo Localidad_Repo;
	
	

	
	public List<Localidad> findAll() {
		// TODO Auto-generated method stub
		return Localidad_Repo.findAll();
	}


	
	public <S extends Localidad> S save(S entity) {
		// TODO Auto-generated method stub
		return Localidad_Repo.save(entity);
	}

	
	public Optional<Localidad> findById(Long id) {
		// TODO Auto-generated method stub
		return Localidad_Repo.findById(id);
	}


	
	public void deleteById(Long id) {
		// TODO Auto-generated method stub
		Localidad_Repo.deleteById(id);
	}

	
	public void delete(Localidad entity) {
		// TODO Auto-generated method stub
		Localidad_Repo.delete(entity);
	}

	

	
	public void deleteAll() {
		// TODO Auto-generated method stub
		Localidad_Repo.deleteAll();
	}

	
	public List<Localidad> findAll(Sort sort) {
		// TODO Auto-generated method stub
		return Localidad_Repo.findAll(sort);
	}

	
	public Page<Localidad> findAll(Pageable pageable) {
		// TODO Auto-generated method stub
		return Localidad_Repo.findAll(pageable);
	}



}
