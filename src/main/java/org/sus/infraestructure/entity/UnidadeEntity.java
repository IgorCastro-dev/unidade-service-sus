package org.sus.infraestructure.entity;


import jakarta.persistence.*;
import lombok.*;

import java.io.Serial;
import java.io.Serializable;
import java.time.Duration;
import java.time.LocalTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
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
}
