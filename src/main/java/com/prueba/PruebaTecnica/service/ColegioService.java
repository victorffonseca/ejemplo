package com.prueba.PruebaTecnica.service;

import com.prueba.PruebaTecnica.entity.ColegioEntity;
import com.prueba.PruebaTecnica.repository.ColegioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ColegioService {

    @Autowired private ColegioRepository colegioRepository;

    public ColegioEntity obtenerColegioPorId(Long id) {
        return colegioRepository.findById(id).orElse(null);
    }

    public ColegioEntity obtenerPorNombre(String nombreColegio) {
        return colegioRepository.buscarPorNombre(nombreColegio);
    }
}
