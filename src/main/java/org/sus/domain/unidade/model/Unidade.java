package org.sus.domain.unidade.model;

import java.util.Objects;

public class Unidade {
    private Long id;
    private String nome;
    private String endereco;
    private Integer capacidade;
    private Boolean ativo;

    public Unidade(Long id, String nome, String endereco, Integer capacidade, Boolean ativo) {
        this.id = id;
        this.nome = nome;
        this.endereco = endereco;
        this.capacidade = capacidade;
        this.ativo = ativo;
    }

    public Unidade(String nome, String endereco, Integer capacidade, Boolean ativo) {
        this.nome = nome;
        this.endereco = endereco;
        this.capacidade = capacidade;
        this.ativo = ativo;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (!(object instanceof Unidade unidade)) return false;
        return Objects.equals(getId(), unidade.getId()) && Objects.equals(getNome(), unidade.getNome()) && Objects.equals(getEndereco(), unidade.getEndereco()) && Objects.equals(getCapacidade(), unidade.getCapacidade()) && Objects.equals(getAtivo(), unidade.getAtivo());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getNome(), getEndereco(), getCapacidade(), getAtivo());
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public Integer getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(Integer capacidade) {
        this.capacidade = capacidade;
    }

    public Boolean getAtivo() {
        return ativo;
    }

    public void setAtivo(Boolean ativo) {
        this.ativo = ativo;
    }
}
