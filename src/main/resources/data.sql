-- Se limpia la bd para evitar conflictos en creación e inserción a las tablas
drop all objects;

-- Creación de la tabla colegio
create table colegio (
    id bigint primary key,
    nombre varchar(100) not null
);

-- Creación de la tabla curso
create table curso (
    id bigint primary key,
    grado smallint not null,
    salon varchar(10) not null,
    id_colegio bigint not null
);

-- Asociación de la llave foránea de colegio en la tabla curso
alter table curso add foreign key (id_colegio) references colegio(id);

-- Inserciones para la tabla colegio
insert into colegio (id, nombre) values (1, 'El colegio del Olimpo');

-- Inserciones para la tabla curso
insert into curso (id, grado, salon, id_colegio)
values (1, 10, 'A', 1), (2, 10, 'B', 1), (3, 11, 'A', 1), (4, 11, 'B', 1);