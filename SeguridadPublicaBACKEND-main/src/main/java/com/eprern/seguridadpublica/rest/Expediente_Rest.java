package com.eprern.seguridadpublica.rest;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
//import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.eprern.seguridadpublica.model.Caratula;
import com.eprern.seguridadpublica.model.Expediente;
import com.eprern.seguridadpublica.servicios.Caratula_Service;
import com.eprern.seguridadpublica.servicios.Expediente_Service;
@RestController
@RequestMapping("/expediente_rest/")
public class Expediente_Rest {
	
	@Autowired
	private Expediente_Service expediente_Service;
		
	@GetMapping
	private ResponseEntity<List<Expediente>> getAllExpediente(){
		return ResponseEntity.ok(expediente_Service.findAll());
	}
	
	
//	@PreAuthorize("hasRole('ADMINISTRADOR')")
	@PostMapping("/save")
	private ResponseEntity<Expediente> saveExpediente(@RequestBody Expediente expediente){
	    try {
	    	// Procesar y guardar el expediente recibido
            Expediente expedienteGuardado = expediente_Service.save(expediente);
            System.out.println("Valores recibidos: " + expediente.toString());
            return ResponseEntity.created(new URI("/expediente_rest/"+expedienteGuardado.getId())).body(expedienteGuardado);
	        
	    } catch (Exception e) {
	        e.printStackTrace(); 
	        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(expediente); 
	    }
	    
	}	
	@DeleteMapping (value = "delete/{id}")
	private ResponseEntity<Boolean> deleteExpediente (@PathVariable ("id") Long id){
		expediente_Service.deleteById(id);
		return ResponseEntity.ok(!(expediente_Service.findById(id)!=null));	
	}
}
