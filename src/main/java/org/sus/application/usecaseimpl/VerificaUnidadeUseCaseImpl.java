package org.sus.application.usecaseimpl;

import org.sus.application.gateway.BuscaUnidadeGateway;
import org.sus.domain.unidade.exception.UnidadeNaoEncontradaException;
import org.sus.domain.unidade.model.Unidade;
import org.sus.domain.unidade.model.UnidadeInfo;
import org.sus.usecases.VerificaUnidadeUseCase;



public class VerificaUnidadeUseCaseImpl implements VerificaUnidadeUseCase {
    public BuscaUnidadeGateway gateway;

    public VerificaUnidadeUseCaseImpl(BuscaUnidadeGateway buscaUnidadeGateway){
        this.gateway = buscaUnidadeGateway;
    }
    @Override
    public UnidadeInfo execute(Long id) {
        Unidade unidade = gateway.buscaUnidadeGateway(id).orElseThrow(() ->
                new UnidadeNaoEncontradaException("Unidade Nao Encontrada")
                );
        return UnidadeInfo.criaUnidadeInfo(unidade.getNome(), unidade.getAtivo(), unidade.getHoraAbre(), unidade.getHoraFecha(), unidade.getDuracao());
    }
}
