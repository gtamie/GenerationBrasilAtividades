create database db_cidade_das_frutas;

use db_cidade_das_frutas;

create table tb_categoria (
id bigint auto_increment,
tipo varchar(20) not null,
unidadeDeVenda int not null, 
primary key (id)
);

create table tb_produto (
id bigint auto_increment,
nome varchar(20) not null,
preco decimal (4,2) not null,
ativo boolean,
id_categoria bigint not null,
primary key (id),
foreign key (id_categoria) references tb_categoria(id)
);

-- popular a tabela categoria
insert into tb_categoria (tipo, unidadeDeVenda) values ("cítricos", 12);
insert into tb_categoria (tipo, unidadeDeVenda) values ("embalados (s/ casca)", 1);
insert into tb_categoria (tipo, unidadeDeVenda) values ("embalados (c/ casca)", 1);
insert into tb_categoria (tipo, unidadeDeVenda) values ("preço por kg", 1);
insert into tb_categoria (tipo, unidadeDeVenda) values ("não-cítricos", 6);

-- popular a tabela produto
insert into tb_produto (nome, preco, ativo, id_categoria) values ("laranja lima", 13.00, true, 1);
insert into tb_produto (nome, preco, ativo, id_categoria) values ("laranja pera", 13.00, true, 1);
insert into tb_produto (nome, preco, ativo, id_categoria) values ("abacaxi", 15.00, true, 2);
insert into tb_produto (nome, preco, ativo, id_categoria) values ("melancia", 14.00, false, 2);
insert into tb_produto (nome, preco, ativo, id_categoria) values ("uva s/ semente", 15.00, true, 3);
insert into tb_produto (nome, preco, ativo, id_categoria) values ("lichia", 12.00, false, 4);
insert into tb_produto (nome, preco, ativo, id_categoria) values ("maçã", 11.00, true, 5);
insert into tb_produto (nome, preco, ativo, id_categoria) values ("mamão papaya", 10.00, false, 5);

-- filtrar produtos com valor maior que 50 reais
select nome,preco from tb_produto where preco>50;

-- filtrar produtos com valor entre 3 e 60 reais
select nome,concat("R$", format (preco,2,"pt_BR")) as preco from tb_produto where preco between 3 and 60 order by preco;

-- buscar produtos com a letra c no nome
select * from tb_produto where nome like "%c%";

-- fazer um select com Inner join entre tabela categoria e produto
select tb_produto.id, nome, preco, ativo, id_categoria, tb_categoria.tipo, tb_categoria.unidadeDeVenda from tb_produto 
inner join tb_categoria on tb_categoria.id=tb_produto.id_categoria;

-- filtrar frutas não-cítricas
select tb_produto.id, nome, preco, ativo, id_categoria, tb_categoria.tipo, tb_categoria.unidadeDeVenda from tb_produto 
inner join tb_categoria on tb_categoria.id=tb_produto.id_categoria
where tb_categoria.tipo="não-cítricos"



