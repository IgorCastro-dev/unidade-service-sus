package org.sus.infraestructure.service;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import org.sus.application.gateway.BuscaUnidadeGateway;
import org.sus.domain.unidade.model.Unidade;
import org.sus.infraestructure.mapper.UnidadeMapper;
import org.sus.infraestructure.repository.UnidadeRepository;

import java.util.Optional;
@ApplicationScoped
public class BuscaUnidadeGatewayImpl implements BuscaUnidadeGateway {

    @Inject
    private UnidadeRepository repository;

    @Inject
    private UnidadeMapper mapper;

    @Override
    public Optional<Unidade> buscaUnidadeGateway(Long id) {
        return repository.findByIdOptional(id).map(mapper::toUnidade);
    }
}
