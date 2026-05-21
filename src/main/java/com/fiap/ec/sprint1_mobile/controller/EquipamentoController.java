package com.fiap.ec.sprint1_mobile.controller;

import com.fiap.ec.sprint1_mobile.model.Equipamento;
import com.fiap.ec.sprint1_mobile.service.EquipamentoService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/equipamentos")
@CrossOrigin

public class EquipamentoController {
    private final EquipamentoService service;

    public EquipamentoController(EquipamentoService service) {
        this.service = service;
    }

    @PostMapping
    public Equipamento criar(@RequestBody Equipamento equipamento) {
        return service.criar(equipamento);
    }

    @GetMapping
    public List<Equipamento> listar() {
        return service.listar();
    }

    @GetMapping("/{id}")
    public Equipamento obterPorId(@PathVariable Long id) {
        return service.obterPorId(id);
    }

    @PutMapping("/{id}")
    public Equipamento atualizar(@PathVariable Long id, @RequestBody Equipamento equipamento) {
        return service.atualizar(id, equipamento);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletar(@PathVariable Long id) {
        service.deletar(id);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }
}

