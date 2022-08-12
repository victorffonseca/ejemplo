package com.prueba.PruebaTecnica.controller;

import com.prueba.PruebaTecnica.entity.ColegioEntity;
import com.prueba.PruebaTecnica.service.ColegioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/colegios")
public class ColegioController {

    @Autowired private ColegioService colegioService;

    @GetMapping(value = "/colegio/{id}")
    //@RequestMapping(value = "/colegio/{id}", method = RequestMethod.GET)
    public ColegioEntity obtenerColegioPorId(@PathVariable("id") Long id) {
        return colegioService.obtenerColegioPorId(id);
    }
}
