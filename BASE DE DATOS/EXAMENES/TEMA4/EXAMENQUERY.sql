-- EJERCICIO 1 --
SELECT num_empl, nombre
FROM repventas
WHERE título = 'Rep. Ventas';

-- EJERCICIO 2 --
SELECT nombre, edad 
FROM repventas
WHERE edad BETWEEN 40 AND 50;

-- EJERCICIO 3 --
SELECT num_clie, empresa
FROM clientes
WHERE límite_crédito BETWEEN 40000 AND 60000;

-- EJERCICIO 4 --
SELECT num_clie, empresa
FROM clientes
WHERE empresa LIKE 'Exclusivas%';

-- EJERCICIO 5 --
SELECT  id_fab, id_producto,descripción
FROM productos 
WHERE precio >= 500;


-- EJERCICIO 6 --
SELECT num_pedido,fecha_pedido,clie
FROM pedidos
WHERE fecha_pedido  BETWEEN '2000-01-01'AND '2000-01-31';

-- EJERCICIO 7 --
SELECT nombre, ciudad
FROM repventas r
JOIN oficinas o;

-- EJERCICIO 8 --
SELECT nombre,región
FROM repventas r
JOIN oficinas o WHERE región = 'Este';

-- EJERCICIO 9 --
SELECT num_clie,empresa,nombre
FROM clientes c
JOIN repventas r ;

-- EJERCICIO 10 --
SELECT num_pedido,empresa,nombre
FROM pedidos p 
JOIN clientes
JOIN repventas;

-- EJERCICIO 11 --
SELECT  id_fab, id_producto,descripción
FROM productos
WHERE id_fab IN ('REI', 'IMM');

-- EJERCICIO 12 --
SELECT  id_fab, id_producto, descripción,existencias
FROM productos
WHERE descripción LIKE  '%Riostra%';

-- EJERCICIO 13 --
SELECT  num_empl,nombre
FROM repventas
WHERE oficina_rep IS NULL;

-- EJERCICIO 14 --
SELECT num_clie, empresa,límite_crédito
FROM clientes c
JOIN repventas r
JOIN oficinas o 
WHERE ciudad = 'Madrid';

-- EJERCICIO 15 --
SELECT num_pedido,fecha_pedido,descripción
FROM pedidos p 
JOIN productos pr ON p.fab = pr.id_fab AND p.producto = pr.id_producto 
WHERE p.fab = 'ACI';

-- EJERCICIO 16 --
SELECT num_pedido, empresa,nombre,ciudad
FROM pedidos p
JOIN oficinas o
JOIN clientes c
JOIN repventas re;

-- EJERCICIO 17 --
SELECT num_empl, nombre,ciudad
FROM repventas r
JOIN oficinas o ON r.oficina_rep = o.oficina
WHERE r.nombre LIKE '%Martínez';
  
-- EJERCICIO 18 --
SELECT num_empl, nombre,contrato
FROM repventas
WHERE contrato BETWEEN '1997-01-01' AND '1999-12-31';


-- EJERCICIO 19 --
SELECT num_pedido, fecha_pedido, empresa
FROM pedidos p 
JOIN clientes c ON p.clie = c.num_clie
WHERE p.importe BETWEEN 5000 AND 30000;

-- EJERCICIO 20 --
SELECT num_clie, empresa,nombre
FROM clientes c 
JOIN repventas r ON c.rep_clie = r.num_empl 
WHERE c.empresa LIKE '%S.L.%' AND c.límite_crédito > 50000;