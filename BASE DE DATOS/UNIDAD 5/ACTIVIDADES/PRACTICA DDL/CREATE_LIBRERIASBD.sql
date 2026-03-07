CREATE database LIBRERIAS;
USE LIBRERIAS;

CREATE TABLE autores (
	id_autor int auto_increment primary key,
    nombre varchar(100) not null
);

create table libros (
	id_libro int auto_increment primary key,
    titulo varchar(150) not null,
    id_autor int,
    seccion varchar(50),
	precio decimal (10,2),
    foreign key (id_autor) references autores(id_autor)
);

create table clientes (
	id_cliente int auto_increment primary key,
    nombre varchar(100) not null,
    email varchar(100) unique,
    index idx_email (email)
);

create table facturas(
	id_factura int auto_increment primary key,
    id_cliente int,
    fecha date,
    total decimal(10,2),
    foreign key (id_cliente) references clientes(id_cliente)
);

create table detalle_ventas (
	id_detalle int auto_increment primary key,
    id_libro int,
    id_factura int,
    unidades int,
	foreign key (id_libro) references libros(id_libro),
    foreign key (id_factura) references facturas(id_factura)
);


