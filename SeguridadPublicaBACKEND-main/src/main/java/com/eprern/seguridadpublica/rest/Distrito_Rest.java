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



import com.eprern.seguridadpublica.model.Distrito;
import com.eprern.seguridadpublica.servicios.Distrito_Service;
@RestController
@RequestMapping("/distrito_rest/")
public class Distrito_Rest {
	
	@Autowired
	private Distrito_Service distrito_Service;
	
	@GetMapping
	private ResponseEntity<List<Distrito>> getAllDistrito(){
		return ResponseEntity.ok(distrito_Service.findAll());
	}

	
	@PostMapping
	private ResponseEntity<Distrito> saveDistrito(@RequestBody Distrito distrito){
		try {
			Distrito distritoGuardado = distrito_Service.save(distrito);
			return ResponseEntity.created(new URI("/distrito_rest/"+distritoGuardado.getId())).body(distritoGuardado);
		} catch (Exception e) {
			// TODO: handle exception
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
		}
	}
	
	
	@DeleteMapping (value = "delete/{id}")
	private ResponseEntity<Boolean> deleteDistrito(@PathVariable ("id") Long id){
		distrito_Service.deleteById(id);
		return ResponseEntity.ok(!(distrito_Service.findById(id)!=null));
		
	}
	
	
	
	
	
	
}
