INSERT INTO niveles (cod, nombre, titulacion_oficial, homologado_oposicion)
VALUES (1, 'Primaria', 'S', 'S');
INSERT INTO niveles (cod, nombre, homologado_oposicion)
VALUES  (2, 'Secundaria', 'N');
INSERT INTO niveles 
VALUES (3, 'Bachillerato', 'S', 'S');

desc niveles;

select *
from NIVELES;


-- Profesores
INSERT INTO profesores (id,DNI, nombre)
VALUES (1,'12345678A', 'Paula Herrera');
INSERT INTO profesores 
VALUES (2, '87654321B', 'Luis Gómez');
INSERT INTO profesores (id,DNI, nombre)
VALUES (3,'99999999C', 'Marta Ruiz');

select *
from PROFESORES;

desc profesores;

-- Grupos
INSERT INTO grupos (id,nombre, cod_niveles, id_profe)
VALUES (1,'Grupo A', 1, 1);
INSERT INTO grupos (id,nombre, cod_niveles, id_profe)
VALUES (2,'Grupo B', 2, 2);
INSERT INTO grupos 
VALUES (3, 'Grupo C', 2, 2);

desc grupos;

select *
from grupos;


-- Alumnos
INSERT INTO alumnos (id,DNI, nombre, apellido, id_grupo)
VALUES (1,'11111111X', 'Carlos', 'Sánchez', 1);

INSERT INTO alumnos (id,DNI, nombre, apellido, id_grupo)
VALUES (2,'22222222Y', 'Erika', 'López', 2);

INSERT INTO alumnos (id,dni,nombre, apellido, id_grupo)
VALUES (3,'33333333Y','Javier', 'Martínez', 3);


desc alumnos;

select *
from ALUMNOS;