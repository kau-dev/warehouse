INSERT INTO warehouse.category ( name) VALUES ( 'Книги');
INSERT INTO warehouse.category ( name) VALUES ( 'Електродвигуни');
INSERT INTO warehouse.category ( name) VALUES ( 'Запчастини для електродвигунів');
INSERT INTO warehouse.category ( name) VALUES ( 'Будівельні матеріали');

INSERT INTO warehouse.counterparty ( buyer,contractor,itin, maincounterparty,name,other) VALUES ( 1, 1, '82344124', '0', 'ТОВ  "ДЕЛЛ УКРАЇНА"',1);
INSERT INTO warehouse.counterparty ( buyer,contractor,itin, maincounterparty,name,other) VALUES ( 1, 1, '56743223', '0', 'ТОВ КИИВСЬКИЙ ВЕНТИЛЯЦИЙНИЙ ЗАВОД',1);
INSERT INTO warehouse.counterparty ( buyer,contractor,itin, maincounterparty,name,other) VALUES ( 1, 1, '83322344', '0', 'ФОП Правдивий О.В.',1);
INSERT INTO warehouse.counterparty ( buyer,contractor,itin, maincounterparty,name,other) VALUES ( 1, 1, '45453222', '0', 'ТОВ "КЕРНЕЛ-ТРЕЙД"',1);
INSERT INTO warehouse.counterparty ( buyer,contractor,itin, maincounterparty,name,other) VALUES ( 1, 1, '77899996', '0', 'ТОВ"ТЕРМОКОМ ВК"',1);
INSERT INTO warehouse.counterparty ( buyer,contractor,itin, maincounterparty,name,other) VALUES ( 1, 1, '', '0', 'Нікітін Олег Олексійович',1);
INSERT INTO warehouse.counterparty ( buyer,contractor,itin, maincounterparty,name,other) VALUES ( 1, 1, '', '0', 'Микитенко В. В.',1);

# INSERT INTO warehouse.storage (id,barcode,height,length,name,width,parent_id) VALUES(1 ,'1024',5,50,'Основной склад',30,null);
INSERT INTO warehouse.storage (barcode,height,length,name,width,parent_id) VALUES('1024',5,50,'Сектор А',30,1);
INSERT INTO warehouse.storage (barcode,height,length,name,width,parent_id) VALUES('1024',5,50,'Сектор В',30,1);

INSERT INTO warehouse.employee (name,position,storage_id,birth_day,employment_date,country,passport_date,passport_from,passport_num,passport_ser,social_num,tin) VALUES
( 'Беседовська Тетяна Олександрівна', 'Бухгалтер',null,'1986-05-26','2022-01-15','Україна','2002-08-12','МВ УМВС в Миколаївській обл.','231453','МН','35234623424333','3564564922');
