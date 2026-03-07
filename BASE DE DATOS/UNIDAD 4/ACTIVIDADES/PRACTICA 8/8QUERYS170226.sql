--ACT1--
SELECT 
    p.rep,
    COUNT(*) AS num_pedidos
FROM pedidos p
JOIN repventas r ON p.rep = r.num_empl
JOIN oficinas o ON r.oficina_rep = o.oficina
WHERE o.region = 'Centro'
GROUP BY p.rep
HAVING COUNT(*) >= 4;

--ACT2--
SELECT DISTINCT
    c.num_clie,
    c.empresa,
    pr.precio AS precio_mas_caro,
    pr.descripcion AS nombre_producto
FROM clientes c
JOIN pedidos p ON c.num_clie = p.clie
JOIN productos pr ON p.fab = pr.id_fab AND p.producto = pr.id_producto
WHERE pr.precio = (
    SELECT MAX(pr2.precio)
    FROM pedidos p2
    JOIN productos pr2 ON p2.fab = pr2.id_fab AND p2.producto = pr2.id_producto
    WHERE p2.clie = c.num_clie
);

--ACT3--
SELECT 
    p.rep,
    p.clie,
    COUNT(*) AS num_pedidos
FROM pedidos p
GROUP BY p.rep, p.clie;

--ACT4--
SELECT 
    rep,
    MIN(fecha_pedido) AS primer_pedido
FROM pedidos
GROUP BY rep
HAVING YEAR(MIN(fecha_pedido)) = 2000;

--ACT5--
SELECT AVG(pr.precio) AS media_precios
FROM productos pr
JOIN pedidos p ON pr.id_fab = p.fab AND pr.id_producto = p.producto
JOIN clientes c ON p.clie = c.num_clie
WHERE c.limite_credito < 25000
GROUP BY ... -- Sin GROUP BY, media global
HAVING AVG(pr.precio) > 3500;

--ACT6--
SELECT 
    SUM(pr.cantidad) AS suma_existencias,
    AVG(pr.precio) AS media_precios
FROM productos pr
JOIN pedidos p ON pr.id_fab = p.fab AND pr.id_producto = p.producto
JOIN repventas r ON p.rep = r.num_empl
WHERE MONTH(r.fecha_contrato) = 8
GROUP BY ... -- Ajusta si quieres por producto
HAVING AVG(pr.precio) < 2000;
