DROP DATABASE IF EXISTS BD2_Chavez;
CREATE DATABASE BD2_Chavez;

USE BD2_Chavez;

CREATE TABLE tipo (
    cod_tipo_atencion INT PRIMARY KEY AUTO_INCREMENT,
    nom_tipo_atencion VARCHAR(100) NOT NULL,
    precio DECIMAL(10, 2) NOT NULL
);

INSERT INTO tipo (nom_tipo_atencion, precio) VALUES ('Consulta General', 50.00);
INSERT INTO tipo (nom_tipo_atencion, precio) VALUES ('Dermatologo', 40.00);
INSERT INTO tipo (nom_tipo_atencion, precio) VALUES ('Gastroenterologo', 70.00);

CREATE TABLE atencion (
    num_atencion INT PRIMARY KEY AUTO_INCREMENT,
    fecha DATE NOT NULL,
    nom_paciente VARCHAR(100) NOT NULL,
    cod_tipo INT,
    FOREIGN KEY (cod_tipo) REFERENCES tipo(cod_tipo_atencion)
);

USE BD2_Chavez;
INSERT INTO atencion (fecha, nom_paciente, cod_tipo) 
VALUES ('2024-08-18', 'Adrian', 1);

select * from tipo