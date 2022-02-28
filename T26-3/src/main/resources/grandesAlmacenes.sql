create database if not exists Almacenes;
use Almacenes;

create table if not exists cajeros (
	codigo int primary key,
    nomapels nvarchar(255)
);

create table if not exists productos(
	codigo int primary key,
    nombre nvarchar(255),
    precio int
);

create table if not exists maquinasregistradoras(
	codigo int primary key,
    piso int
);

create table if not exists venta(
	cajero int,
    maquina int,
    producto int,
    primary key(cajero, maquina, producto),
    foreign key (cajero) references cajeros(codigo),
	foreign key (maquina) references maquinasregistradoras(codigo),
	foreign key (producto) references productos(codigo)
);