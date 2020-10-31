package com.docker.process.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

public interface EntityController {

    @GetMapping("/listar")
    ResponseEntity<?> listarProcessos();

    @PostMapping("/salvar")
    ResponseEntity<?> salvarProcesso(@RequestBody Process process);

    @PutMapping("/atualizar")
    ResponseEntity<?> atualizarProcesso(@Validated String id
            ,@RequestBody Process process);

    @DeleteMapping("/deletar")
    ResponseEntity<?> deletarProcesso(@Validated String id);
}
