create database db_farmacia_do_bem;

use db_farmacia_do_bem;

-- criar tabela categoria
create table tb_categoria (
idCategoria int auto_increment,
nomeCategoria varchar(20),
mesPromocao varchar(20),
primary key(idCategoria)
);

-- criar tabela produto
create table tb_produto (
idProduto int auto_increment,
nomeProduto varchar(50) not null,
marca varchar(30),
preco decimal(6,2) not null,
idCategoria int,
primary key (idProduto),
foreign key (idCategoria) references tb_categoria(idCategoria)
);

-- popular tabela categoria
insert into tb_categoria (nomeCategoria) values ("Remédios");
insert into tb_categoria (nomeCategoria, mesPromocao) values ("Cosméticos", "março");
insert into tb_categoria (nomeCategoria, mesPromocao) values ("Higiene", "abril");
insert into tb_categoria (nomeCategoria) values ("Doces");
insert into tb_categoria (nomeCategoria, mesPromocao) values ("Vitaminas", "dezembro");

-- popular tabela produto
insert into tb_produto (nomeProduto, marca, preco, idCategoria) values ("Dipirona", "X", 10.00, 1);
insert into tb_produto (nomeProduto, marca, preco, idCategoria) values ("Hidratante corporal", "Cetaphil", 90.00, 2);
insert into tb_produto (nomeProduto, marca, preco, idCategoria) values ("Azitromicina", "X", 30.00, 1);
insert into tb_produto (nomeProduto, marca, preco, idCategoria) values ("Água Micelar ", "Needs", 11.00, 2);
insert into tb_produto (nomeProduto, marca, preco, idCategoria) values ("Absorvente", "Always", 3.00, 3);
insert into tb_produto (nomeProduto, marca, preco, idCategoria) values ("Bala", "Halls", 1.80, 4);
insert into tb_produto (nomeProduto, marca, preco, idCategoria) values ("Vitamina C", "X", 8.75, 5);
insert into tb_produto (nomeProduto, marca, preco, idCategoria) values ("Algodão", "Y", 11.00, 3);


-- filtrar produtos preço>50
select * from tb_produto where preco>50.00;

-- filtrar produtos preço entre 3 e 60 reais
select * from tb_produto where preco>3.00 and preco<60.00;

-- filtrar produtos com a letra c no nome
select * from tb_produto where nomeProduto like "%B%";

-- fazer select com inner join entre as duas tabelas
select * from tb_produto
	inner join tb_categoria on tb_categoria.idCategoria = tb_produto.idCategoria;

-- filtrar uma categoria (cosméticos)
select * from tb_produto where idCategoria=2;

