create database db_construindo_a_nossa_vida;

use db_construindo_a_nossa_vida;

create table tb_categoria (
id bigint auto_increment,
nome_categoria varchar(20) not null,
tipo_venda varchar (20) not null, 
primary key (id)
);

create table tb_produto (
id bigint auto_increment,
nome varchar(30) not null,
preco decimal (6,2) not null,
ativo boolean,
id_categoria bigint not null,
primary key (id),
foreign key (id_categoria) references tb_categoria(id)
);

-- popular a tabela categoria
insert into tb_categoria (nome_categoria, tipo_venda) values ("ferramentas", "varejo");
insert into tb_categoria (nome_categoria, tipo_venda) values ("elétricos", "varejo/atacado");
insert into tb_categoria (nome_categoria, tipo_venda) values ("hidráulica", "varejo");
insert into tb_categoria (nome_categoria, tipo_venda) values ("ferragens", "varejo/atacado");
insert into tb_categoria (nome_categoria, tipo_venda) values ("madeiras", "varejo/atacado");

-- popular a tabela produto
insert into tb_produto (nome, preco, ativo, id_categoria) values ("rolo pintura", 20.00, true, 1);
insert into tb_produto (nome, preco, ativo, id_categoria) values ("alicate", 50.00, true, 1);
insert into tb_produto (nome, preco, ativo, id_categoria) values ("furadeira", 200.00, true, 1);
insert into tb_produto (nome, preco, ativo, id_categoria) values ("disjuntor", 40.00, false, 2);
insert into tb_produto (nome, preco, ativo, id_categoria) values ("chuveiro", 60.00, true, 3);
insert into tb_produto (nome, preco, ativo, id_categoria) values ("válvula de descarga", 80.00, false, 3);
insert into tb_produto (nome, preco, ativo, id_categoria) values ("dobradiça", 11.00, true, 4);
insert into tb_produto (nome, preco, ativo, id_categoria) values ("pallet", 70.00, true, 5);

-- filtrar produtos com valor maior que 50 reais
select nome,concat("R$", format (preco,2,"pt_BR")) as preco from tb_produto where preco>50;

-- filtrar produtos com valor entre 3 e 60 reais
select nome,concat("R$", format (preco,2,"pt_BR")) as preco from tb_produto where preco between 3 and 60 order by preco;

-- buscar produtos com a letra c no nome
select * from tb_produto where nome like "%c%";

-- fazer um select com Inner join entre tabela categoria e produto
select tb_produto.id, nome, preco, ativo, id_categoria, tb_categoria.nome_categoria, tb_categoria.tipo_venda from tb_produto 
inner join tb_categoria on tb_categoria.id=tb_produto.id_categoria;

-- filtrar frutas não-cítricas
select tb_produto.id, nome, preco, ativo, id_categoria, tb_categoria.nome_categoria, tb_categoria.tipo_venda from tb_produto 
inner join tb_categoria on tb_categoria.id=tb_produto.id_categoria
where tb_categoria.nome_categoria="ferramentas";