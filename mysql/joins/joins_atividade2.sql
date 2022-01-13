create database db_pizzaria_legal;
use db_pizzaria_legal;

-- criar tabela categoria
create table tb_categoria (
idCategoria int auto_increment,
nomeCategoria varchar(20),
diaPromocao varchar(20),
primary key(idCategoria)
);

-- criar tabela pizza
create table tb_pizza (
idPizza int auto_increment,
nomePizza varchar(50) not null,
tamanho enum ('P', 'M', 'G') not null,
preco decimal(5,2) not null,
idCategoria int,
primary key (idPizza),
foreign key (idCategoria) references tb_categoria(idCategoria)
);

-- popular tabela categoria
insert into tb_categoria (nomeCategoria, diaPromocao) values ("doce", "terça-feira");
insert into tb_categoria (nomeCategoria, diaPromocao) values ("salgada", "quarta-feira");
insert into tb_categoria (nomeCategoria, diaPromocao) values ("especial", "quinta-feira");
insert into tb_categoria (nomeCategoria, diaPromocao) values ("apimentada", "sexta-feira");
insert into tb_categoria (nomeCategoria, diaPromocao) values ("vegetariana", "sábado");

-- popular tabela pizza 
insert into tb_pizza (nomePizza, tamanho, preco, idCategoria) values ("Kit Kat", 'P', 30.00, 1);
insert into tb_pizza (nomePizza, tamanho, preco, idCategoria) values ("Doce de leite", 'P', 25.00, 1);
insert into tb_pizza (nomePizza, tamanho, preco, idCategoria) values ("M&Ms", 'P', 30.00, 1);
insert into tb_pizza (nomePizza, tamanho, preco, idCategoria) values ("Napolitana", 'G', 60.00, 2);
insert into tb_pizza (nomePizza, tamanho, preco, idCategoria) values ("Brócolis, palmito e shimeji", 'G', 70.00, 5);
insert into tb_pizza (nomePizza, tamanho, preco, idCategoria) values ("Atum e agrião", 'M', 60.00, 2);
insert into tb_pizza (nomePizza, tamanho, preco, idCategoria) values ("Mussarela, carne e curry", 'P', 25.00, 4);
insert into tb_pizza (nomePizza, tamanho, preco, idCategoria) values ("Camarão, salmão, e tomate ", 'P', 40.00, 3);

-- filtrar produtos preço>45
select * from tb_pizza where preco>45.00;

-- filtrar produtos preço entre 29 e 60 reais
select * from tb_pizza where preco>29.00 and preco<60.00;

-- filtrar pizzas com a letra c no nome
select * from tb_pizza where nomePizza like "%C%";

-- fazer select com inner join entre as duas tabelas
select * from tb_pizza
	inner join tb_categoria on tb_categoria.idCategoria = tb_pizza.idCategoria;

-- filtrar uma categoria (pizzas salgadas)
select * from tb_pizza where idCategoria=2;

