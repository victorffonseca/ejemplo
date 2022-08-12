package com.prueba.PruebaTecnica.entity;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "colegio")
@Getter
@Setter
@EqualsAndHashCode
@ToString
public class ColegioEntity implements Serializable {

    @Id
    private Long id;

    @Column
    private String nombre;

    @OneToMany(mappedBy = "colegioEntity", fetch = FetchType.LAZY)
    private List<CursoEntity> cursos;
}
