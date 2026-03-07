--ACT1 CLIENTES SIN NINGUN PEDIDO--
SELECT c.num_clie, c.empresa
FROM clientes c
LEFT JOIN pedidos p ON c.num_clie = p.clie
WHERE p.num_pedido IS NULL;

--ACT2 EMPLEADOS SIN PEDIDOS ENERO/MARZO --
SELECT DISTINCT r.num_empl, r.nombre
FROM repventas r
WHERE NOT EXISTS (
    SELECT 1 FROM pedidos p 
    WHERE p.rep = r.num_empl 
      AND MONTH(p.fecha_pedido) IN (1,3)
);

--ACT3 PRODUCTOS MAS CAROS QUE TODOS LOS PEDIDOS DE ENERO 2000 --
SELECT DISTINCT r.num_empl, r.nombre
FROM repventas r
WHERE NOT EXISTS (
    SELECT 1 FROM pedidos p 
    WHERE p.rep = r.num_empl 
      AND MONTH(p.fecha_pedido) IN (1,3)
);

--ACT4 OFICINAS CON VENTAS < CUALQUIER EMPLEADO --
SELECT o.*
FROM oficinas o
WHERE o.ventas < SOME (
    SELECT r.ventas 
    FROM repventas r 
    WHERE r.oficina_rep = o.oficina
);

--ACT5 EMPLEADOS MAYORES QUE SUS DIRECTORES --
SELECT e.num_empl, e.nombre, e.edad
FROM repventas e
JOIN repventas d ON e.dir = d.num_empl
WHERE e.edad > d.edad;

--ACT6 PRODUCTOS EXISTENCIAS < CANTIDAD PEDIDA EN ALGUN PEDIDO --
SELECT pr.id_fab, pr.id_producto, pr.descripcion, pr.cantidad
FROM productos pr
WHERE pr.cantidad < ANY (
    SELECT p.cantidad 
    FROM pedidos p
    WHERE p.fab = pr.id_fab AND p.producto = pr.id_producto
);

--ACT7 EMPLEADOS PEDIDOS MES/AÑO CONTRATACION  --
SELECT r.num_empl, r.nombre, r.edad, r.fecha_contrato
FROM repventas r
JOIN pedidos p ON r.num_empl = p.rep
WHERE YEAR(p.fecha_pedido) = YEAR(r.fecha_contrato)
  AND MONTH(p.fecha_pedido) = MONTH(r.fecha_contrato);
