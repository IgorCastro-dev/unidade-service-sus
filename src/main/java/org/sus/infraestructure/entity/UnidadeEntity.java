package org.sus.infraestructure.entity;


import jakarta.persistence.*;

import java.io.Serial;
import java.io.Serializable;
import java.time.Duration;
import java.time.LocalTime;


@Entity
@Table(name = "unidade")
public class UnidadeEntity implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    @Id
    @SequenceGenerator(name = "unidade_gen",sequenceName = "unidade_seq",allocationSize=1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "unidade_gen")
    private Long id;
    private String nome;
    private String endereco;
    private Boolean ativo;
    @Column(name = "horario_abertura")
    private LocalTime horaAbre;
    @Column(name = "horario_fechamento")
    private LocalTime horaFecha;
    private Duration duracao;

    public UnidadeEntity() {
    }

    public UnidadeEntity(Long id, String nome, String endereco, Boolean ativo,
                         LocalTime horaAbre, LocalTime horaFecha, Duration duracao) {
        this.id = id;
        this.nome = nome;
        this.endereco = endereco;
        this.ativo = ativo;
        this.horaAbre = horaAbre;
        this.horaFecha = horaFecha;
        this.duracao = duracao;
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public String getEndereco() { return endereco; }
    public void setEndereco(String endereco) { this.endereco = endereco; }

    public Boolean getAtivo() { return ativo; }
    public void setAtivo(Boolean ativo) { this.ativo = ativo; }

    public LocalTime getHoraAbre() { return horaAbre; }
    public void setHoraAbre(LocalTime horaAbre) { this.horaAbre = horaAbre; }

    public LocalTime getHoraFecha() { return horaFecha; }
    public void setHoraFecha(LocalTime horaFecha) { this.horaFecha = horaFecha; }

    public Duration getDuracao() { return duracao; }
    public void setDuracao(Duration duracao) { this.duracao = duracao; }
}
