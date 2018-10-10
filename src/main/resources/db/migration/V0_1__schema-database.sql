/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * Author:  dimasm93
 * Created: Oct 3, 2018
 */

create table produk(
    id varchar(36) not null primary key,
    kode varchar(50) not null unique,
    nama varchar(100) not null,
    harga decimal not null default 0,
    qty int not null default 0
) engine = InnoDB;

insert into produk(id, kode, nama, harga, qty) values 
    ('produk-001', 'produk-001', 'Macbook Pro 13 inch', 28000000, 5),
    ('produk-002', 'produk-002', 'Macbook Pro 15 inch', 50000000, 2),
    ('produk-003', 'produk-003', 'Apple watch', 3000000, 1); 
    