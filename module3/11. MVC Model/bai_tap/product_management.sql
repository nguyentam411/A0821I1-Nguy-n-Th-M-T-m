create database product_management;
use product_management;
create table product(
id int not null,
name varchar(100),
price float,
description varchar(50),
producer varchar(20)
);
insert into product(id,name,price,description,producer) values(1, "pen", 10, "blue", "abc");
insert into product(id,name,price,description,producer) values(2, "book", 15, "no", "aaa");
insert into product(id,name,price,description,producer) values(3, "bag", 50, "green", "aaa");
insert into product(id,name,price,description,producer) values(4, "pencil", 5, "no", "aaa");
insert into product(id,name,price,description,producer) values(5, "ruler", 10, "no", "aaa");
select * from product_management.product;