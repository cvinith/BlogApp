
insert into Location(id, name) values(1, 'Hyd');
insert into Location(id, name) values(2, 'Sec');
insert into Location(id, name) values(3, 'AP');

insert into User(id, first_name, last_name, email, locationid) values(1, 'aaa', 'xxx', 'aaa@gmail.com', 1);
insert into User(id, first_name, last_name, email, locationid) values(2, 'bbb', 'yyy', 'bbb@gmail.com', 2);
insert into User(id, first_name, last_name, email, locationid) values(3, 'ccc', 'zzz', 'ccc@gmail.com', 3);

insert into Post(id, post_date, details, userid) values(1, CURRENT_TIMESTAMP(), 'Very good post', 1);
insert into Post(id, post_date, details, userid) values(2, CURRENT_TIMESTAMP(), 'A rainy day', 2);
insert into Post(id, post_date, details, userid) values(3, CURRENT_TIMESTAMP(), 'nice tutorials', 3);