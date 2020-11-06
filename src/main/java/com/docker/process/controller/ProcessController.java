package com.docker.process.controller;

import com.docker.process.document.Process;
import com.docker.process.service.ProcessService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/api/v1/processo")
public class ProcessController implements EntityController {

    @Autowired
    private ProcessService service;

    public ProcessController(ProcessService service) {
        this.service = service;
    }


    @Override
    public ResponseEntity<?> listarProcessos() {
        try {
            return new ResponseEntity<>(service.findAll(), HttpStatus.OK);
        }catch (RuntimeException e){
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }

    }

    @Override
    public ResponseEntity<?> pesquisarId(String id) {
       try {
           return new ResponseEntity<>(service.findById(id),HttpStatus.OK);
       }catch (RuntimeException e){
           System.out.println("Not found =>" + e);
           return new ResponseEntity<>(HttpStatus.NOT_FOUND);

       }
    }



    @Override
    public ResponseEntity<?> salvarProcesso(Process process) {
        service.saveProcess(process);
        return new ResponseEntity<Process>(HttpStatus.CREATED);
    }

    @Override
    public ResponseEntity<?> atualizarProcesso(String id, Process process) {
        return new ResponseEntity<>(service.updateProcess(id, process),HttpStatus.OK);
    }

    @Override
    public ResponseEntity<?> deletarProcesso(String id) {
        try {
            service.deleteProcessById(id);
            return new ResponseEntity<>(HttpStatus.OK);
        }catch (DataIntegrityViolationException e){
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
