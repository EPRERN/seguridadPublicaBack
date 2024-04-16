package com.eprern.seguridadpublica.rest;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.eprern.seguridadpublica.model.Caratula;
import com.eprern.seguridadpublica.servicios.Caratula_Service;


@CrossOrigin(origins = "http://localhost:4200") 
@RestController
@RequestMapping("/caratula_rest/")
public class Caratula_Rest {
	
	@Autowired
	private Caratula_Service caratula_Service;
	
	@GetMapping
	private ResponseEntity<List<Caratula>> getAllCaratula(){
		return ResponseEntity.ok(caratula_Service.findAll());
	}



	@PostMapping
	private ResponseEntity<Caratula> saveCarartula(@RequestBody Caratula caratula){
		try {
			Caratula caratulaGuardada = caratula_Service.save(caratula);
			return ResponseEntity.created(new URI("/caratula_rest/"+caratulaGuardada.getId())).body(caratulaGuardada);
		} catch (Exception e) {
			// TODO: handle exception
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
		}
	}
	@DeleteMapping (value = "delete/{id}")
	private ResponseEntity<Boolean> deleteCaratula (@PathVariable ("id") Long id){
		caratula_Service.deleteById(id);
		return ResponseEntity.ok(!(caratula_Service.findById(id)!=null));
	}
}
