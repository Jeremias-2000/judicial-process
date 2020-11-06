package com.docker.process.service;

import com.docker.process.document.Process;
import com.docker.process.repository.ProcessRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;


@Service
public class ProcessService {

    @Autowired
    private ProcessRepository repository;

    public List<Process> findAll(){
        return repository.findAll();
    }

    public Process findById(String id){
        return searchId(id);
    }



    public void saveProcess(Process process){
        repository.save(process);
    }

    public Process updateProcess(String id,Process process){
        Process update = searchId(id);

        update.setSource(process.getSource());
        update.setProcess_type(process.getProcess_type());
        update.setCpf(process.getCpf());
        update.setCnpj(process.getCnpj());
        update.setProcess_number(process.getProcess_number());
        update.setCounty(process.getCounty());
        update.setContact(process.getContact());
        update.setEmail(process.getEmail());
        update.setDeadline(process.getDeadline());
        return update;
    }

    public void deleteProcessById(String id){
       Process deleted = searchId(id);
       repository.delete(deleted);
    }

    public Process searchId(String id){
        return repository.findById(id).orElseThrow(()
                -> new RuntimeException("Process not found !"));
    }


}
