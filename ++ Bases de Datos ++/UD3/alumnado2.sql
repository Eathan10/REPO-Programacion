drop table alumnos;


ALTER TABLE alumnos
ADD(
    sexo VARCHAR2(1) NOT NULL CHECK(sexo IN ('M','F')),
    importe NUMBER(10,2) DEFAULT 0
);



ALTER TABLE alumnos
DROP (
    edad
);

ALTER TABLE alumnos
ADD(
    fecha_alta DATE,
    fecha_nac DATE,
    CONSTRAINT alum_fecha_nac_ck CHECK (fecha_nac < fecha_alta)
);


ALTER TABLE alumnos
RENAME COLUMN importe to tasas;


ALTER TABLE alumnado DROP COLUMN fecha_nac CASCADE CONSTRAINT;

RENAME alumnos to alumnado;


desc alumnado;