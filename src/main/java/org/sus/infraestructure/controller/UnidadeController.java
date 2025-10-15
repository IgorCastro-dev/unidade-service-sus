package org.sus.infraestructure.controller;

import jakarta.inject.Inject;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.Response;
import org.sus.domain.unidade.model.Unidade;
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
