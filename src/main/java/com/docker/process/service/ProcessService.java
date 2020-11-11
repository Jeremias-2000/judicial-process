package com.docker.process.service;

import com.docker.process.document.Process;
import com.docker.process.repository.ProcessRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;


@Service
public class ProcessService implements AbstractService<Process>{

    @Autowired
    private ProcessRepository repository;

    public ProcessService(ProcessRepository repository) {
        this.repository = repository;
    }

    public List<Process> findAll(){
        return repository.findAll();
    }

    public Process findId(String id){
        return searchId(id);
    }

    @Override
    public Process update(String id, Process process) {
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


    public Process saveProcess(Process process){
        return repository.save(process);
    }



    public void delete(String id){
       Process deleted = searchId(id);
       repository.delete(deleted);
    }

    public Process searchId(String id){
        return repository.findById(id).orElseThrow(()
                -> new RuntimeException("Process not found !"));
    }


}
