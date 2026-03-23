SET sql_safe_updates = 0;

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
INSERT INTO CLINICAS VALUES
(1, 'VetCare Central', 'Barcelona', 'Calle Mayor 12', '2011-04-10'),
(2, 'VetCare Sur', 'Málaga', 'Avenida del Puerto 30', '2013-07-21'),
(3, 'VetCare Levante', 'Valencia', 'Plaza Jardín 9', '2016-10-05'),
(4, 'VetCare Norte', 'Santander', 'Calle Marina 17', '2019-02-14'),
(5, 'VetCare Centro', 'Barcelona', 'Calle Aragón 88', '2021-12-01');


INSERT INTO CLIENTES VALUES
(1, '12345678A', 'Carlos', 'Martín López', '2024-01-05', 1),
(2, '23456789B', 'Lucía', 'Soto Ruiz', '2024-02-11', 2),
(3, '34567890C', 'Daniel', 'Mora Pérez', '2024-03-20', 1),
(4, '45678901D', 'Elena', 'García Castro', '2024-04-15', 3),
(5, '56789012E', 'Javier', 'Ramos Díaz', '2024-05-02', 5);

INSERT INTO VETERINARIOS VALUES
(1, 'Pedro', 'Cirugía', '2018-03-01'),
(2, 'Laura', 'Dermatología', '2019-06-12'),
(3, 'Sergio', 'Traumatología', '2017-11-20'),
(4, 'Paula', 'Cardiología', '2020-01-18'),
(5, 'Michael', 'General', '2016-08-30');

INSERT INTO MASCOTAS VALUES
(1, 'Luna', 'Perro', 2018, 1, 1),
(2, 'Milo', 'Gato', 2020, 3, 1),
(3, 'Rocky', 'Perro', 2017, 2, 2),
(4, 'Nala', 'Gato', 2019, 4, 3),
(5, 'Toby', 'Conejo', 2021, 5, 4),
(6, 'Simba', 'Perro', 2022, 1, 5);


INSERT INTO CONSULTAS VALUES
(1, 1, 1, '2025-06-01', NULL, 'en_tratamiento'),
(2, 2, 2, '2025-06-02', '2025-06-09', 'alta'),
(3, 3, 3, '2025-06-03', NULL, 'revisión'),
(4, 4, 4, '2025-06-05', NULL, 'en_tratamiento'),
(5, 5, 5, '2025-06-06', '2025-06-12', 'alta'),
(6, 6, 1, '2025-06-07', NULL, 'revisión');


-- 2. Pasar a estado de revision 
UPDATE consultas
SET estado = 'en_tratamiento'
WHERE estado = 'revision';

-- 3 sumar 1 año a lo propuesto
UPDATE mascotas
SET anionacimiento = anionacimiento +1
WHERE anionacimiento < '2018';

-- 4.  actualizar clientes id 1
UPDATE clientes 
SET fecharegistro = '2024-01-01'
WHERE idclinica = 1;


-- 5.  Actualizar a revision
UPDATE mascotas 
SET idclinica = 5
WHERE idmascota IN (
SELECT idmascota FROM consultas
WHERE estado = 'revision');

-- 6. Eliminar todas las consultas con alta
DELETE FROM consultas
WHERE estado = 'alta';

-- 7. 
DELETE FROM mascotasm
JOIN veterinarios v ON  m.idmascota = v.idmascota
WHERE especialidad = 'General';


-- 8.Consultas asociadas a mascotas

DELETE consultas c
FROM  consultas
INNER JOIN mascotas m ON c.idmascota = m.idmascota
WHERE m.idclinica = 5;




-- 9. 
START TRANSACTION
UPDATE consultas
SET estado = 'alta'
SET fechaaltamedica = '2025-06-15'
WHERE idconsulta = 4,
COMMIT;

-- 10. 
START TRANSACTION
UPDATE mascotas 
SET estado = 'alta'
SET fechaaltamedica = '2025-06-16'
SET  id clinica = 2

WHERE idmascota = 3
COMMIT;


