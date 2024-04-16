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


import com.eprern.seguridadpublica.model.Anomalia;
import com.eprern.seguridadpublica.servicios.Anomalia_Service;

@RestController
@RequestMapping("/anomalia_rest/")
public class Anomalia_Rest {
	
	@Autowired
	private Anomalia_Service anomalia_Service;
	
	@GetMapping
	private ResponseEntity<List<Anomalia>> getAllAnomalia(){
		return ResponseEntity.ok(anomalia_Service.findAll());
	}
	
	@PostMapping
	private ResponseEntity<Anomalia> saveAnomalia(@RequestBody Anomalia anomalia){
		try {
			Anomalia anomaliaGuardada = anomalia_Service.save(anomalia);
			return ResponseEntity.created(new URI("/anomalia_rest/" + anomaliaGuardada.getId())).body(anomaliaGuardada);
		}catch(Exception e) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();	
		}	
	}
	
	
	@DeleteMapping(value = "delete/{id}")
	private ResponseEntity<Boolean> deleteAnomalia (@PathVariable ("id") Long id){
		anomalia_Service.deleteById(id);
		return ResponseEntity.ok(!(anomalia_Service.findById(id)!=null));
	}

	
	
}
