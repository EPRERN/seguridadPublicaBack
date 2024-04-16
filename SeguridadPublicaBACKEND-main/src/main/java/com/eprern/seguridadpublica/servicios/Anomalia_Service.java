package com.eprern.seguridadpublica.servicios;

import java.util.List;
import java.util.Optional;


import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.eprern.seguridadpublica.model.Anomalia;
import com.eprern.seguridadpublica.repositorio.Anomalia_Repo;


@Service
public class Anomalia_Service{

	@Autowired
	private Anomalia_Repo anomalia_Repo;
	
	


	
	public List<Anomalia> findAll() {
		// TODO Auto-generated method stub
		return anomalia_Repo.findAll();
	}

	

	
	public <S extends Anomalia> S save(S entity) {
		// TODO Auto-generated method stub
		return anomalia_Repo.save(entity);
	}


	public Optional<Anomalia> findById(Long id) {
		// TODO Auto-generated method stub
		return anomalia_Repo.findById(id);
	}




	public void deleteById(Long id) {
		// TODO Auto-generated method stub
		anomalia_Repo.deleteById(id);
	}


	public void delete(Anomalia entity) {
		// TODO Auto-generated method stub
		anomalia_Repo.delete(entity);
	}




	public void deleteAll() {
		// TODO Auto-generated method stub
		anomalia_Repo.deleteAll();
	}


	public List<Anomalia> findAll(Sort sort) {
		// TODO Auto-generated method stub
		return anomalia_Repo.findAll(sort);
	}


	public Page<Anomalia> findAll(Pageable pageable) {
		// TODO Auto-generated method stub
		return anomalia_Repo.findAll(pageable);
	}


}
