package org.sus.usecases;

import org.sus.domain.unidade.model.UnidadeInfo;

public interface VerificaUnidadeUseCase {
    UnidadeInfo execute(Long id);
}
