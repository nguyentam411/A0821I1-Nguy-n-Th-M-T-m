use quanlybanhang;
insert into customer values 
(1,'Minh Quan',10),
(2,'Ngoc Oanh',20),
(3,'Hong Ha',50);
insert into `order` (oID,cID,oDate) values
(1,1,'2006-03-21'),
(2,2,'2006-03-23'),
(3,1,'2006-03-16');
insert into product values
(1,'May Giat',3),
(2,'Tu Lanh',3),
(3,'Dieu Hoa',3),
(4,'Quat',3),
(5,'Bep Dien',3);
insert into orderdetail values
(1,1,3),
(1,3,7),
(1,4,2),
(2,1,1),
(3,1,8),
(2,5,4),
(2,3,3);
select oID,oDate,oTotalPrice from `order`;
select cName,pName from customer as c
join `order` as o on o.cID=c.cID
join orderdetail as od on od.oID=c.cID
join product as p on p.pID =od.pID;
select cName from customer
where not cName in ((select distinctrow cName from customer as c
join `order` as o on c.cID=o.cID ))
update `order`
z-- set oTotalPrice=(select odQTY from orderdetail limit 1 )*(select pPrice from product);
set oTotalPrice=od.odQTY*p.pPrice
from `order`
join orderdetail as od
join product as p
select oID,oDate,oTotalPrice from `order`;
alter table `order`
alter column oTotalPrice
set default oTotalPrice=orderdetail.odQTY*product.pPrice