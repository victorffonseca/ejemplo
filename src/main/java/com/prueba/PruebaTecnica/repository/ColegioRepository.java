package com.prueba.PruebaTecnica.repository;

import com.prueba.PruebaTecnica.entity.ColegioEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ColegioRepository extends JpaRepository<ColegioEntity, Long> {

    @Query("SELECT c FROM ColegioEntity c WHERE c.nombre = :nombreParam")
    ColegioEntity buscarPorNombre(@Param("nombreParam") String nombreColegio);
}
