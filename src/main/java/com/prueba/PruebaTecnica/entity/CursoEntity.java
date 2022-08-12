package com.prueba.PruebaTecnica.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "curso")
@Getter
@Setter
@EqualsAndHashCode
@ToString
public class CursoEntity implements Serializable {

    @Id
    private Long id;

    @Column
    private Integer grado;

    @Column
    private String salon;

    @ManyToOne
    @JoinColumn(name = "id_colegio")
    @JsonIgnoreProperties("cursos")
    private ColegioEntity colegioEntity;
}
