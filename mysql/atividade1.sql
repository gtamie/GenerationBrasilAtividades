create database db_rh;

use db_rh;

create table tb_funcionaries (
id int auto_increment,
nome varchar(50) not null,
cpf bigint (11) not null,
setor enum ('Contabilidade','Almoxarifado','Vendas'),
salario int not null,
primary key (id)
);

alter table tb_funcionaries modify salario decimal (7,2);

insert into tb_funcionaries (nome, cpf, setor, salario) values ('Ana Sousa', 11111111111, 'Vendas', 4000.00);

insert into tb_funcionaries (nome, cpf, setor, salario) values ('Bruna Alves', 33333333333, 'Vendas', 4000.00);

insert into tb_funcionaries (nome, cpf, setor, salario) values ('Paulo Arraquis', 55555555555, 'Almoxarifado', 1500.00);

insert into tb_funcionaries (nome, cpf, setor, salario) values ('Helena Queler', 7777777777, 'Contabilidade', 3800.00);

insert into tb_funcionaries (nome, cpf, setor, salario) values ('Luana Silva', 44444444444, 'Contabilidade', 1900.00);

select * from tb_funcionaries where salario>2000;

select * from tb_funcionaries where salario<2000;

update tb_funcionaries set salario=1600.00 where id=4;

select * from tb_funcionaries;

