package com.eprern.seguridadpublica.servicios;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery.FetchableFluentQuery;
import org.springframework.stereotype.Service;


import com.eprern.seguridadpublica.model.Distribuidora;
import com.eprern.seguridadpublica.repositorio.Distribuidora_Repo;


@Service
public class Distribuidora_Service {

	@Autowired
	private Distribuidora_Repo distribuidora_Repo;
	
	

	
	public List<Distribuidora> findAll() {
		// TODO Auto-generated method stub
		return distribuidora_Repo.findAll();
	}

	

	public <S extends Distribuidora> S save(S entity) {
		// TODO Auto-generated method stub
		return distribuidora_Repo.save(entity);
	}

	
	public Optional<Distribuidora> findById(Long id) {
		// TODO Auto-generated method stub
		return distribuidora_Repo.findById(id);
	}

	
	public void deleteById(Long id) {
		// TODO Auto-generated method stub
		distribuidora_Repo.deleteById(id);
	}

	
	public void delete(Distribuidora entity) {
		// TODO Auto-generated method stub
		distribuidora_Repo.delete(entity);
	}




	
	public List<Distribuidora> findAll(Sort sort) {
		// TODO Auto-generated method stub
		return distribuidora_Repo.findAll(sort);
	}

	
	public Page<Distribuidora> findAll(Pageable pageable) {
		// TODO Auto-generated method stub
		return distribuidora_Repo.findAll(pageable);
	}
	

}
