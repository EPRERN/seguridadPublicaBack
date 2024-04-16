package com.eprern.seguridadpublica.rest;


import com.eprern.seguridadpublica.model.AnomaliaExpediente;
import com.eprern.seguridadpublica.model.UpdateGravedadRequest;
import com.eprern.seguridadpublica.repositorio.AnomaliaExpediente_Repo;
import com.eprern.seguridadpublica.servicios.AnomaliaExpediente_Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/anomaliaExpediente_rest/")
public class AnomaliaExpediente_Rest {

    @Autowired
    private AnomaliaExpediente_Service anomaliaExpedienteService;

    @GetMapping
    private ResponseEntity<List<AnomaliaExpediente>> getAllAnomaliaExpediente() { return ResponseEntity.ok(anomaliaExpedienteService.findAll());}


    @PostMapping
    private ResponseEntity<AnomaliaExpediente> saveAnomaliaExpediente(@RequestBody AnomaliaExpediente anomaliaExpediente){
        try {
            AnomaliaExpediente anomaliaExpedienteGuardado = anomaliaExpedienteService.save(anomaliaExpediente);
            return  ResponseEntity.created(new URI("/anomaliaExpediente_rest/"+anomaliaExpedienteGuardado.getId())).body(anomaliaExpedienteGuardado);
        }catch (Exception e){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }



    @DeleteMapping (value = "delete/{id}")
    private ResponseEntity<Boolean> deleteAnomaliaExpediente (@PathVariable ("id") Long id){
        anomaliaExpedienteService.deleteById(id);
        return ResponseEntity.ok(!(anomaliaExpedienteService.findById(id)!=null));
    }


    @PutMapping("/{id}")
    private ResponseEntity<AnomaliaExpediente> updateAnomaliaExpediente(
            @PathVariable("id") Long id,
            @RequestBody AnomaliaExpediente anomaliaExpediente) {

        try {
            Optional<AnomaliaExpediente> optionalExistingAnomalia = anomaliaExpedienteService.findById(id);

            if (optionalExistingAnomalia.isPresent()) {
                AnomaliaExpediente existingAnomalia = optionalExistingAnomalia.get();


                existingAnomalia.setNroExpediente(anomaliaExpediente.getNroExpediente());
                existingAnomalia.setCaso(anomaliaExpediente.getCaso());
                existingAnomalia.setCodigo(anomaliaExpediente.getCodigo());
                existingAnomalia.setOtros(anomaliaExpediente.isOtros());
                existingAnomalia.setDescripcion(anomaliaExpediente.getDescripcion());
                existingAnomalia.setFecha(anomaliaExpediente.getFecha());
                existingAnomalia.setFotos(anomaliaExpediente.getFotos());
                existingAnomalia.setMedidor(anomaliaExpediente.getMedidor());
                existingAnomalia.setDireccion(anomaliaExpediente.getDireccion());
                existingAnomalia.setDenunciante(anomaliaExpediente.getDenunciante());
                existingAnomalia.setEmpleado(anomaliaExpediente.getEmpleado());
                existingAnomalia.setLatitud(anomaliaExpediente.getLatitud());
                existingAnomalia.setLongitud(anomaliaExpediente.getLongitud());
                existingAnomalia.setReclamoSara(anomaliaExpediente.getReclamoSara());
                existingAnomalia.setLocalidad(anomaliaExpediente.getLocalidad());



                AnomaliaExpediente anomaliaExpedienteActualizado = anomaliaExpedienteService.save(existingAnomalia);
                return ResponseEntity.ok(anomaliaExpedienteActualizado);
            } else {
                return ResponseEntity.notFound().build();
            }

        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }

    @Autowired
    private AnomaliaExpediente_Repo anomaliaExpedienteRepo;

    @PutMapping("/updateGravedad")
    private ResponseEntity<AnomaliaExpediente> updateGravedadAnomalia(@RequestBody Map<String, Object> requestData) {
        try {
            List<Integer> ids = (List<Integer>) requestData.get("ids");
            String gravedad = (String) requestData.get("gravedad");
//            String codigo =  (String) requestData.get("codigo");

            System.out.println("IDs recibidos desde Angular: " + ids);
            System.out.println("Gravedad recibida desde Angular: " + gravedad);

            // Convertir los IDs de Integer a Long
            List<Long> longIds = ids.stream()
                    .map(Long::valueOf)
                    .toList();

            // Busca las anomalías por IDs y actualiza su gravedad y codigo
            for (Long id : longIds) {
                Optional<AnomaliaExpediente> anomaliaOptional = anomaliaExpedienteRepo.findById(id);
                anomaliaOptional.ifPresent(anomalia -> {
                    anomalia.setGravedad(gravedad);
//                    anomalia.setCodigo(codigo);

                    anomaliaExpedienteRepo.save(anomalia);
                });
            }

            return ResponseEntity.ok().build();
        } catch (Exception e) {
            System.out.println("Error al procesar la solicitud: " + e.getMessage());
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }


    @PutMapping("/updateOculto/{id}")
    private ResponseEntity<AnomaliaExpediente> updateOcultoAnomalia(@PathVariable("id") Long id, @RequestParam boolean oculto) {
        try {
            Optional<AnomaliaExpediente> anomaliaOptional = anomaliaExpedienteRepo.findById(id);
            if (anomaliaOptional.isPresent()) {
                AnomaliaExpediente anomalia = anomaliaOptional.get();
                anomalia.setOculto(oculto); // Asigna el valor de oculto
                anomaliaExpedienteRepo.save(anomalia); // Guarda la entidad actualizada
                return ResponseEntity.ok(anomalia);
            } else {
                return ResponseEntity.notFound().build();
            }
        } catch (Exception e) {
            System.out.println("Error al actualizar el campo oculto: " + e.getMessage());
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }



    @GetMapping("/obtenerCodigosAnomalias")
    private ResponseEntity<List<String>> obtenerCodigosAnomalias() {
        try {
            List<String> codigos = anomaliaExpedienteRepo.obtenerCodigosAnomalias();
            return ResponseEntity.ok(codigos);
        } catch (Exception e) {
            System.out.println("Error al obtener los códigos de anomalías: " + e.getMessage());
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }





}
