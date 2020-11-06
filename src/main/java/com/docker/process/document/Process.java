package com.docker.process.document;


import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.Instant;


@Document
public class Process {

    @Id
    private String id;

    private String process_number;
    private String source;
    private String process_type;
    private String defedants_cpf;
    private String defedants_cnpj;
    private String county;
    private String defedants_contact;
    private String defedants_email;
    @CreatedDate
    private Instant deadline = Instant.now();

    public Process(String id, String process_number, String source, String process_type, String defedants_cpf, String defedants_cnpj,
                   String county, String defedants_contact, String defedants_email, Instant deadline) {
        this.id = id;
        this.process_number = process_number;
        this.source = source;

        this.defedants_cpf = defedants_cpf;
        this.defedants_cnpj = defedants_cnpj;
        this.county = county;
        this.defedants_contact = defedants_contact;
        this.defedants_email = defedants_email;
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


    public String getProcess_type() {
        return process_type;
    }

    public void setProcess_type(String process_type) {
        this.process_type = process_type;
    }


    public String getCpf() {
        return defedants_cpf;
    }

    public void setCpf(String cpf) {
        this.defedants_cpf = cpf;
    }

    public String getCnpj() {
        return defedants_cnpj;
    }

    public void setCnpj(String cnpj) {
        this.defedants_cnpj = cnpj;
    }

    public String getCounty() {
        return county;
    }

    public void setCounty(String county) {
        this.county = county;
    }

    public String getContact() {
        return defedants_contact;
    }

    public void setContact(String contact) {
        this.defedants_contact = contact;
    }

    public String getEmail() {
        return defedants_email;
    }

    public void setEmail(String email) {
        this.defedants_email = email;
    }


    public Instant getDeadline() {
        return deadline;
    }

    public void setDeadline(Instant deadline) {
        this.deadline = deadline;
    }

    @Override
    public String toString() {
        return "Process{" +
                "id=" + id +
                ", process_number='" + process_number + '\'' +
                ", source='" + source + '\'' +
                ", process type='" + process_type + '\'' +
                ", cpf(do réu)='" + defedants_cpf + '\'' +
                ", cnpj='" + defedants_cnpj + '\'' +
                ", county='" + county + '\'' +
                ", contact(do réu)='" + defedants_contact + '\'' +
                ", email (do réu)='" + defedants_email + '\'' +
                ", deadline=" + deadline +
                '}';
    }
}
