create database db_escola;

use db_escola;

create table tb_estudantes(
id bigint auto_increment,
nome varchar(50) not null,
nota decimal(3,1) not null,
turma varchar(2) not null,
data_nasc date not null,
primary key (id)
);

insert into tb_estudantes (nome, nota, turma, data_nasc) values ("André Marques", 7.5, "3B",11/06/2006);
insert into tb_estudantes (nome, nota, turma, data_nasc) values ("Bruna Vieira", 8.4, "3B",17/10/2006);
insert into tb_estudantes (nome, nota, turma, data_nasc) values ("Carlos Henrique", 6.9, "2A",05/04/2007);
insert into tb_estudantes (nome, nota, turma, data_nasc) values ("Luiza Souza", 8.5, "3A",11/11/2006);
insert into tb_estudantes (nome, nota, turma, data_nasc) values ("Mia Camargo", 9.5, "3B",26/02/2006);
insert into tb_estudantes (nome, nota, turma, data_nasc) values ("Alice Garcia", 5.5, "3A",01/04/2006);
insert into tb_estudantes (nome, nota, turma, data_nasc) values ("Renato Campos", 8.7, "3B",06/01/2006);
insert into tb_estudantes (nome, nota, turma, data_nasc) values ("Felipe Neves", 5.5, "3B",01/08/2006);


select * from tb_estudantes where nota>7;

select * from tb_estudantes where nota<7;

update tb_estudantes set data_nasc='2006-12-20' where id=1;
update tb_estudantes set data_nasc='2006-01-05' where id=2;
update tb_estudantes set data_nasc='2007-10-27' where id=3;
update tb_estudantes set data_nasc='2006-07-20' where id=4;
update tb_estudantes set data_nasc='2006-09-22' where id=5;
update tb_estudantes set data_nasc='2006-02-07' where id=6;
update tb_estudantes set data_nasc='2006-11-01' where id=7;
update tb_estudantes set data_nasc='2006-12-23' where id=8;

select * from tb_estudantes;