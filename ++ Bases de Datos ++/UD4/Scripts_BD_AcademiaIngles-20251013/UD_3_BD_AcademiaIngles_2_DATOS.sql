-- Niveles
INSERT INTO niveles (cod, nombre, titulacion_oficial, homologado_oposicion)
VALUES (1, 'Primaria', 'S', 'Sí');
INSERT INTO niveles (cod, nombre, homologado_oposicion)
VALUES  (2, 'Secundaria', 'No');
INSERT INTO niveles 
VALUES (3, 'Bachillerato', 'S', 'Sí');

-- Profesores
INSERT INTO profesores (DNI, nombre)
VALUES ('12345678A', 'Paula Herrera');
INSERT INTO profesores 
VALUES (NULL, '87654321B', 'Luis Gómez');
INSERT INTO profesores (DNI, nombre)
VALUES ('99999999C', 'Marta Ruiz');

-- Grupos
INSERT INTO grupos (nombre, cod_nivel, id_profesor)
VALUES ('Grupo A', 1, 1);
INSERT INTO grupos (nombre, cod_nivel, id_profesor)
VALUES ('Grupo B', 2, 2);
INSERT INTO grupos 
VALUES (NULL, 'Grupo C', 2, 2);

-- Alumnos
INSERT INTO alumnos (DNI, nombre, apellido, id_grupo)
VALUES ('11111111X', 'Carlos', 'Sánchez', 1),
       ('22222222Y', 'Erika', 'López', 2);

INSERT INTO alumnos (nombre, apellido, id_grupo)
VALUES ('Javier', 'Martínez', 3);


