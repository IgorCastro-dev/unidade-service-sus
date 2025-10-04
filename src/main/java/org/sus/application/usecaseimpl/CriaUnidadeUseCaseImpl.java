package org.sus.application.usecaseimpl;

import org.sus.application.gateway.CriaUnidadeGateway;
import org.sus.domain.unidade.model.Unidade;
import org.sus.usecases.CriaUnidadeUseCase;

public class CriaUnidadeUseCaseImpl implements CriaUnidadeUseCase {

    CriaUnidadeGateway criaUnidadeGateway;

    public CriaUnidadeUseCaseImpl(CriaUnidadeGateway criaUnidadeGateway) {
        this.criaUnidadeGateway = criaUnidadeGateway;
    }

    @Override
    public String execute(Unidade unidade) {
        criaUnidadeGateway.execute(unidade);
        return "Unidade Criada com sucesso!";
    }
}
