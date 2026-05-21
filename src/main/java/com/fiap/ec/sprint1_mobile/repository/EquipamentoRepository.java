package com.fiap.ec.sprint1_mobile.repository;

import com.fiap.ec.sprint1_mobile.model.Equipamento;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EquipamentoRepository extends JpaRepository<Equipamento, Long> {
}