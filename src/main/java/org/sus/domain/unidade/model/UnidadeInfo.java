package org.sus.domain.unidade.model;

import jakarta.persistence.Column;

import java.time.Duration;
import java.time.LocalTime;
import java.util.Objects;

public class UnidadeInfo {
    private Boolean ativo;
    private LocalTime horaAbre;
    private LocalTime horaFecha;
    private Duration duracao;

    public UnidadeInfo(Boolean ativo, LocalTime horaAbre, LocalTime horaFecha, Duration duracao) {
        this.ativo = ativo;
        this.horaAbre = horaAbre;
        this.horaFecha = horaFecha;
        this.duracao = duracao;
    }

    public static UnidadeInfo criaUnidadeInfo(Boolean ativo, LocalTime horaAbre, LocalTime horaFecha, Duration duracao){
        return new UnidadeInfo(ativo, horaAbre, horaFecha, duracao);
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
        UnidadeInfo that = (UnidadeInfo) o;
        return Objects.equals(ativo, that.ativo) && Objects.equals(horaAbre, that.horaAbre) && Objects.equals(horaFecha, that.horaFecha) && Objects.equals(duracao, that.duracao);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ativo, horaAbre, horaFecha, duracao);
    }
}
