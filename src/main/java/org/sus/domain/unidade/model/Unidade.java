package org.sus.domain.unidade.model;

import java.time.Duration;
import java.time.LocalTime;
import java.util.Objects;

public class Unidade {
    private Long id;
    private String nome;
    private String endereco;
    private Boolean ativo;
    private LocalTime horaAbre;
    private LocalTime horaFecha;
    private Duration duracao;

    public Unidade(Long id, String nome, String endereco, Boolean ativo, LocalTime horaAbre, LocalTime horaFecha, Duration duracao) {
        this.id = id;
        this.nome = nome;
        this.endereco = endereco;
        this.ativo = ativo;
        this.horaAbre = horaAbre;
        this.horaFecha = horaFecha;
        this.duracao = duracao;
    }

    public Unidade() {
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

    public Boolean getAtivo() {
        return ativo;
    }

    public void setAtivo(Boolean ativo) {
        this.ativo = ativo;
    }

    public LocalTime getHoraAbre() {
        return horaAbre;
    }

    public void setHoraAbre(LocalTime horaAbre) {
        this.horaAbre = horaAbre;
    }

    public LocalTime getHoraFecha() {
        return horaFecha;
    }

    public void setHoraFecha(LocalTime horaFecha) {
        this.horaFecha = horaFecha;
    }

    public Duration getDuracao() {
        return duracao;
    }

    public void setDuracao(Duration duracao) {
        this.duracao = duracao;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Unidade unidade = (Unidade) o;
        return Objects.equals(id, unidade.id) && Objects.equals(nome, unidade.nome) && Objects.equals(endereco, unidade.endereco) && Objects.equals(ativo, unidade.ativo) && Objects.equals(horaAbre, unidade.horaAbre) && Objects.equals(horaFecha, unidade.horaFecha) && Objects.equals(duracao, unidade.duracao);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nome, endereco, ativo, horaAbre, horaFecha, duracao);
    }
}
