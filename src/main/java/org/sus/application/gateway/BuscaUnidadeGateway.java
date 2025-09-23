package org.sus.application.gateway;

import org.sus.domain.unidade.model.Unidade;

import java.util.Optional;

public interface BuscaUnidadeGateway {
    Optional<Unidade> buscaUnidadeGateway(Long id);
}
