-- GROUP BY y HAVING --
-- UNO .Cuenta cuántos pedidos hay por representante (rep) y muestra rep y total_pedidos. 
select rep, count(num_pedido) 
from pedidos 
group by rep;
-- DOS .  Calcula el importe total vendido (SUM(importe)) por cliente (clie) y muéstralo ordenado de mayor a menor.
SELECT clie, sum(importe) 
from pedidos 
group by clie 
order by sum(importe) DESC; 
-- TRES .  Muestra las oficinas (oficina) con el total de ventas de sus representantes (SUM(repventas.ventas)) agrupado por oficina.
select o.oficina,SUM(r.ventas)
FROM oficinas o 
JOIN repventas r where o.oficina = r.oficina_rep group by oficina;
 
-- CUATRO .  Devuelve los representantes (rep) cuyo importe total de pedidos (SUM(importe)) sea mayor que 20000 (usa HAVING).
select rep , sum(importe) 
FROM pedidos 
group by rep 
HAVING SUM(importe) >20000;

-- CINCO . Devuelve los clientes (clie) que tengan 2 o más pedidos (COUNT(*)) (usa HAVING).
select clie, COUNT(num_pedido)
FROM pedidos
group by clie
HAVING COUNT(num_pedido) >= 2;

-- SEIS . Para cada fabricante (fab), calcula el importe medio de pedido (AVG(importe)) y muestra solo los fabricantes con media > 5000 (HAVING).
SELECT fab, AVG(importe)
FROM pedidos
GROUP BY fab
HAVING AVG(importe) > 5000 ;

-- SIETE . Muestra por ciudad de oficina (oficinas.ciudad) el número de representantes asignados (COUNT(repventas.num_empl)).
SELECT clie, COUNT(r.num_empl)
FROM oficinas o 
JOIN repventas r 
WHERE o.oficina = r.oficina_rep 
GROUP BY o.ciudad;

-- OCHO . Muestra por región (oficinas.región) el total de pedidos (COUNT(pedidos.num_pedido)) realizados por representantes de oficinas de esa región.
SELECT o.region, COUNT(p.num_pedido)
FROM oficinas o 
JOIN pedidos p , repventas r
WHERE r.num_empl = p.rep
group by o.región;

-- NUEVE . Para cada representante, muestra: total_pedidos, importe_total y el importe_medio; y filtra con HAVING los que tengan al menos 3 pedidos y un importe_total > 15000. 
SELECT 
FROM 
GROUP BY 
HAVING ;

-- DIEZ . Muestra las oficinas cuyo objetivo (oficinas.objetivo) se haya superado con las ventas reales de la oficina (usa SUM(repventas.ventas) agrupando por oficina y HAVING SUM(repventas.ventas) > oficinas.objetivo).
SELECT 
FROM 
GROUP BY 
HAVING ;



-- SUBCONSULTAS--

-- UNO -- (ESCALAR) Muestra los representantes cuyo valor de ventas sea mayor que la media de ventas de todos los representantes.
SELECT *
FROM repventas
WHERE ventas > (
SELECT AVG(ventas)
FROM repventas) ;
-- DOS -- (ESCALAR) Muestra los productos cuyo precio sea mayor que el precio máximo de los productos del fabricante 'ACI'.
SELECT *
FROM productos 
WHERE precio > (
SELECT MAX(precio)
FROM productos
WHERE id_fab = 'ACI');
-- TRES -- (LISTAS) Muestra los clientes cuyo límite de crédito sea mayor que el límite de crédito medio de todos los clientes.
SELECT * 
FROM clientes 
WHERE límite_crédito > (
SELECT AVG(límite_crédito)
FROM clientes);
-- CUATRO -- (NOT EXISTS) Muestra las oficinas (oficina, ciudad) que no tengan ningún representante asignado (usa subconsulta).
SELECT oficina,ciudad
FROM oficinas 
WHERE NOT EXISTS (
SELECT oficina_rep
FROM repventas);
-- CINCO -- (CORRELACIONADA) Muestra los pedidos cuyo importe sea mayor que el importe medio de los pedidos del mismo cliente (subconsulta correlacionada).
SELECT *
FROM pedidos p1
WHERE importe > (
SELECT AVG(p2.importe) 
FROM pedidos p2
WHERE p1.clie =p2.clie);

-- SEIS -- (EXISTS)  Muestra los clientes que tengan al menos un pedido (usa EXISTS o NOT EXISTS).
SELECT *
FROM clientes c 
WHERE EXISTS ( 
SELECT clie
FROM pedidos p
WHERE c.num_clie = p.clie);

-- SIETE -- (EXISTS) Muestra los representantes que atienden a algún cliente con límite de crédito > 60000 (usa subconsulta con IN o EXISTS).
SELECT *
FROM repventas r
WHERE EXISTS  (
SELECT c.rep_clie
FROM clientes c
WHERE c.límite_crédito >6000 AND 
c.rep_clie =r.num_empl);

-- OCHO -- (NOT EXISTS) Muestra los representantes que no han realizado ningún pedido (usa NOT EXISTS).
SELECT *
FROM repventas r
WHERE NOT EXISTS (
SELECT p.rep
FROM pedidos p
WHERE p.rep = r.num_empl);

-- NUEVE --  Muestra el/los cliente(s) con el mayor importe de pedido (si hay empate, deben salir todos) usando subconsulta.
SELECT *
FROM clientes c
WHERE NOT EXISTS  (
SELECT p.clie , MAX(importe)
FROM pedidos p 
 );

-- DIEZ -- Muestra las oficinas en las que todos los representantes tienen más de 40 años (usa NOT EXISTS). 
SELECT * 
FROM oficinas o
WHERE EXISTS(
SELECT r.edad
FROM repventas r
WHERE o.oficina = r.oficina_rep
) AND NOT EXISTS(
SELECT r.edad
FROM repventas r
WHERE r.edad < 40 and o.oficina =r.oficina_rep
);
