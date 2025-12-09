-- Eathan Andres Garzon Cortes

drop TABLE if EXISTS Equipamientos;
drop TABLE if EXISTS Sensores;
drop TABLE if EXISTS Lecturas;

CREATE TABLE Equipamientos (
  id_equipamientos INTEGER PRIMARY KEY UNIQUE,
  nombre TEXT NOT NULL,
  tipo_equipamiento TEXT NOT NULL CHECK(tipo_equipamiento IN ('Mecanico','Electrico','Otro'),
  localizacion TEXT NOT NULL);
  
CREATE TABLE Sensores (
    id_sensor INTEGER,
    id_equipamiento INTEGER NOT NULL,
    tipo_sensor TEXT NOT NULL CHECK(tipo_sensor IN ('Temperatura','Presion','Humedad'),
    modelo TEXT NOT NULL,
    PRIMARY KEY (id_sensor),
    FOREIGN KEY (id_equipamiento) REFERENCES Equipamientos(id_equipamiento));
    
CREATE TABLE Lecturas (
  id_lectura INTEGER,
  marca_de_tiempo,
  PRIMARY KEY (id_lectura),
  FOREIGN KEY (id_sensor) REFERENCES Sensores(id_sensor));