DROP TABLE alumnos;

DROP TABLE grupos CASCADE CONSTRAINT;

DROP TABLE profesores CASCADE CONSTRAINT;

DROP TABLE niveles CASCADE CONSTRAINT;


CREATE TABLE niveles
(
Cod NUMBER(2) CONSTRAINT niv_cod_pk PRIMARY KEY,
Nombre VARCHAR2(20) NOT NULL,
Titulacion_oficial VARCHAR2(1) CONSTRAINT  niv_titulacion_ck CHECK (Titulacion_oficial IN ('S','N')),
Homologado_oposicion VARCHAR2(1) NULL -- por defecto la columna es NULL,
);

CREATE TABLE profesores
(
id NUMBER(2) CONSTRAINT pro_id_pk PRIMARY KEY,
DNI VARCHAR2(9) NOT NULL CONSTRAINT prof_dni_uq UNIQUE,
nombre VARCHAR2(30) NOT NULL
);

CREATE TABLE grupos
(
id NUMBER(2) CONSTRAINT gru_id_pk PRIMARY KEY,
nombre VARCHAR2(30) NOT NULL,
cod_niveles NUMBER(2) NOT NULL REFERENCES NIVELES (cod),
id_profe NUMBER(2) NOT NULL CONSTRAINT  grup_id_profe_fk REFERENCES PROFESORES (id)
);

CREATE TABLE alumnos (
    id NUMBER(2) PRIMARY KEY,
    DNI VARCHAR2(9) UNIQUE,
    nombre VARCHAR2(30) NOT NULL,
    apellido VARCHAR2(30) NOT NULL,
    id_grupo NUMBER(2) NOT NULL CONSTRAINT  alumn_id_grupo_fk REFERENCES grupos(id)
);


drop table alumnos;


ALTER TABLE alumnado
ADD(
    sexo VARCHAR2(1) NOT NULL CHECK(sexo IN ('M','F')),
    importe NUMBER(10,2) DEFAULT 0
);



ALTER TABLE alumnado
DROP (
    edad
);

ALTER TABLE alumnado
ADD(
    fecha_alta DATE,
    fecha_nac DATE,
    CONSTRAINT alum_fecha_nac_ck CHECK (fecha_nac < fecha_alta)
);


ALTER TABLE alumnado
RENAME COLUMN importe to tasas;


ALTER TABLE alumnado DROP COLUMN fecha_nac CASCADE CONSTRAINT;

RENAME alumnos to alumnado;


desc alumnado;

--- Ver la estructura de la tabla
DESC niveles;
DESC profesores;
DESC grupos;
DESC alumnado;