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



import com.eprern.seguridadpublica.model.Localidad;
import com.eprern.seguridadpublica.servicios.Localidad_Service;
@RestController
@RequestMapping("/localidad_rest/")
public class Localidad_Rest {
	
	@Autowired
	private Localidad_Service localidad_Service;
	
	@GetMapping
	private ResponseEntity<List<Localidad>> getAllLocalidad(){
		return ResponseEntity.ok(localidad_Service.findAll());
	}
	
	@PostMapping
	private ResponseEntity<Localidad> saveLocalidad(@RequestBody Localidad localidad){
		try {
			Localidad localidadGuardada = localidad_Service.save(localidad);
			return ResponseEntity.created(new URI("/localidad_rest/"+localidadGuardada.getId())).body(localidadGuardada);
		} catch (Exception e) {
			// TODO: handle exception
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
		}
	}
	
	
	@DeleteMapping (value = "delete/{id}")
	private ResponseEntity<Boolean> deleteLocalidad(@PathVariable ("id") Long id){
		localidad_Service.deleteById(id);
		return ResponseEntity.ok(!(localidad_Service.findById(id)!=null));
		
	}
	
	

}
