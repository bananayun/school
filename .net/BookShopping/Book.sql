create table ComputerBk
(
ISBN int not null primary key,
书名 char(30) not null,
作者 char(10) not null,
价格 money,
入库数量 int,
销售数量 int,
简介 char(100),
图片地址 char(40)

)