DROP TABLE IF EXISTS alumnos;

DROP TABLE IF EXISTS grupos;

DROP TABLE IF EXISTS profesores;

DROP TABLE IF EXISTS niveles;


CREATE TABLE niveles
(
Cod INTEGER PRIMARY KEY,
Nombre TEXT NOT NULL,
Titulacion_oficial TEXT DEFAULT 'N',
Homologado_oposicion TEXT NULL CHECK (Titulacion_oficial IN ('S','N')) -- por defecto la columna es NULL
);

CREATE TABLE profesores
(
id INTEGER PRIMARY KEY,
DNI TEXT NOT NULL UNIQUE,
nombre TEXT NOT NULL
);

CREATE TABLE grupos
(
id INTEGER PRIMARY KEY,
nombre TEXT NOT NULL,
cod_niveles INTEGER NOT NULL REFERENCES NIVELES (cod),
id_profe INTEGER NOT NULL REFERENCES PROFESORES (id)
);

CREATE TABLE alumnos (
    id INTEGER PRIMARY KEY, -- AUTOINCREMENT No es necesario es automatico
    DNI TEXT UNIQUE,
    nombre TEXT NOT NULL,
    apellido TEXT NOT NULL,
    id_grupo INTEGER NOT NULL REFERENCES grupos(id)
);

--- Ver la estructura de la tabla
PRAGMA table_info(niveles);
PRAGMA table_info(profesores);
PRAGMA table_info(grupos);
PRAGMA table_info(alumnos);

