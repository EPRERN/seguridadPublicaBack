package com.eprern.seguridadpublica.model;


import jakarta.persistence.*;

@Entity
@Table(name = "files")
public class FileUpload {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String fileName;

    @Lob
    private byte[] data;

    private String inputNumber;

    public FileUpload() {

    }

    public String getInputNumber() {
        return inputNumber;
    }

    public void setInputNumber(String inputNumber) {
        this.inputNumber = inputNumber;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public byte[] getData() {
        return data;
    }

    public void setData(byte[] data) {
        this.data = data;
    }

    public FileUpload(Long id, String fileName, byte[] data, String inputNumber) {
//        this.id = id;
        this.fileName = fileName;
        this.data = data;
        this.inputNumber = inputNumber;
    }
}
