create database casestudy;
use casestudy;
create table vi_tri(
ma_vi_tri int not null unique primary key,
ten_vi_tri varchar(25)
);
-- drop table vi_tri;
select * from vi_tri;
insert into vi_tri values
(1,'Quản Lý'),
(2,'Nhân Viên');
create table trinh_do(
ma_trinh_do  int not null unique primary key,
ten_trinh_do varchar(25)
);
insert into trinh_do values
(1,'Trung Cấp'),
(2,'Cao Đẳng'),
(3,'Đại Học'),
(4,'Sau Đại Học');
create table bo_phan(
ma_bo_phan int not null unique primary key,
ten_bo_phan varchar(25)
);
insert into bo_phan values
(1,'Sale-Marketing'),
(2,'Hành chính'),
(3,'Phục vụ'),
(4,'Quản lý');
create table nhan_vien(
ma_nhan_vien int not null unique primary key,
ho_ten varchar(40),
ngay_sinh date,
so_cmnd int,
luong int,
so_dien_thoai int,
email varchar(40),
dia_chi varchar(50),
ma_vi_tri int,
ma_trinh_do int,
ma_bo_phan int,
foreign key (ma_vi_tri) references vi_tri(ma_vi_tri),
foreign key (ma_trinh_do) references trinh_do(ma_trinh_do),
foreign key (ma_bo_phan) references bo_phan(ma_bo_phan)
);
insert into nhan_vien values
(1,'Nguyễn Văn An','1970-11-07',456231786,10000000,0901234121,'annguyen@gmail.com','295 Nguyễn Tất Thành, Đà Nẵng',1,3,1), 
(2,'Lê Văn Bình','1997-04-09',654231234,7000000,0934212314,'binhlv@gmail.com','22 Yên Bái, Đà Nẵng',1,2,2);
truncate table nhan_vien;
create table loai_khach(
ma_loai_khach int not null unique primary key,
ten_loai_khach varchar(20)
);
insert into loai_khach values
(1,'Diamond'),
(2,'Platinium'),
(3,'Gold'),
(4,'Silver'),
(5,'Member');
create table khach_hang(
ma_khach_hang int not null unique primary key,
ho_ten varchar(40),
ngay_sinh date,
gioi_tinh bit,
so_cmnd int,
so_dien_thoai int,
email varchar(40),
dia_chi varchar(40),
ma_loai_khach int,
foreign key(ma_loai_khach) references loai_khach(ma_loai_khach)
);
create table kieu_thue(
ma_kieu_thue int not null unique primary key,
ten_kieu_thue varchar(10)
);
insert into kieu_thue values
(1,'year'),
(2,'month'),
(3,'day'),
(4,'hour');
create table loai_dich_vu(
ma_loai_dich_vu int not null unique primary key,
ten_loai_dich_vu varchar(10)
);
insert into loai_dich_vu values
(1,'Villa'),
(2,'House'),
(3,'Room');
create table dich_vu(
ma_dich_vu int not null unique primary key,
ten_dich_vu varchar(30),
dien_tich int,
chi_phi_thue int,
so_nguoi_toi_da int,
tieu_chuan_phong varchar(20),
mo_ta_tien_nghi_khac varchar(30),
dien_tich_ho_boi int,
so_tang int,
ma_kieu_thue int,
ma_loai_dich_vu int,
foreign key(ma_kieu_thue) references kieu_thue(ma_kieu_thue),
foreign key(ma_loai_dich_vu) references loai_dich_vu(ma_loai_dich_vu)
);
create table dich_vu_di_kem(
ma_dich_vu_di_kem int not null unique primary key,
ten_dich_vu_di_kem  varchar(30),
gia int,
don_vi varchar(20),
trang_thai varchar(30)
);
create table hop_dong(
ma_hop_dong int not null primary key,
ngay_lam_hop_dong date,
ngay_ket_thuc date,
tien_dat_coc int,
ma_nhan_vien int,
ma_khach_hang int,
ma_dich_vu int,
foreign key (ma_nhan_vien) references nhan_vien(ma_nhan_vien),
foreign key (ma_khach_hang) references khach_hang(ma_khach_hang),
foreign key (ma_dich_vu) references dich_vu(ma_dich_vu)
);
create table hop_dong_chi_tiet(
ma_hop_dong_chi_tiet int not null primary key,
so_luong int,
ma_hop_dong int,
ma_dich_vu_di_kem int,
foreign key(ma_hop_dong) references hop_dong(ma_hop_dong),
foreign key(ma_dich_vu_di_kem) references dich_vu_di_kem(ma_dich_vu_di_kem)
);