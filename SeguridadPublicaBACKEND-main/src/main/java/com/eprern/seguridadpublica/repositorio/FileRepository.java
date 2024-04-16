package com.eprern.seguridadpublica.repositorio;

import com.eprern.seguridadpublica.model.FileUpload;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FileRepository extends JpaRepository<FileUpload, Long> {
}
