package org.sus.infraestructure.service;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import org.sus.application.gateway.ListaTodasUnidadesGateway;
import org.sus.domain.unidade.model.Unidade;
import org.sus.infraestructure.mapper.UnidadeMapper;
import org.sus.infraestructure.repository.UnidadeRepository;

import java.util.List;
import java.util.Optional;

@ApplicationScoped
public class ListaTodasUnidadesGatewayImpl implements ListaTodasUnidadesGateway {
    @Inject
    private UnidadeRepository repository;

    @Inject
    private UnidadeMapper mapper;

    @Override
    public List<Unidade> execute() {
        return repository.findAll().stream().map(mapper :: toUnidade).toList();
    }
}
