create database demoExam;
create table product(
id int primary key auto_increment,
name varchar(100),
price float,
quantity int,
colorId int,
categoryid int,
foreign key (categoryid) references category(id),
foreign key (colorid) references color(id)

);
create table category(
id int not null primary key auto_increment,
`name` varchar(100)
);
insert into product(id,name,price,quantity,color,categoryId) values(1, "Iphone11", 799.0,12, "purple,yellow,green", 1);
insert into product(id,name,price,quantity,color,categoryId) values(2, "Smart TV", 1000000,5, "black", 2);
insert into product(id,name,price,quantity,color,categoryId) values(3, "Iphone X", 749.0,5, "blue", 1);
insert into category(id,name) values(1,"Phone");
insert into category(id,name) values(2,"Television");
create table color(
id int not null primary key auto_increment,
`name` varchar(100)
);