create database db_cursoDaMinhaVida;

use db_cursoDaMinhaVida;

create table tb_categoria (
id bigint auto_increment,
nome_categoria varchar(30) not null,
ativo boolean, 
primary key (id)
);

create table tb_curso (
id bigint auto_increment,
nome varchar(30) not null,
preco decimal (6,2) not null,
duracao int not null,
id_categoria bigint not null,
primary key (id),
foreign key (id_categoria) references tb_categoria(id)
);

-- popular a tabela categoria
insert into tb_categoria (nome_categoria, ativo) values ("Programação", true);
insert into tb_categoria (nome_categoria, ativo) values ("Costura", false);
insert into tb_categoria (nome_categoria, ativo) values ("Línguas", true);
insert into tb_categoria (nome_categoria, ativo) values ("Matemática", true);
insert into tb_categoria (nome_categoria, ativo) values ("Música", true);

-- popular a tabela curso
insert into tb_curso (nome, preco, duracao, id_categoria) values ("Aprenda Python do zero", 80.00, 120, 1);
insert into tb_curso (nome, preco, duracao, id_categoria) values ("Curso básico de Amigurumi", 50.00, 15, 2);
insert into tb_curso (nome, preco, duracao, id_categoria) values ("Aprenda japonês com animes", 70.00, 100, 3);
insert into tb_curso (nome, preco, duracao, id_categoria) values ("Aprenda coreano com k-drama", 70.00, 100, 3);
insert into tb_curso (nome, preco, duracao, id_categoria) values ("Análise combinatória", 30.00, 15, 4);
insert into tb_curso (nome, preco, duracao, id_categoria) values ("Teoria musical", 50.00, 45, 5);
insert into tb_curso (nome, preco, duracao, id_categoria) values ("Rock na gaita", 30.00, 30, 5);
insert into tb_curso (nome, preco, duracao, id_categoria) values ("Piano: curso 1", 100.00, 80, 5);

-- filtrar cursos com valor maior que 50 reais
select nome,concat("R$", format (preco,2,"pt_BR")) as preco from tb_curso where preco>50;

-- filtrar cursos com valor entre 3 e 60 reais
select nome,concat("R$", format (preco,2,"pt_BR")) as preco from tb_curso where preco between 3 and 60 order by preco;

-- buscar cursos com a letra j no nome
select * from tb_curso where nome like "%j%";

-- fazer um select com Inner join entre tabela categoria e curso
select tb_curso.id, nome, preco, duracao, id_categoria, tb_categoria.nome_categoria, tb_categoria.ativo from tb_curso 
inner join tb_categoria on tb_categoria.id=tb_curso.id_categoria;

-- filtrar frutas não-cítricas
select tb_curso.id, nome, preco, duracao, id_categoria, tb_categoria.nome_categoria, tb_categoria.ativo from tb_curso
inner join tb_categoria on tb_categoria.id=tb_curso.id_categoria
where tb_categoria.nome_categoria="Música";

