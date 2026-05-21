package com.fiap.ec.sprint1_mobile.model;
import jakarta.persistence.*;

@Entity
@Table(name = "equipamentos")

public class Equipamento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;
    @Column(nullable = false)

    private String nome;
    @Column(nullable = false)

    public Equipamento() {
    }

    public Equipamento(String nome, String descricao) {
        this.nome = nome;
    }

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}