package org.sus.application.usecaseimpl;

import org.sus.application.gateway.ListaTodasUnidadesGateway;
import org.sus.domain.unidade.model.Unidade;
import org.sus.usecases.CriaUnidadeUseCase;
import org.sus.usecases.ListaTodasAsUnidadesUseCase;

import java.util.List;

public class ListaTodasAsUnidadesUseCaseImpl implements ListaTodasAsUnidadesUseCase {

    ListaTodasUnidadesGateway listaTodasUnidadesGateway;

    public ListaTodasAsUnidadesUseCaseImpl(ListaTodasUnidadesGateway listaTodasUnidadesGateway) {
        this.listaTodasUnidadesGateway = listaTodasUnidadesGateway;
    }

    @Override
    public List<Unidade> execute() {
        return listaTodasUnidadesGateway.execute();
    }
}
