create database bootcamp;
use bootcamp;

create table animales(
	id int(50) auto_increment,
    nombre varchar(100),
    especie varchar(100),
    peso float(200,3),
    primary key (id)    
);

insert into animales(id, nombre, especie, peso) values(1,'Apolo','Perro',40.6);
insert into animales(id, nombre, especie, peso) values(2,'Eva','Perro',10.6);
insert into animales(id, nombre, especie, peso) values(3,'Coco','Gato',40.6);
insert into animales(id, nombre, especie, peso) values(4,'Silvestre','Tigre',140.6);
insert into animales(id, nombre, especie, peso) values(5,'Tom','Leon',130.6);
insert into animales(id, nombre, especie, peso) values(6,'Tito','Torro',120.6);
insert into animales(id, nombre, especie, peso) values(7,'Felix','Perro',35.6);
insert into animales(id, nombre, especie, peso) values(8,'Simba','Gato',10.6);
insert into animales(id, nombre, especie, peso) values(9,'Kitty','Loro',2.6);
insert into animales(id, nombre, especie, peso) values(10,'Pelusa','Gato',10.3);

select * from animales where peso > 30 order by id asc;

select * from animales;
