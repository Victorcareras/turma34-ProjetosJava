create database db_generation_game_online;

USE db_generation_game_online; 


create table tb_classe (
id bigint auto_increment,
classe varchar (20) not null,
ativo boolean,
primary key(id)

); 

INSERT INTO tb_classe (classe,ativo) 
VALUES
("mago", true),
("Guerreiro",true),
("Arqueiro", true),
("Curandeiro",true),
("Assassino",true);
select * from tb_classe;

create table tb_personagem (
id bigint auto_increment,
nome varchar (40) not null,
nivel_poder_ataque int not null,
nivel_poder_defesa int not null,
arma varchar(40) not null,
arma_secundaria varchar(40) not null,
ativo boolean,
id_classe bigint not null,
primary key(id),
foreign key (id_classe) references tb_classe (id)
); 

INSERT INTO tb_personagem (nome,id_classe,nivel_poder_ataque,nivel_poder_defesa,arma,arma_secundaria,ativo) 
VALUES 
("Cold raven", 5, 5000, 500, "Adaga mitica ", "Dardos com veneno", true),
("Magical emerald", 1, 13000, 9000, "Cajado do vazio", "Orbes explosivas", true),
("Brave guardian", 3, 5000, 2000, "Arco mitico", "Espada forjada", true),
("Furious sword", 2, 7000, 1500, "Espada flamejante", "Adaga lendaria", true),
("Calm sword", 2, 7000, 1500, "Espada congelante", "Adaga lendaria", true),
("Cursed queen", 4, 500, 20000, "Adaga comum", "Armadilhas raras", true),
("Blind hunter", 3, 3000, 1000, "Arco unico", "Espada comum", true),
("Wonded king", 5, 4500, 500, "Foice lendaria", "Adaga rara", true);
select * from tb_personagem;
select * from tb_personagem where nivel_poder_ataque > 2000;
select * from tb_personagem where nivel_poder_defesa  >= 1000  && nivel_poder_defesa <= 2000;
select * from tb_personagem where nome like "%C%";
select * from tb_personagem where arma like "%arco%";




select classe, nome
from  tb_classe inner join tb_personagem on tb_classe.id = tb_personagem.id_classe where id_classe = 3;