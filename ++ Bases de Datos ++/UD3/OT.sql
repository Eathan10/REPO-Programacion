DROP TABLE IF EXISTS LogsMantenimientos;
DROP TABLE IF EXISTS  Lecturas;
DROP TABLE IF EXISTS Sensores;
DROP TABLE IF EXISTS Equipamientos;

CREATE TABLE Equipamientos (
    id INTEGER CONSTRAINT eq_id_pk PRIMARY KEY, -- AUTOINCREMENT automatico por ser INTEGER
    nombre TEXT NOT NULL,
    tipo TEXT NOT NULL,
    localizacion TEXT NOT NULL,
    CONSTRAINT eq_tipo_ck CHECK (tipo IN ('Mecánico', 'Eléctrico', 'Otro'))
);

CREATE TABLE Sensores (
    id INTEGER,
    equipment_id INTEGER NOT NULL,
    tipo TEXT NOT NULL,
    modelo TEXT NOT NULL,
    CONSTRAINT sen_id_pk PRIMARY KEY (id),
    CONSTRAINT sen_equipamiento_fk FOREIGN KEY (equipment_id) REFERENCES Equipamientos(id),
    CONSTRAINT sen_tipo_ck CHECK (tipo IN ('Temperatura', 'Presión', 'Humedad'))
);

CREATE TABLE Lecturas (
    id INTEGER,
    sensor_id INTEGER NOT NULL,
    timestamp TEXT NOT NULL,
    valor REAL NOT NULL,
    CONSTRAINT lect_id_pl PRIMARY KEY (id),
    CONSTRAINT lect_sensores_fk FOREIGN KEY (sensor_id) REFERENCES Sensores(id),
    CONSTRAINT lect_valor_ck CHECK (valor >= 0)
);

--HACER UN EJERCICIO PAR AÑADIRLA
CREATE TABLE LogsMantenimientos (
    id INTEGER PRIMARY KEY,
    equipment_id INTEGER NOT NULL,
    date TEXT NOT NULL,
    description TEXT NOT NULL,
    CONSTRAINT logs_equipamientos_fk FOREIGN KEY (equipment_id) REFERENCES Equipamientos(id)
);