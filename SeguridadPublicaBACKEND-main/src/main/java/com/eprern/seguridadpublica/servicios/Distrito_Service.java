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

import com.eprern.seguridadpublica.model.Distrito;
import com.eprern.seguridadpublica.repositorio.Distrito_Repo;


@Service
public class Distrito_Service implements Distrito_Repo{

	@Autowired
	private Distrito_Repo distrito_Repo;
	
	@Override
	public void flush() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public <S extends Distrito> S saveAndFlush(S entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Distrito> List<S> saveAllAndFlush(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteAllInBatch(Iterable<Distrito> entities) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAllByIdInBatch(Iterable<Long> ids) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAllInBatch() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Distrito getOne(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Distrito getById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Distrito getReferenceById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Distrito> List<S> findAll(Example<S> example) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Distrito> List<S> findAll(Example<S> example, Sort sort) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Distrito> List<S> saveAll(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Distrito> findAll() {
		// TODO Auto-generated method stub
		return distrito_Repo.findAll();
	}

	@Override
	public List<Distrito> findAllById(Iterable<Long> ids) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Distrito> S save(S entity) {
		// TODO Auto-generated method stub
		return distrito_Repo.save(entity);
	}

	@Override
	public Optional<Distrito> findById(Long id) {
		// TODO Auto-generated method stub
		return distrito_Repo.findById(id);
	}

	@Override
	public boolean existsById(Long id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public long count() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void deleteById(Long id) {
		// TODO Auto-generated method stub
		distrito_Repo.deleteById(id);
	}

	@Override
	public void delete(Distrito entity) {
		// TODO Auto-generated method stub
		distrito_Repo.delete(entity);
	}

	@Override
	public void deleteAllById(Iterable<? extends Long> ids) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll(Iterable<? extends Distrito> entities) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Distrito> findAll(Sort sort) {
		// TODO Auto-generated method stub
		return distrito_Repo.findAll(sort);
	}

	@Override
	public Page<Distrito> findAll(Pageable pageable) {
		// TODO Auto-generated method stub
		return distrito_Repo.findAll(pageable);
	}

	@Override
	public <S extends Distrito> Optional<S> findOne(Example<S> example) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	@Override
	public <S extends Distrito> Page<S> findAll(Example<S> example, Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Distrito> long count(Example<S> example) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public <S extends Distrito> boolean exists(Example<S> example) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public <S extends Distrito, R> R findBy(Example<S> example, Function<FetchableFluentQuery<S>, R> queryFunction) {
		// TODO Auto-generated method stub
		return null;
	}

}
