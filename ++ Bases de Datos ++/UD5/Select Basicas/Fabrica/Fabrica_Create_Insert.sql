-- Borrar las tablas en orden usando CASCADE CONSTRAINTS
DROP TABLE VehiculosMaquinasPiezas CASCADE CONSTRAINTS;
DROP TABLE EmpleadosMaquinas CASCADE CONSTRAINTS;
DROP TABLE Vehiculos CASCADE CONSTRAINTS;
DROP TABLE Piezas CASCADE CONSTRAINTS;
DROP TABLE Maquinas CASCADE CONSTRAINTS;
DROP TABLE Lineas CASCADE CONSTRAINTS;
DROP TABLE Fabricas CASCADE CONSTRAINTS;
DROP TABLE Empleados CASCADE CONSTRAINTS;
DROP TABLE Empresas CASCADE CONSTRAINTS;
DROP TABLE Clientes CASCADE CONSTRAINTS;



-- *******
-- Crearlas tablas

CREATE TABLE Empleados (
	id number(10) GENERATED ALWAYS AS IDENTITY ,
	tipo_contrato varchar2(255) NOT NULL,
	nombre varchar2(255) NOT NULL,
	apellidos varchar2(255) NOT NULL,
	edad number(2) NOT NULL,
	id_empresa number(10) NOT NULL,
	CONSTRAINT empleado_pk PRIMARY KEY (id)
);

CREATE TABLE Empresas (
	id number(10) GENERATED ALWAYS AS IDENTITY ,
	nombre varchar2(255) NOT NULL,
	CONSTRAINT empresa_pk PRIMARY KEY (id)
);

CREATE TABLE Fabricas (
	id number(10) GENERATED ALWAYS AS IDENTITY ,
	nombre varchar2(255) NOT NULL,
	ciudad varchar2(255) NOT NULL,
	id_empresa number(10) NOT NULL,
	CONSTRAINT fab_pk PRIMARY KEY (id)
);

CREATE TABLE Lineas (
	id number(10) GENERATED ALWAYS AS IDENTITY ,
	nombre varchar2(255) NOT NULL,
	id_fabrica number(10) NOT NULL,
	CONSTRAINT lin_pk PRIMARY KEY (id)
);

CREATE TABLE EmpleadosMaquinas (
	id number(10) GENERATED ALWAYS AS IDENTITY ,
	id_empleado number(10) NOT NULL,
	id_maquina number(10) NOT NULL,
	fecha DATE NOT NULL,
	turno varchar2(255) NOT NULL,
	CONSTRAINT emple_maq_pk PRIMARY KEY (id)
);

CREATE TABLE Maquinas (
	id number(10) GENERATED ALWAYS AS IDENTITY ,
	marca varchar2(255) NOT NULL,
	modelo varchar2(255) NOT NULL,
	id_linea number(10) NOT NULL,
	CONSTRAINT maq_pk PRIMARY KEY (id)
);

CREATE TABLE Piezas (
	id number(10) GENERATED ALWAYS AS IDENTITY ,
	referencia varchar2(255) NOT NULL,
	matricula varchar2(255) NOT NULL,
	CONSTRAINT pieza_pk PRIMARY KEY (id)
);

CREATE TABLE Vehiculos (
	matricula varchar2(255) NOT NULL,
	modelo varchar2(255) NOT NULL,
	dni varchar2(255) NOT NULL,
	CONSTRAINT car_pk PRIMARY KEY (matricula)
);

CREATE TABLE VehiculosMaquinasPiezas (
	id number(10) GENERATED ALWAYS AS IDENTITY ,
	matricula varchar2(255) NOT NULL,
	id_maquina number(10) NOT NULL,
	id_piezas number(10) NOT NULL,
	CONSTRAINT car_maq_pieza_pk PRIMARY KEY (id)
);

CREATE TABLE Clientes (
	dni varchar2(255) NOT NULL,
	nombre varchar2(255) NOT NULL,
	apellidos varchar2(255) NOT NULL,
	CONSTRAINT clte_pk PRIMARY KEY (dni)
);

ALTER TABLE Empleados ADD CONSTRAINT emple_empresa_fk FOREIGN KEY (id_empresa) REFERENCES Empresas(id);

ALTER TABLE Fabricas ADD CONSTRAINT fab_empresa_fk FOREIGN KEY (id_empresa) REFERENCES Empresas(id);

ALTER TABLE Lineas ADD CONSTRAINT lin_fab_fk FOREIGN KEY (id_fabrica) REFERENCES Fabricas(id);

ALTER TABLE EmpleadosMaquinas ADD CONSTRAINT EmpleMaq_Emple_fk FOREIGN KEY (id_empleado) REFERENCES Empleados(id);

ALTER TABLE EmpleadosMaquinas ADD CONSTRAINT EmpleMaq_Maq_fk FOREIGN KEY (id_maquina) REFERENCES Maquinas(id);

ALTER TABLE Maquinas ADD CONSTRAINT Maq_Lin_fk FOREIGN KEY (id_linea) REFERENCES Lineas(id);

ALTER TABLE Piezas ADD CONSTRAINT Piezas_Car_fk FOREIGN KEY (matricula) REFERENCES Vehiculos(matricula);

ALTER TABLE Vehiculos ADD CONSTRAINT Car_Cli_fk FOREIGN KEY (dni) REFERENCES Clientes(dni);

ALTER TABLE VehiculosMaquinasPiezas ADD CONSTRAINT CarMaqPiezas_Car_fk FOREIGN KEY (matricula) REFERENCES Vehiculos(matricula);

ALTER TABLE VehiculosMaquinasPiezas ADD CONSTRAINT CarMaqPiezas_Maq_fk FOREIGN KEY (id_maquina) REFERENCES Maquinas(id);

ALTER TABLE VehiculosMaquinasPiezas ADD CONSTRAINT CarMaqPiezas_Piezas_fk FOREIGN KEY (id_piezas) REFERENCES Piezas(id);


--************
-- Insertar registros en las tablas
-- INSERTs para la tabla Clientes
INSERT INTO Clientes (dni, nombre, apellidos) 
VALUES ('0001A', 'Eneko', 'Fernández');

INSERT INTO Clientes (dni, nombre, apellidos) 
VALUES ('0002B', 'Laura', 'Gómez');

INSERT INTO Clientes (dni, nombre, apellidos) 
VALUES ('0003C', 'Pedro', 'López');

INSERT INTO Clientes (dni, nombre, apellidos) 
VALUES ('0004D', 'Carmen', 'Martínez');

INSERT INTO Clientes (dni, nombre, apellidos) 
VALUES ('0005E', 'Sofía', 'Torres');

-- INSERTs para la tabla Empresas
INSERT INTO Empresas (nombre) VALUES ('Empresa Alpha');
INSERT INTO Empresas (nombre) VALUES ('Empresa Beta');
INSERT INTO Empresas (nombre) VALUES ('Empresa Gamma');


-- INSERTs para la tabla Empleados
INSERT INTO Empleados (tipo_contrato, nombre, apellidos, edad, id_empresa) 
VALUES ('indefinido', 'Marta', 'Pérez', 45, 1);

INSERT INTO Empleados (tipo_contrato, nombre, apellidos, edad, id_empresa) 
VALUES ('temporal', 'ana', 'García', 32, 1);

INSERT INTO Empleados (tipo_contrato, nombre, apellidos, edad, id_empresa) 
VALUES ('indefinido', 'Andres', 'González', 41, 2);

INSERT INTO Empleados (tipo_contrato, nombre, apellidos, edad, id_empresa) 
VALUES ('temporal', 'Koldo', 'Rodríguez', 29, 2);

INSERT INTO Empleados (tipo_contrato, nombre, apellidos, edad, id_empresa) 
VALUES ('indefinido', 'Ángela', 'Martínez', 50, 3);



-- INSERTs para la tabla Fabricas
INSERT INTO Fabricas (nombre, ciudad, id_empresa) 
VALUES ('Fábrica Automática', 'Vitoria', 1);

INSERT INTO Fabricas (nombre, ciudad, id_empresa) 
VALUES ('Fábrica de Motores', 'Sevilla', 2);

INSERT INTO Fabricas (nombre, ciudad, id_empresa) 
VALUES ('Fábrica Mecánica', 'Barcelona', 3);

-- INSERTs para la tabla Lineas
INSERT INTO Lineas (nombre, id_fabrica) 
VALUES ('Línea Automática 1', 1);

INSERT INTO Lineas (nombre, id_fabrica) 
VALUES ('Línea de Ensamblaje 2', 2);

INSERT INTO Lineas (nombre, id_fabrica) 
VALUES ('Línea de Control X', 3);

-- INSERTs para la tabla Maquinas
INSERT INTO Maquinas (marca, modelo, id_linea) 
VALUES ('Siemens', 'X100', 1);

INSERT INTO Maquinas (marca, modelo, id_linea) 
VALUES ('Bosch', 'Y200', 2);

INSERT INTO Maquinas (marca, modelo, id_linea) 
VALUES ('Siemens', 'Z300', 3);

INSERT INTO Maquinas (marca, modelo, id_linea) 
VALUES ('Hitachi', 'A400', 1);

INSERT INTO Maquinas (marca, modelo, id_linea) 
VALUES ('Bosch', 'X500', 2);

-- INSERTs para la tabla EmpleadosMaquinass
INSERT INTO EmpleadosMaquinas (id_empleado, id_maquina, fecha, turno) 
VALUES (1, 5, TO_DATE('2023-03-01', 'YYYY-MM-DD'), 'mañana');

INSERT INTO EmpleadosMaquinas (id_empleado, id_maquina, fecha, turno) 
VALUES (2, 3, TO_DATE('2022-12-15', 'YYYY-MM-DD'), 'tarde');

INSERT INTO EmpleadosMaquinas (id_empleado, id_maquina, fecha, turno) 
VALUES (3, 2, TO_DATE('2023-01-10', 'YYYY-MM-DD'), 'noche');

INSERT INTO EmpleadosMaquinas (id_empleado, id_maquina, fecha, turno) 
VALUES (4, 1, TO_DATE('2023-06-20', 'YYYY-MM-DD'), 'mañana');

INSERT INTO EmpleadosMaquinas (id_empleado, id_maquina, fecha, turno) 
VALUES (5, 5, TO_DATE('2023-02-10', 'YYYY-MM-DD'), 'tarde');

-- INSERTs para la tabla Vehiculos
INSERT INTO Vehiculos (matricula, modelo, dni) 
VALUES ('1234ABC', 'Modelo A', '0001A');

INSERT INTO Vehiculos (matricula, modelo, dni) 
VALUES ('5678DEF', 'Modelo B', '0002B');

INSERT INTO Vehiculos (matricula, modelo, dni) 
VALUES ('9101GHI', 'Modelo C', '0003C');

INSERT INTO Vehiculos (matricula, modelo, dni) 
VALUES ('1213JKL', 'Modelo D', '0004D');

INSERT INTO Vehiculos (matricula, modelo, dni) 
VALUES ('1415MNO', 'Modelo E', '0005E');


-- INSERTs para la tabla Piezas
INSERT INTO Piezas (referencia, matricula) 
VALUES ('Pieza A', '1234ABC');

INSERT INTO Piezas (referencia, matricula) 
VALUES ('Pieza B', '5678DEF');

INSERT INTO Piezas (referencia, matricula) 
VALUES ('Pieza C', '9101GHI');

INSERT INTO Piezas (referencia, matricula) 
VALUES ('Pieza D', '1213JKL');

INSERT INTO Piezas (referencia, matricula) 
VALUES ('Pieza E', '1415MNO');



-- INSERTs para la tabla VehiculosMaquinasPiezas
INSERT INTO VehiculosMaquinasPiezas (matricula, id_maquina, id_piezas) 
VALUES ('1234ABC', 1, 1);

INSERT INTO VehiculosMaquinasPiezas (matricula, id_maquina, id_piezas) 
VALUES ('5678DEF', 2, 2);

INSERT INTO VehiculosMaquinasPiezas (matricula, id_maquina, id_piezas) 
VALUES ('9101GHI', 3, 3);

INSERT INTO VehiculosMaquinasPiezas (matricula, id_maquina, id_piezas) 
VALUES ('1213JKL', 4, 4);

INSERT INTO VehiculosMaquinasPiezas (matricula, id_maquina, id_piezas) 
VALUES ('1415MNO', 5, 5);

COMMIT;
