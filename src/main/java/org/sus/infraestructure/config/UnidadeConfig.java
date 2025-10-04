package org.sus.infraestructure.config;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.ws.rs.Produces;
import org.sus.application.gateway.BuscaUnidadeGateway;
import org.sus.application.gateway.CriaUnidadeGateway;
import org.sus.application.gateway.ListaTodasUnidadesGateway;
import org.sus.application.usecaseimpl.CriaUnidadeUseCaseImpl;
import org.sus.application.usecaseimpl.ListaTodasAsUnidadesUseCaseImpl;
import org.sus.application.usecaseimpl.VerificaUnidadeUseCaseImpl;
import org.sus.domain.unidade.model.UnidadeInfo;
import org.sus.usecases.VerificaUnidadeUseCase;

@ApplicationScoped
public class UnidadeConfig {

    @Produces
    @ApplicationScoped
    public VerificaUnidadeUseCaseImpl verificaUnidadeUseCaseImpl(
            BuscaUnidadeGateway buscaUnidadeGateway
    ){
            return new VerificaUnidadeUseCaseImpl(buscaUnidadeGateway);
    }

    @Produces
    @ApplicationScoped
    public ListaTodasAsUnidadesUseCaseImpl listaTodasAsUnidadesUseCaseImpl(
            ListaTodasUnidadesGateway listaTodasUnidadesGateway
    ){
        return new ListaTodasAsUnidadesUseCaseImpl(listaTodasUnidadesGateway);
    }

    @Produces
    @ApplicationScoped
    public CriaUnidadeUseCaseImpl  criaUnidadeUseCaseImpl(
            CriaUnidadeGateway criaUnidadeGateway
    ){
        return new CriaUnidadeUseCaseImpl(criaUnidadeGateway);
    }
}
