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


import com.eprern.seguridadpublica.model.TipoCaratula;
import com.eprern.seguridadpublica.repositorio.TipoCaratula_Repo;



@Service
public class TipoCaratula_Service implements TipoCaratula_Repo{

	@Autowired
	private TipoCaratula_Repo tipoCaratula_Repo;
	
	@Override
	public void flush() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public <S extends TipoCaratula> S saveAndFlush(S entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends TipoCaratula> List<S> saveAllAndFlush(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteAllInBatch(Iterable<TipoCaratula> entities) {
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
	public TipoCaratula getOne(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TipoCaratula getById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TipoCaratula getReferenceById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends TipoCaratula> List<S> findAll(Example<S> example) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends TipoCaratula> List<S> findAll(Example<S> example, Sort sort) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends TipoCaratula> List<S> saveAll(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<TipoCaratula> findAll() {
		// TODO Auto-generated method stub
		return tipoCaratula_Repo.findAll();
	}

	@Override
	public List<TipoCaratula> findAllById(Iterable<Long> ids) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends TipoCaratula> S save(S entity) {
		// TODO Auto-generated method stub
		return tipoCaratula_Repo.save(entity);
	}

	@Override
	public Optional<TipoCaratula> findById(Long id) {
		// TODO Auto-generated method stub
		return tipoCaratula_Repo.findById(id);
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
		tipoCaratula_Repo.deleteById(id);
	}

	@Override
	public void delete(TipoCaratula entity) {
		// TODO Auto-generated method stub
		tipoCaratula_Repo.delete(entity);
	}

	@Override
	public void deleteAllById(Iterable<? extends Long> ids) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll(Iterable<? extends TipoCaratula> entities) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<TipoCaratula> findAll(Sort sort) {
		// TODO Auto-generated method stub
		return tipoCaratula_Repo.findAll(sort);
	}

	@Override
	public Page<TipoCaratula> findAll(Pageable pageable) {
		// TODO Auto-generated method stub
		return tipoCaratula_Repo.findAll(pageable);
	}

	@Override
	public <S extends TipoCaratula> Optional<S> findOne(Example<S> example) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	@Override
	public <S extends TipoCaratula> Page<S> findAll(Example<S> example, Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends TipoCaratula> long count(Example<S> example) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public <S extends TipoCaratula> boolean exists(Example<S> example) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public <S extends TipoCaratula, R> R findBy(Example<S> example,
			Function<FetchableFluentQuery<S>, R> queryFunction) {
		// TODO Auto-generated method stub
		return null;
	}

}
