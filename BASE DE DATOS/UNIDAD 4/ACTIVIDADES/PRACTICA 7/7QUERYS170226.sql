--ACT1--
SELECT 
    o.region,
    AVG(r.cuota) AS media_cuota_region
FROM repventas r
JOIN oficinas o ON r.oficina_rep = o.oficina
GROUP BY o.region;

--ACT2--
SELECT 
    o.oficina,
    AVG(r.ventas) AS media_ventas_oficina
FROM repventas r
JOIN oficinas o ON r.oficina_rep = o.oficina
GROUP BY o.oficina
HAVING AVG(r.ventas) > 30000;

--ACT3--
SELECT 
    clie,
    COUNT(*) AS num_pedidos
FROM pedidos
GROUP BY clie;

--ACT4--
SELECT 
    clie,
    COUNT(*) AS num_pedidos
FROM pedidos
GROUP BY clie
HAVING COUNT(*) > 2;

--ACT5--
SELECT 
    fab,
    producto,
    MAX(cantidad) AS max_unidades_pedido
FROM pedidos
GROUP BY fab, producto;

--ACT6--
SELECT 
    clie,
    MIN(importe) AS importe_mas_bajo
FROM pedidos
GROUP BY clie
HAVING MIN(importe) >= 100;

--ACT7--
SELECT COUNT(DISTINCT oficina_rep) AS num_empleados_con_oficina
FROM repventas
WHERE oficina_rep IS NOT NULL;

--ACT8--
SELECT COUNT(DISTINCT clie) AS clientes_con_pedidos
FROM pedidos;

--ACT9--
SELECT 
    p.rep,
    COUNT(*) AS num_pedidos
FROM pedidos p
GROUP BY p.rep;
