package org.sus.infraestructure.mapper;

import jakarta.enterprise.context.ApplicationScoped;
import org.sus.domain.unidade.model.Unidade;
import org.sus.infraestructure.entity.UnidadeEntity;

@ApplicationScoped
public class UnidadeMapper {

    public UnidadeEntity toUnidadeEntity(Unidade unidade){
        return new UnidadeEntity(
                unidade.getId(),
                unidade.getNome(),
                unidade.getEndereco(),
                unidade.getCapacidade(),
                unidade.getAtivo()
        );
    }

    public Unidade toUnidade(UnidadeEntity unidadeEntity){
        return new Unidade(
                unidadeEntity.getId(),
                unidadeEntity.getNome(),
                unidadeEntity.getEndereco(),
                unidadeEntity.getCapacidade(),
                unidadeEntity.getAtivo()
        );
    }

}
