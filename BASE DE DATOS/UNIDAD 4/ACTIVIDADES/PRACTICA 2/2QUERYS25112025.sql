
#EJERCICIO 1
SELECT CONCAT(id_producto, ' vale ', precio, ' euros') AS descripcion
FROM productos; 

#EJERCICIO 2
SELECT 
    num_pedido,
    MONTHNAME(fecha_pedido) AS mes
FROM pedidos
WHERE DAY(fecha_pedido) = 2;

#EJERCICIO 3
SELECT num_pedido,producto,cant 
FROM pedidos 
WHERE cant <5 or cant >5;

#EJERCICIO 4
SELECT * 
FROM repventas
WHERE título NOT IN ('Rep. Ventas', 'Dir. Ventas');

#EJERCICIO 5
SELECT *
FROM repventas
order by título desc , edad asc;

#EJERCICIO 6
SELECT num_empl , nombre
FROM repventas
where título NOT IN ('Rep. Ventas' , 'VP Ventas');

#EJERCICIO 7 
SELECT distinct fab
FROM pedidos
ORDER BY fab desc;

#EJERCICIO 8
SELECT *
FROM productos
WHERE descripción LIKE '%bisagra%';

#EJERCICIO 9
SELECT num_clie , empresa
FROM clientes
WHERE num_clie like '%5'
	OR num_clie like '%7';
    
#EJERCICIO 10
SELECT nombre , edad , contrato
FROM repventas
WHERE (edad between 40 and 55)
	OR (YEAR(contrato) = 1997 AND edad <30);
   
