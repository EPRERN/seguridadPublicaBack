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

import com.eprern.seguridadpublica.model.Caratula;
import com.eprern.seguridadpublica.model.Distribuidora;
import com.eprern.seguridadpublica.servicios.Caratula_Service;
import com.eprern.seguridadpublica.servicios.Distribuidora_Service;



@RestController
@RequestMapping("/distribuidora_rest/")
public class Distribuidora_Rest {

	@Autowired
	private Distribuidora_Service distribuidora_Service;
	
	@GetMapping
	private ResponseEntity<List<Distribuidora>> getAllDistribuidora(){
		return ResponseEntity.ok(distribuidora_Service.findAll());
	}
	
	@PostMapping
	private ResponseEntity<Distribuidora> saveDistribuidora(@RequestBody Distribuidora distribuidora){
		try {
			Distribuidora distribuidoraGuardada = distribuidora_Service.save(distribuidora);
			return ResponseEntity.created(new URI("/distribuidora_rest/"+distribuidoraGuardada.getId())).body(distribuidoraGuardada);
		} catch (Exception e) {
			// TODO: handle exception
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
		}
	}
	
	
	@DeleteMapping (value = "delete/{id}")
	private ResponseEntity<Boolean> deleteDistribuidora (@PathVariable ("id") Long id){
		distribuidora_Service.deleteById(id);
		return ResponseEntity.ok(!(distribuidora_Service.findById(id)!=null));
		
	}
	
}
