--ACT1 SIN IN -> JOIN --
SELECT DISTINCT r.num_empl, r.nombre
FROM repventas r
JOIN oficinas o ON r.oficina_rep = o.oficina
WHERE r.ventas > o.objetivo;

--ACT2 SIN IN -> NOT EXISTS --
SELECT DISTINCT r.num_empl, r.nombre
FROM repventas r
WHERE NOT EXISTS (
    SELECT 1 FROM clientes c
    JOIN /*tabla_asignacion*/ rep_clie rc ON c.num_clie = rc.clie
    WHERE rc.num_empl = r.num_empl 
      AND c.limite_credito < 50000
);

--ACT3 SIN IN -> JOIN  --
SELECT DISTINCT c.num_clie, c.empresa
FROM clientes c
JOIN pedidos p ON c.num_clie = p.clie
JOIN productos pr ON p.fab = pr.id_fab AND p.producto = pr.id_producto
WHERE pr.id_fab = 'ACI'
  AND pr.id_producto LIKE '4100%'
  AND p.fecha_pedido BETWEEN '2000-01-01' AND '2000-06-30';

--ACT4 LEFT JOIN + IS NULL --
SELECT DISTINCT c.num_clie, c.empresa
FROM clientes c
JOIN /*tabla_asignacion*/ rep_clie rc ON c.num_clie = rc.clie
JOIN repventas r ON rc.num_empl = r.num_empl
LEFT JOIN pedidos p ON c.num_clie = p.clie AND p.importe > 3000
WHERE r.nombre = 'Soledad Martinez'
  AND p.num_pedido IS NULL;

