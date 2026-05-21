package com.fiap.ec.sprint1_mobile.service;

import com.fiap.ec.sprint1_mobile.model.Equipamento;
import com.fiap.ec.sprint1_mobile.repository.EquipamentoRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;
import java.util.List;

@Service
public class EquipamentoService {

    private final EquipamentoRepository repository;

    public EquipamentoService(EquipamentoRepository repository) {
        this.repository = repository;
    }

    public Equipamento criar(Equipamento equipamento) {
        return repository.save(equipamento);
    }

    public List<Equipamento> listar() {
        return repository.findAll();
    }

    public Equipamento obterPorId(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Equipamento não encontrado"));
    }

    public Equipamento atualizar(Long id, Equipamento equipamentoAtualizado) {
        Equipamento equipamentoExistente = obterPorId(id);

        equipamentoExistente.setNome(equipamentoAtualizado.getNome());

        return repository.save(equipamentoExistente);
    }

    public void deletar(Long id) {
        Equipamento equipamentoExistente = obterPorId(id);
        repository.delete(equipamentoExistente);
    }
}