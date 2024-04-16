package com.eprern.seguridadpublica.servicios;

import java.util.List;
import java.util.Optional;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.eprern.seguridadpublica.model.Caratula;
import com.eprern.seguridadpublica.repositorio.Caratula_Repo;

@Service
public class Caratula_Service {
	@Autowired
	private Caratula_Repo caratula_Repo;
	public List<Caratula> findAll() {
		return caratula_Repo.findAll();
	}
	public <S extends Caratula> S save(S entity) {
		return caratula_Repo.save(entity);
	}
	public Optional<Caratula> findById(Long id) {
		return caratula_Repo.findById(id);
	}
	public void deleteById(Long id) {
		caratula_Repo.deleteById(id);
	}
	public void delete(Caratula entity) {
		caratula_Repo.delete(entity);
	}
	public List<Caratula> findAll(Sort sort) {
		return caratula_Repo.findAll(sort);
	}
	public Page<Caratula> findAll(Pageable pageable) {
		return caratula_Repo.findAll(pageable);
	}
}
