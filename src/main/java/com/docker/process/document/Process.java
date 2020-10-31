package com.docker.process.document;


import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Document
public class Process {

    @Id
    private String id;

    private String process_number;
    private String source;
    private String document;
    private String cpf;
    private String cnpj;
    private String address;
    private String contact;
    private String email;
    @CreatedDate
    private Date  deadline;

    public Process(String id, String process_number, String source, String document, String cpf, String cnpj,
                   String address, String contact, String email, Date deadline) {
        this.id = id;
        this.process_number = process_number;
        this.source = source;
        this.document = document;
        this.cpf = cpf;
        this.cnpj = cnpj;
        this.address = address;
        this.contact = contact;
        this.email = email;
        this.deadline = deadline;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }


    public String getProcess_number() {
        return process_number;
    }

    public void setProcess_number(String process_number) {
        this.process_number = process_number;
    }


    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }


    public String getDocument() {
        return document;
    }

    public void setDocument(String document) {
        this.document = document;
    }


    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    public Date getDeadline() {
        return deadline;
    }

    public void setDeadline(Date deadline) {
        this.deadline = deadline;
    }

    @Override
    public String toString() {
        return "Process{" +
                "id=" + id +
                ", process_number='" + process_number + '\'' +
                ", source='" + source + '\'' +
                ", document='" + document + '\'' +
                ", cpf='" + cpf + '\'' +
                ", cnpj='" + cnpj + '\'' +
                ", address='" + address + '\'' +
                ", contact='" + contact + '\'' +
                ", email='" + email + '\'' +
                ", deadline=" + deadline +
                '}';
    }
}
