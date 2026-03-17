
-- 1.CREAMOS LA DATABASE --
CREATE DATABASE redveterinarias;
USE redveterinarias;

--  Creamos las tablas-- 

CREATE TABLE CLINICAS (
    idclinica INT PRIMARY KEY,
    nombre VARCHAR(100),
    ciudad VARCHAR(50),
    direccion VARCHAR(100),
    fechaapertura DATE
);

CREATE TABLE CLIENTES (
    idcliente INT PRIMARY KEY,
    dni VARCHAR(9),
    nombre VARCHAR(50),
    apellidos VARCHAR(100),
    fecharegistro DATE,
    idclinica INT,
    FOREIGN KEY (idclinica)
        REFERENCES CLINICAS (idclinica)
);

CREATE TABLE VETERINARIOS (
    idveterinario INT PRIMARY KEY,
    nombre VARCHAR(50),
    especialidad VARCHAR(50),
    fechacontratacion DATE
);

CREATE TABLE MASCOTAS (
    idmascota INT PRIMARY KEY,
    nombre VARCHAR(50),
    especie VARCHAR(30),
    anionacimiento YEAR,
    idcliente INT,
    idclinica INT,
    FOREIGN KEY (idcliente)
        REFERENCES CLIENTES (idcliente),
    FOREIGN KEY (idclinica)
        REFERENCES CLINICAS (idclinica)
);

CREATE TABLE CONSULTAS (
    idconsulta INT PRIMARY KEY,
    idmascota INT,
    idveterinario INT,
    fechaconsulta DATE,
    fechaaltamedica DATE,
    estado VARCHAR(20),
    FOREIGN KEY (idmascota)
        REFERENCES MASCOTAS (idmascota),
    FOREIGN KEY (idveterinario)
        REFERENCES VETERINARIOS (idveterinario)
);

-- 2. Modificar la tabla consultas-- 
ALTER TABLE consultas
ADD COLUMN coste DECIMAL(5,2) NOT NULL;

-- 3. MODIFICAR TABLA CLIENTES
ALTER TABLE clientes 
ADD COLUMN email VARCHAR(100) NOT NULL UNIQUE,
ADD COLUMN ciudad VARCHAR(100) DEFAULT 'Lisboa';

-- 4. Eliminar el campo dni 
ALTER TABLE clientes 
DROP COLUMN dni;

-- 5. Cambio de clave primaria en clientes
ALTER TABLE clientes
DROP PRIMARY KEY,
ADD UNIQUE (idcliente),
ADD PRIMARY KEY (email);

-- 6. Listado de mascotas registradas en clinicas en Barcelona.
CREATE VIEW mascotas_barcelona AS
SELECT * FROM mascotas m
JOIN clinicas c ON c.idclinica = m.idclinica
WHERE c.ciudad = 'Barcelona';

-- 7. Normativa apellidos del veterinario 
-- incorporar apellidos en veterinarios y hacerlo en el orden que piden --
ALTER TABLE veterinarios 
ADD COLUMN apellido_1 VARCHAR(100) NOT NULL AFTER nombre,
ADD COLUMN apellido_2 VARCHAR(100) NOT NULL AFTER apellido_1;

-- 8. Eliminar el campo y dar nueva clave primaria
ALTER TABLE consultas 
DROP PRIMARY KEY,
ADD PRIMARY KEY (idmascota,idveterinario,fechaconsulta),
DROP COLUMN idconsulta;

-- 9. Crear el usuario vetassistant y darle privilegios 
CREATE USER 'vetassistant '@'localhost' IDENTIFIED BY '1234';
GRANT SELECT, INSERT
ON red_veterinarias.mascotas
TO 'vetassistant'@'localhost';

--  10. Crear una vista para contar las mascotas distintas que estan en consulta.




