--ACT1--
SELECT 
    SUM(cuota)  AS suma_cuotas,
    SUM(ventas) AS suma_ventas
FROM repventas;

--ACT2--
SELECT SUM(importe) AS total_aceptados_belen
FROM pedidos
JOIN repventas ON pedidos.rep = repventas.num_empl
WHERE repventas.nombre = 'Belén Aguirre'
  AND pedidos.aceptado = 'S';

--ACT3--
SELECT AVG(precio) AS precio_promedio_aci
FROM productos
WHERE id_fab = 'ACI';

--ACT4--
SELECT AVG(importe) AS importe_medio_pedidos_2103
FROM pedidos
WHERE clie = 2103;

--ACT5--
SELECT 
    MIN(cuota) AS cuota_minima,
    MAX(cuota) AS cuota_maxima
FROM repventas;

--ACT6--
SELECT MIN(fecha_pedido) AS pedido_mas_antiguo
FROM pedidos;

--ACT7--
SELECT 
    num_empl,
    nombre,
    ventas,
    cuota,
    (ventas - cuota) AS rendimiento
FROM repventas
ORDER BY rendimiento DESC
LIMIT 1;

--ACT8--
(SELECT nombre
 FROM repventas
 ORDER BY nombre ASC
 LIMIT 1)
UNION ALL
(SELECT nombre
 FROM repventas
 ORDER BY nombre DESC
 LIMIT 1);

--ACT9--
SELECT COUNT(*) AS numero_clientes
FROM clientes;

--ACT10--
SELECT COUNT(*) AS vendedores_superan_cuota
FROM repventas
WHERE ventas > cuota;

--ACT11--
SELECT COUNT(*) AS pedidos_mayores_25000
FROM pedidos
WHERE importe > 25000;

--ACT12--
SELECT
    SUM(ventas)                  AS suma_ventas,
    SUM(cuota)                   AS suma_cuotas,
    SUM(ventas) - SUM(cuota)     AS suma_ventas_menos_suma_cuotas,
    SUM(ventas - cuota)          AS suma_de_ventas_menos_cuota
FROM repventas;
