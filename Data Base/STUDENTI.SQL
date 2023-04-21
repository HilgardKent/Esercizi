CREATE TABLE studenti (
  id int primary key,
  nome varchar (30) not null
  );
  
  CREATE TABLE corsi (
  id int primary key,
  nome varchar (30) not null
  );
  
  CREATE TABLE frequenta (
  idc int, 
  ids int,
  primary key(ids ,idc),
  foreign key (ids) references studenti (id),
  foreign key (idc) references corsi (id)
  );
  
  INSERT INTO studenti (id, nome)
  VALUES 
  (1, "mara"),
  (2, "gianni"),
  (3, "stefano");
  
  INSERT INTO corsi (id, nome)
  VALUES 
  (1, "qsl"),
  (2, "java"),
  (3, "html");
  
  INSERT INTO frequenta (ids, idc)
  VALUES 
  (1,1),
  (1,2),
  (2,1),
  (2,2);

update studenti
set nome = "marta"
WHERE id=1;






CREATE TABLE studenti (
  id int primary key,
  nome varchar (30) not null
  );
  
  CREATE TABLE corsi (
  id int primary key,
  nome varchar (30) not null
  );
  
  CREATE TABLE frequenta (
  idc int, 
  ids int,
  primary key(ids ,idc),
  foreign key (ids) references studenti (id)
  on update cascade,
  foreign key (idc) references corsi (id)
  on update cascade
  );
  
  INSERT INTO studenti (id, nome)
  VALUES 
  (1, "mara"),
  (2, "gianni"),
  (3, "stefano");
  
  INSERT INTO corsi (id, nome)
  VALUES 
  (1, "qsl"),
  (2, "java"),
  (3, "html");
  
  INSERT INTO frequenta (ids, idc)
  VALUES 
  (1,1),
  (1,2),
  (2,1),
  (2,2);

  update studenti
  set id = 100
  WHERE id=1;




  CREATE TABLE studenti (
  id int primary key,
  nome varchar (30) not null
  );
  
  CREATE TABLE corsi (
  id int primary key,
  nome varchar (30) not null
  );
  
  CREATE TABLE frequenta (
  idc int, 
  ids int,
  primary key(ids ,idc),
  foreign key (ids) references studenti (id)
  on update cascade
  on delete cascade,
  foreign key (idc) references corsi (id)
  on update cascade
  on delete cascade
  );
  
  INSERT INTO studenti (id, nome)
  VALUES 
  (1, "mara"),
  (2, "gianni"),
  (3, "stefano");
  
  INSERT INTO corsi (id, nome)
  VALUES 
  (1, "qsl"),
  (2, "java"),
  (3, "html");
  
  INSERT INTO frequenta (ids, idc)
  VALUES 
  (1,1),
  (1,2),
  (2,1),
  (2,2);

  update studenti
  set id = 100, nome = "hamdi"
  WHERE id=1;
  
  DELETE FROM frequenta 
  WHERE ids = 2 and idc = 1;
  
  DELETE FROM studenti
  WHERE id = 3;
  
  DELETE FROM studenti
  WHERE id = 2;