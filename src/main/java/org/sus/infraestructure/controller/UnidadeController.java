package org.sus.infraestructure.controller;

import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.core.Response;
import org.sus.domain.unidade.model.UnidadeInfo;
import org.sus.infraestructure.dto.response.BaseResponse;
import org.sus.usecases.VerificaUnidadeUseCase;

@Path("/unidade")
public class UnidadeController {

    @Inject
    private VerificaUnidadeUseCase useCase;

    @GET
    @Path("/{id}")
    public BaseResponse<UnidadeInfo> verificaUnidadeDisponivel(@PathParam("id") Long id) {
        return BaseResponse.<UnidadeInfo>builder()
                .success(true)
                .message("Informações da unidade retornadas com sucesso")
                .result(useCase.verificaUnidade(id))
                .build();
    }
}
