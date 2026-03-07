--ACT1--
--Esta query que adjunto esta corregida--
SELECT d.cod_disco, d.título, d.intérprete, c.nombre, c.apellidos
FROM DISCOS d, CLIENTES c
WHERE c.direccion = 'Madrid';

--ACT2--
-- Estas serian las diferencias de las 3 consultas--
--Primera--
SELECT AVG(pvp) FROM DISCOS WHERE pvp < 20;
--Segunda--
SELECT intérprete, AVG(pvp) FROM DISCOS
WHERE pvp < 20 GROUP BY intérprete;
--Tercera--
SELECT intérprete, AVG(pvp) FROM DISCOS
WHERE pvp < 20 GROUP BY intérprete HAVING AVG(pvp) > 10;

--ACT3--
--Esta consulta muestra clientes + ventas para clientes 40-50 ordenados por fecha de ventas--
SELECT c.cod_cliente, c.nombre, c.apellidos, 
       v.cod_disco, d.título, v.fecha_venta
FROM CLIENTES c, VENTAS v, DISCOS d
WHERE c.cod_cliente = v.cod_cliente
  AND v.cod_disco = d.cod_disco
  AND c.edad BETWEEN 40 AND 50
ORDER BY v.fecha_venta DESC;


--ACT4--
SELECT d.*, v.*
FROM DISCOS d
JOIN VENTAS v ON d.cod_disco = v.cod_disco
WHERE d.intérprete IN ('Melendi', 'Alejandro Sanz', 'Pablo Alborán');
