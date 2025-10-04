package org.sus.infraestructure.entity;


import jakarta.persistence.*;
import lombok.*;

import java.io.Serial;
import java.io.Serializable;

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
    private Integer capacidade;
    private Boolean ativo;
}
