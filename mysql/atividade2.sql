create database db_loja;

use db_loja;

create table tb_produtos(
id bigint auto_increment,
nome varchar(40) not null,
preco decimal(7,2) not null,
categoria enum ("eletrônicos", "vestuário"),
disponibilidade boolean,
primary key (id)
);

insert into tb_produtos (nome, preco, categoria, disponibilidade) values ("smartphone xmas", 1000.00, "eletrônicos",true);
insert into tb_produtos (nome, preco, categoria, disponibilidade) values ("smartwatch xmas3000", 800.00, "eletrônicos",false);
insert into tb_produtos (nome, preco, categoria, disponibilidade) values ("pacote 5 camisetas", 150.00, "vestuário",true);
insert into tb_produtos (nome, preco, categoria, disponibilidade) values ("calça mom jeans", 70.00, "vestuario",true);
insert into tb_produtos (nome, preco, categoria, disponibilidade) values ("smartphone xmas xx", 2000.00, "eletrônicos",false);
insert into tb_produtos (nome, preco, categoria, disponibilidade) values ("jaqueta bomber azul", 100.00, "vestuário",true);
insert into tb_produtos (nome, preco, categoria, disponibilidade) values ("jaqueta bomber dourada", 119.99, "vestuário",true);
insert into tb_produtos (nome, preco, categoria, disponibilidade) values ("saia midi", 79.99, "vestuário",true);

select * from tb_produtos where preco>500;

select * from tb_produtos where preco<500;

update tb_produtos set disponibilidade=false where id=1;

select * from tb_produtos;
