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
join `order` as o on c.cID=o.cID ));
update  `order`,orderdetail,product
-- -- set oTotalPrice=orderdetail.odQTY*product.pPrice;
set oTotalPrice=null;
with totalPrice as(select o.oID,o.oDate, p.pID, p.pPrice,sum(od.odQTY) as total from orderdetail as od
left join `order` as o on o.oID=od.oID
join product as p on od.pID=p.pID
where od.pID=p.pID
group by od.pID)
select totalPrice.oID,totalPrice.oDate,(totalPrice.pPrice* totalPrice.total) as oTotalPrice from totalPrice;
-- (select pPrice from product as p
-- join orderdetail as od on od.pID=p.pID
-- where od.pID=p.pID);
 
-- set oTotalPrice=odQTY in((select odQTY from orderdetail))* pPrice in((select pPrice from product));
select oID,oDate,oTotalPrice from `order`;
-- join orderdetail as od on o.oID=od.oID
-- join product as p on od.pID=p.pID
-- ;
 