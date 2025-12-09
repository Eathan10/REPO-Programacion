DROP TABLE IF EXISTS alumnos;
DROP TABLE IF EXISTS grupos;
DROP TABLE IF EXISTS profesores;
DROP TABLE IF EXISTS niveles;

CREATE TABLE niveles (
    cod INTEGER PRIMARY KEY,
    nombre TEXT NOT NULL,
    titulacion_oficial TEXT DEFAULT 'N',
    homologado_oposicion TEXT,
    CONSTRAINT niv_titu_ofic_ck CHECK (titulacion_oficial IN ('S', 'N'))
);

CREATE TABLE profesores (
    id INTEGER PRIMARY KEY,
    DNI TEXT NOT NULL UNIQUE,
    nombre TEXT NOT NULL 
);

CREATE TABLE grupos (
    id INTEGER PRIMARY KEY,
    nombre TEXT NOT NULL,
    cod_nivel INTEGER,
    id_profesor INTEGER,
    CONSTRAINT grup_cod_nivel_fk FOREIGN KEY (cod_nivel) REFERENCES niveles(cod),
    CONSTRAINT grup_id_prof_fk FOREIGN KEY (id_profesor) REFERENCES profesores(id)
);

CREATE TABLE alumnos (
    id INTEGER PRIMARY KEY,
    DNI TEXT,
    nombre TEXT NOT NULL,
    apellido TEXT NOT NULL,
    id_grupo INTEGER,
    CONSTRAINT alum_grup_fk FOREIGN KEY(id_grupo) REFERENCES grupos(id)
);
