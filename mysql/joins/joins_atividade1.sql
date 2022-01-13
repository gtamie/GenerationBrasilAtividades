create database db_generation_game_online;
use db_generation_game_online;

-- criar tabela classe
create table tb_classe(
idClasse int auto_increment,
nomeClasse varchar(30) not null,
arma varchar(30),
primary key (idClasse)
);

-- criar tabela personagem
create table tb_personagem(
idPersonagem int auto_increment,
nomePersonagem varchar(30) not null,
forca int not null,
agilidade int not null,
defesa int not null,
idClasse int not null,
primary key (idPersonagem),
foreign key (idClasse) references tb_classe(idClasse)
);

-- popular tabela classe
insert into tb_classe (nomeClasse, arma) values ("paladino", "espada");
insert into tb_classe (nomeClasse, arma) values ("mago", "cajado");
insert into tb_classe (nomeClasse, arma) values ("arqueiro", "arco");
insert into tb_classe (nomeClasse, arma) values ("assassino", "adaga");
insert into tb_classe (nomeClasse) values ("lutador");

-- trocar força por ataque
ALTER TABLE tb_personagem CHANGE forca ataque int not null;

-- popular tabela personagem
insert into tb_personagem (nomePersonagem, ataque, agilidade, defesa, idClasse) values ("Lancelote",1000,500,1200,1);
insert into tb_personagem (nomePersonagem, ataque, agilidade, defesa, idClasse) values ("Merlin",500,1500,2000, 2);
insert into tb_personagem (nomePersonagem, ataque, agilidade, defesa, idClasse) values ("Katniss",800,2000,900, 3);
insert into tb_personagem (nomePersonagem, ataque, agilidade, defesa, idClasse) values ("Chucky",1200,1700,800, 4);
insert into tb_personagem (nomePersonagem, ataque, agilidade, defesa, idClasse) values ("Rocky",900,1500,1000, 5);
insert into tb_personagem (nomePersonagem, ataque, agilidade, defesa, idClasse) values ("Hermione",500,1500,2000,2);
insert into tb_personagem (nomePersonagem, ataque, agilidade, defesa, idClasse) values ("Saitama",2100,500,500,5);
insert into tb_personagem (nomePersonagem, ataque, agilidade, defesa, idClasse) values ("Kirishima",500,500,2100,5);

-- selecionar personagens com ataque>2000
select nomePersonagem,ataque from tb_personagem where ataque>2000;

-- selecionar personagens com defesa entre 1000 e 2000
select nomePersonagem, defesa from tb_personagem where defesa<2000 and defesa>1000;

-- selecionar personagens com a letra c no nome
select * from tb_personagem where nomePersonagem like "%C%";

-- fazer select com inner join entre as duas tabelas
select * from tb_personagem
	inner join tb_classe on tb_classe.idClasse = tb_personagem.idClasse;

-- fazer select para filtrar arqueiros
select * from tb_personagem where idClasse=3;
