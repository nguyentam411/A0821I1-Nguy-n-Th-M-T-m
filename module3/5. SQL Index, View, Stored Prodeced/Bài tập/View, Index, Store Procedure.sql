create database demo_view_index_store_procedure;
use demo_view_index_store_procedure;
create table Products(
Id int not null primary key,
productCode varchar(10) ,
productName varchar(25),
productPrice int,
productAmount int,
productDescription varchar(30),
productStatus bit
);
insert into products values
(1,'A123','pen',1000,5,'blue',1),
(2,'B123','book',5000,10,'green',0),
(3,'A124','ruler',3000,2,'red',1);
 create unique index unique_index
 on products(productCode);
 create index composite_index
 on products(productName,productPrice);
 drop index unique_index on products;
 drop index composite_index on products;
 select * from products 
 where productCode='B123';
 select * from products 
where productName='pen' or productPrice=5000;
 explain select * from products 
 where productCode='B123';
explain select * from products 
where productName='pen' or productPrice=5000;
 drop TABLE PRODUCTS;
 create view product_info as
 select productCode,productName,productPrice,productStatus from products;
 insert into product_info value
 ('C123','pencil',4000,1);
 update product_info 
 set productPrice=6000
 where productName='pen';
 drop view product_info;
 DELIMITER //
 create procedure getAll()
 begin 
 select * from products;
 end // 
 call getAll();
 
DELIMITER //
 create procedure addProduct(
in id int,
in `code` varchar(20),
in `name` varchar(25),
in price int,
in amount int,
in `description` varchar(30),
in `status` bit)
 begin 
 insert into products (Id,productCode,productName,productPrice,productAmount,productDescription,productStatus) value
 (id,`code`,`name`,price,amount,`description`,`status`);
 end // 
 call addProduct(5,'D123','bag',20000,4,'BLUE',1);
DELIMITER //
 create procedure updateProduct(
 in id_update int,
-- in `code` varchar(20),
in `name` varchar(25),
in price int,
in amount int,
in `description` varchar(30),
in `status` bit)
 begin 
 update products
 set 
 -- productCode=`code`,
 productName=`name`
 AND productPrice=`price`
 AND productAmount=`amount`
 AND productDescription=`description`
 AND productStatus=`status`
 where Id=id_update;
 end // 
 call updateProduct(1,'bag',1000,5,'black',1)
 DELIMITER //
 create procedure deleteProduct(IN id_delete int)
 begin 
 delete from products
 where Id=id_delete;
 end // 
call deleteProduct(2);