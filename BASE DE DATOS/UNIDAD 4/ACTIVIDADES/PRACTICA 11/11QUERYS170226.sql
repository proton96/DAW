--ACT1 Productos vendidos < precio original --
SELECT DISTINCT 
    pr.descripcion AS nombre,
    pr.precio AS precio_original
FROM productos pr
JOIN pedidos p ON pr.id_fab = p.fab AND pr.id_producto = p.producto
WHERE p.importe / p.cantidad < pr.precio;

--ACT2 Productos > precio "Bancada Motor" --
SELECT 
    pr.id_fab, 
    pr.id_producto, 
    pr.descripcion, 
    pr.precio
FROM productos pr
WHERE pr.precio > (
    SELECT precio FROM productos 
    WHERE descripcion = 'Bancada Motor'
);

--ACT3 Oficinas objetivo > todas otras regiones --
SELECT o.oficina, o.ciudad, o.region, o.dir
FROM oficinas o
WHERE o.objetivo > ALL (
    SELECT o2.objetivo 
    FROM oficinas o2 
    WHERE o2.region != o.region
);

--ACT4 Clientes límite > media S.L. --
SELECT *
FROM clientes c
WHERE c.limite_credito > (
    SELECT AVG(limite_credito) 
    FROM clientes 
    WHERE razon_social LIKE '%S.L.%'
);

--ACT5 Empleados ventas > media oficinas Este --
SELECT *
FROM repventas r
WHERE r.ventas > (
    SELECT AVG(r2.ventas)
    FROM repventas r2
    JOIN oficinas o ON r2.oficina_rep = o.oficina
    WHERE o.region = 'Este'
);

--ACT6 Empleados cuota < todas cuotas representantes --
SELECT r.nombre, r.cuota
FROM repventas r
WHERE r.cuota < ALL (
    SELECT r2.cuota 
    FROM repventas r2 
    WHERE r2.num_empl != r.num_empl  -- excluye mismo empleado
);

--ACT7 Empleados >30 años con pedidos ACI (y <150€) --
--Primera (cualquier ACI):--
SELECT DISTINCT r.nombre, r.edad
FROM repventas r
JOIN pedidos p ON r.num_empl = p.rep
JOIN productos pr ON p.fab = pr.id_fab AND p.producto = pr.id_producto
WHERE r.edad > 30 
  AND pr.id_fab = 'ACI';

--Segunda (ACI <150€):--
SELECT DISTINCT r.nombre, r.edad
FROM repventas r
JOIN pedidos p ON r.num_empl = p.rep
JOIN productos pr ON p.fab = pr.id_fab AND p.producto = pr.id_producto
WHERE r.edad > 30 
  AND pr.id_fab = 'ACI'
  AND pr.precio < 150;
