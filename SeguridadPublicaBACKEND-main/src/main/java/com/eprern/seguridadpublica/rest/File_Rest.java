package com.eprern.seguridadpublica.rest;

import com.eprern.seguridadpublica.model.FileUpload;
import com.eprern.seguridadpublica.repositorio.FileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping("/files")
public class File_Rest {
    private final FileRepository fileRepository;

/////////////////////////////////////////////ESTO NO SE USA, FUE UNA PRUEBA PARA LA PARTE DE PROCESAR EL EXCEL DE CARGA DE IMAGENES

    @Autowired
    public File_Rest(FileRepository fileRepository){
        this.fileRepository = fileRepository;


    }


    @PostMapping("/upload")
    public String uploadFile(@RequestParam("file") MultipartFile file, @RequestParam("inputNumber") String inputNumber) {
        try {
            FileUpload fileUpload = new FileUpload();
            fileUpload.setFileName(file.getOriginalFilename());
            fileUpload.setData(file.getBytes()); // Guardar los bytes del archivo en la entidad
            fileUpload.setInputNumber(inputNumber); // Asignar el número ingresado por el usuario

            fileRepository.save(fileUpload); // Guardar en el repositorio
            return "File uploaded successfully!";
        } catch (Exception e) {
            return "Failed to upload file: " + e.getMessage();
        }
    }

}
