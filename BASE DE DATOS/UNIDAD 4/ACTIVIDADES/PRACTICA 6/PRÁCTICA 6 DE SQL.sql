-- EJERCICIO 1 --
SELECT AVG(ventas) AS MEDIA
FROM repventas;

-- EJERCICIO 2 --
SELECT 
    MIN(fecha_pedido) AS primer_pedido,
    MAX(fecha_pedido) AS ultimo_pedido
FROM pedidos;

-- EJERCICIO 3 --
SELECT COUNT(existencias)
FROM productos;

-- EJERCICIO 4 --
SELECT SUM(ventas) 
FROM oficinas;

-- EJERCICIO 5 --
SELECT dir 
FROM oficinas;

SELECT COUNT(dir) AS NUMERO_DE_DIRECTORES
FROM oficinas;

SELECT COUNT(título) 
FROM  repventas
WHERE título LIKE '%dir%';

-- EJERCICIO 6 --
SELECT AVG(límite_crédito) AS MEDIA
FROM clientes
WHERE empresa LIKE '%S.A.%';

-- EJERCICIO 7 --
SELECT MAX(importe)
FROM pedidos; 

-- EJERCICIO 8 --
SELECT AVG(pedidos.cant) AS MEDIA
FROM pedidos 
JOIN clientes ON pedidos.clie = clientes.num_clie
WHERE clientes.empresa = 'Zapater Importaciones S.A.';

-- EJERCICIO 9 --
SELECT COUNT(num_pedido) AS Numero_Pedidos_Realizados
FROM pedidos; 
