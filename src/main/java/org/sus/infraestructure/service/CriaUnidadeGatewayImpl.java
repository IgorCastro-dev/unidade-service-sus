package org.sus.infraestructure.service;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import org.sus.application.gateway.CriaUnidadeGateway;
import org.sus.domain.unidade.model.Unidade;
import org.sus.infraestructure.mapper.UnidadeMapper;
import org.sus.infraestructure.repository.UnidadeRepository;

@ApplicationScoped
public class CriaUnidadeGatewayImpl implements CriaUnidadeGateway {
    @Inject
    private UnidadeRepository repository;

    @Inject
    private UnidadeMapper mapper;

    @Override
    @Transactional
    public void execute(Unidade unidade) {
        repository.persist(mapper.toUnidadeEntity(unidade));
    }
}
