package org.sus.infraestructure.controller;

import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.Response;
import org.sus.application.gateway.CriaUnidadeGateway;
import org.sus.application.gateway.ListaTodasUnidadesGateway;
import org.sus.domain.unidade.model.Unidade;
import org.sus.domain.unidade.model.UnidadeInfo;
import org.sus.infraestructure.dto.response.BaseResponse;
import org.sus.usecases.CriaUnidadeUseCase;
import org.sus.usecases.ListaTodasAsUnidadesUseCase;
import org.sus.usecases.VerificaUnidadeUseCase;

import java.util.List;

@Path("/unidade")
public class UnidadeController {

    private VerificaUnidadeUseCase verificaUnidadeUseCase;
    private CriaUnidadeUseCase criaUnidadeUseCase;
    private ListaTodasAsUnidadesUseCase listaTodasAsUnidadesUseCase;

    @Inject
    public UnidadeController(VerificaUnidadeUseCase verificaUnidadeUseCase, CriaUnidadeUseCase criaUnidadeUseCase, ListaTodasAsUnidadesUseCase listaTodasAsUnidadesUseCase) {
        this.verificaUnidadeUseCase = verificaUnidadeUseCase;
        this.criaUnidadeUseCase = criaUnidadeUseCase;
        this.listaTodasAsUnidadesUseCase = listaTodasAsUnidadesUseCase;
    }

    @GET
    @Path("/{id}")
    public Response verificaUnidadeDisponivel(@PathParam("id") Long id) {
        return Response.ok(verificaUnidadeUseCase.execute(id)).build();
    }

    @GET
    public List<Unidade> listaUnidades() {
        return listaTodasAsUnidadesUseCase.execute();
    }

    @POST
    @Consumes("application/json")
    @Produces("application/json")
    public String criaUnidade(Unidade unidade) {
        return criaUnidadeUseCase.execute(unidade);
    }
}
