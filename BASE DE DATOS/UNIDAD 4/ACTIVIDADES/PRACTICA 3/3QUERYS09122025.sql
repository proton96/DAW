## EJERCICIO 1

SELECT id_producto, precio AS importe
 FROM productos 
WHERE precio < 1000
UNION ALL
SELECT producto, importe AS importe
FROM pedidos;

## EJERCICIO 2 
SELECT num_empl
FROM repventas
WHERE year(contrato)>= '2000-01-01'
UNION
SELECT rep_clie
FROM clientes
WHERE empresa LIKE '%S.L.%'
ORDER BY num_empl;

## EJERCICIO 3

SELECT r.num_empl, r.nombre, r.título, o.ciudad
FROM repventas r
JOIN oficinas o ON r.oficina_rep = o.oficina;

## EJERCICIO 4

SELECT r.num_empl, r.nombre, r.título
FROM repventas r
JOIN oficinas o ON r.oficina_rep = o.oficina
WHERE o.ciudad = 'Toledo';

## EJERCICIO 5

SELECT
    p.*,
    pr.descripción AS Nombre_Producto,
    r.nombre AS Nombre_Representante,
    c.empresa AS Nombre_Cliente
FROM pedidos p
JOIN productos pr ON p.fab = pr.id_fab AND p.producto = pr.id_producto
JOIN repventas r ON p.rep = r.num_empl
JOIN clientes c ON p.clie = c.num_clie
WHERE p.importe > 10000;

## EJERCICIO 6

SELECT
    p.num_pedido,
    pr.descripción AS Nombre_Producto,
    pr.precio AS Precio_Original_Unitario,
    (p.importe / p.cant) AS Precio_Vendido_Unitario
FROM pedidos p
JOIN productos pr ON p.fab = pr.id_fab AND p.producto = pr.id_producto
WHERE (p.importe / p.cant) <> pr.precio;

## EJERCICIO 7

SELECT r.*
FROM repventas r
WHERE r.ventas >= (
    SELECT ventas
    FROM oficinas
    WHERE ciudad = 'Alicante'
);


## EJERCICIO 8

SELECT DISTINCT pr.descripción
FROM clientes c
JOIN pedidos p ON c.num_clie = p.clie
JOIN productos pr ON p.fab = pr.id_fab AND p.producto = pr.id_producto
WHERE c.empresa = 'EVBE S.A.';