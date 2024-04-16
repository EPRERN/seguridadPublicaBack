package com.eprern.seguridadpublica.rest;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.eprern.seguridadpublica.model.TipoCaratula;
import com.eprern.seguridadpublica.servicios.TipoCaratula_Service;




@RestController
@RequestMapping("/tipocaratula_rest/")
public class TipoCaratula_Rest {
	
	@Autowired
	private TipoCaratula_Service tipoCaratula_Service;

	
	@GetMapping 
	private ResponseEntity<List<TipoCaratula>> getAllTiposCaratula(){
		return ResponseEntity.ok(tipoCaratula_Service.findAll());
	}
	
	@PostMapping
	private ResponseEntity<TipoCaratula> saveCaratula(@RequestBody TipoCaratula tipoCaratula){
		try {
			TipoCaratula tipoCaratulaGuardada = tipoCaratula_Service.save(tipoCaratula);
			return ResponseEntity.created(new URI("/tipocaratula_rest/"+tipoCaratulaGuardada.getId())).body(tipoCaratulaGuardada);
		} catch (Exception e) {
			// TODO: handle exception
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
		}
	}
	
	
	@DeleteMapping (value = "delete/{id}")
	private ResponseEntity<Boolean> deleteTipoCaratula (@PathVariable ("id") Long id){
		tipoCaratula_Service.deleteById(id);
		return ResponseEntity.ok(!(tipoCaratula_Service.findById(id)!=null));
		
	}
}
