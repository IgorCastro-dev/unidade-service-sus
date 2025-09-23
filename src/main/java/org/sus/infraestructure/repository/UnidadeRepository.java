package org.sus.infraestructure.repository;

import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;
import org.sus.infraestructure.entity.UnidadeEntity;

import java.util.Optional;

@ApplicationScoped
public class UnidadeRepository implements PanacheRepository<UnidadeEntity> {

}
