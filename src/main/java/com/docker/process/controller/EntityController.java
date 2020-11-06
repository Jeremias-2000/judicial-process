package com.docker.process.controller;

import com.docker.process.document.Process;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

public interface EntityController {

    @GetMapping("/listar")
    ResponseEntity<?> listarProcessos();

    @GetMapping("/pesquisar/id/{id}")
    ResponseEntity<?> pesquisarId(@PathVariable("id") String id);


    @PostMapping("/salvar")
    ResponseEntity<?> salvarProcesso(@RequestBody Process process);

    @PutMapping("/atualizar/{id}")
    ResponseEntity<?> atualizarProcesso( @PathVariable("id") String id
            ,@Validated @RequestBody Process process);

    @DeleteMapping("/deletar/id/{id}")
    ResponseEntity<?> deletarProcesso(@Validated @PathVariable("id") String id);
}
