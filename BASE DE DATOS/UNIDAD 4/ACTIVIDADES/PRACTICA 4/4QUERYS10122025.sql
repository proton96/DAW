--ACT1--
SELECT num_pedido,
       fecha_pedido
FROM pedidos
WHERE fecha_pedido > (
    SELECT fecha_contrato
    FROM repventas
    WHERE nombre = 'María García'
);

--ACT2--
SELECT r.*,
       o.*
FROM repventas r
JOIN oficinas o
  ON r.oficina_rep = o.oficina
WHERE r.cuota >= 0.75 * o.objetivo;

--ACT3--
SELECT r.nombre
FROM repventas r
JOIN oficinas o
  ON r.oficina_rep = o.oficina
WHERE r.cuota >= o.objetivo;

--ACT4--
SELECT r.*
FROM repventas AS r
JOIN oficinas AS o
  ON r.oficina_rep = o.oficina
WHERE r.ventas >= (
    SELECT o2.ventas
    FROM oficinas AS o2
    WHERE o2.ciudad = 'Alicante'
);

--ACT5--
SELECT e.num_empl          AS cod_empleado,
       e.nombre            AS nombre_empleado,
       d1.nombre           AS nombre_director_empleado,
       o.oficina           AS cod_oficina,
       d2.nombre           AS nombre_director_oficina
FROM repventas e
LEFT JOIN repventas d1
       ON e.dir = d1.num_empl
LEFT JOIN oficinas o
       ON e.oficina_rep = o.oficina
LEFT JOIN repventas d2
       ON o.dir = d2.num_empl;

--ACT6--
SELECT e.num_empl          AS cod_empleado,
       e.nombre            AS nombre_empleado,
       d1.nombre           AS nombre_director_empleado,
       o.oficina           AS cod_oficina,
       d2.nombre           AS nombre_director_oficina
FROM repventas e
JOIN repventas d1
     ON e.dir = d1.num_empl
JOIN oficinas o
     ON e.oficina_rep = o.oficina
JOIN repventas d2
     ON o.dir = d2.num_empl
WHERE e.dir = o.dir;

