INSERT INTO warehouse.category ( name) VALUES ( 'Книги');
INSERT INTO warehouse.category ( name) VALUES ( 'Електродвигуни');
INSERT INTO warehouse.category ( name) VALUES ( 'Запчастини для електродвигунів');
INSERT INTO warehouse.category ( name) VALUES ( 'Будівельні матеріали');
INSERT INTO warehouse.storage (id,barcode,height,length,name,width,parent_id) VALUES(1 ,'1024',5,50,'Основной склад',30,null);
INSERT INTO warehouse.storage (barcode,height,length,name,width,parent_id) VALUES('1024',5,50,'Сектор А',30,1);
INSERT INTO warehouse.storage (barcode,height,length,name,width,parent_id) VALUES('1024',5,50,'Сектор В',30,1);

INSERT INTO warehouse.employee (name,position,storage_id,birth_day,employment_date,country,passport_date,passport_from,passport_num,passport_ser,social_num,tin) VALUES( 'Беседовська Тетяна Олександрівна', 'Бухгалтер',null,'1986-05-26','2022-01-15','Україна','2002-08-12','МВ УМВС в Миколаївській обл.','231453','МН','35234623424333','3564564922');
INSERT INTO warehouse.role (role_id, name) VALUES (1, 'anonymous');
INSERT INTO warehouse.role (role_id, name) VALUES (2, 'user');
INSERT INTO warehouse.role (role_id, name) VALUES (3, 'employee');
INSERT INTO warehouse.role (role_id, name) VALUES (4, 'admin');
INSERT INTO warehouse.user (user_id, email, password, username, employee_id, role_role_id) VALUES (1, 'ak1234', '$2a$12$x1SEOI5p0KdYBN9Y9fCz8Ot6fdzAlPTshvHR/w9NRwFWR0s08LP36', 'ak1234', null, 4);
INSERT INTO warehouse.user_roles (user_user_id, roles_role_id) VALUES (1, 4);


INSERT INTO warehouse.counterparty ( buyer,contractor,itin,main_counterparty,name,other,creation_date,company_number,country,external_code,label_name,type,asg_employee_id) VALUES
( 1, 1, '82344124', '0', 'ТОВ  "ДЕЛЛ УКРАЇНА"',1,'2010-01-22','4564563232','Україна',null,'ТОВ  "ДЕЛЛ УКРАЇНА"','1',1);
INSERT INTO warehouse.counterparty ( buyer,contractor,itin,main_counterparty,name,other,creation_date,company_number,country,external_code,label_name,type,asg_employee_id) VALUES
( 1, 1, '56743223', '0', 'ТОВ КИИВСЬКИЙ ВЕНТИЛЯЦИЙНИЙ ЗАВОД',1,'2017-09-12','456434232','Україна',null,'ТОВ КИИВСЬКИЙ ВЕНТИЛЯЦИЙНИЙ ЗАВОД','1',1);
INSERT INTO warehouse.counterparty ( buyer,contractor,itin,main_counterparty,name,other,creation_date,company_number,country,external_code,label_name,type,asg_employee_id) VALUES
( 1, 1, '83322344', '0', 'ФОП Правдивий О.В.',1,'2010-01-22','23453232','Україна',null,'ФОП Правдивий О.В.','2',1);
INSERT INTO warehouse.counterparty ( buyer,contractor,itin,main_counterparty,name,other,creation_date,company_number,country,external_code,label_name,type,asg_employee_id) VALUES
( 1, 1, '45453222', '0', 'ТОВ "КЕРНЕЛ-ТРЕЙД"',1,'2012-10-25','4560763232','Україна',null,'ТОВ "КЕРНЕЛ-ТРЕЙД"','1',1);
INSERT INTO warehouse.counterparty ( buyer,contractor,itin,main_counterparty,name,other,creation_date,company_number,country,external_code,label_name,type,asg_employee_id) VALUES
( 1, 1, '77899996', '0', 'ТОВ"ТЕРМОКОМ ВК"',1,'2011-10-08','45645643232','Україна',null,'ТОВ"ТЕРМОКОМ ВК"','1',1);
INSERT INTO warehouse.counterparty ( buyer,contractor,itin,main_counterparty,name,other,creation_date,company_number,country,external_code,label_name,type,asg_employee_id) VALUES
( 1, 1, null, '0', 'Нікітін Олег Олексійович',1,'2009-07-07',null,'Україна',null,'Нікітін Олег Олексійович','2',1);
INSERT INTO warehouse.counterparty ( buyer,contractor,itin,main_counterparty,name,other,creation_date,company_number,country,external_code,label_name,type,asg_employee_id) VALUES
( 1, 1, null, '0', 'Микитенко В. В.',1,'2005-11-12',null,'Україна',null,'Микитенко В. В.','2',1);

INSERT INTO warehouse.good (id, barcode, code, label_name, name, this_group, category_id, parent_id, units_m_id) VALUES (0, null, null, '-', true, 0, 0, 0);
INSERT INTO warehouse.good (id, barcode, code, label_name, name, this_group, category_id, parent_id, units_m_id) VALUES (1, null, null, 'Електродвигуни', 'Електродвигуни', true, 2, 1, 1);
INSERT INTO warehouse.good (id, barcode, code, label_name, name, this_group, category_id, parent_id, units_m_id) VALUES (2, null, null, 'Загальнопромислові електродвигуни', 'Загальнопромислові електродвигуни', true, 2, 1, 1);
INSERT INTO warehouse.good (id, barcode, code, label_name, name, this_group, category_id, parent_id, units_m_id) VALUES (3, null, null, 'Серія АИР', 'Серія АИР', true, 2, 2, 1);
INSERT INTO warehouse.good (id, barcode, code, label_name, name, this_group, category_id, parent_id, units_m_id) VALUES (4, null, null, 'АИР200М4 37 кВт, 1500 об/хв., вик. В3', 'Електродвигун АИР200М4  37 кВт, 1500 об/хв., вик. лапи', false, 2, 3, 1);
INSERT INTO warehouse.good (id, barcode, code, label_name, name, this_group, category_id, parent_id, units_m_id) VALUES (5, null, null, 'АИР160М4 18,5 кВт, 1500 об/хв., В3', 'Електродвигун АИР160М4 18,5кВт, 1500 об/хв., вик. лапи', false, 2, 3, 1);