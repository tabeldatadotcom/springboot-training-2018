/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * Author:  dimasm93
 * Created: Oct 10, 2018
 */

create table categories(
    id varchar(36) not null primary key,
    nama varchar(150) not null,
    description longtext
)engine = InnoDB;

create table produk_category(
    produk_id varchar(36) not null,
    categori_id varchar(36) not null
) engine = InnoDB;
-- 
-- alter table produk_category 
-- add constraint fk_produk_kategori_produk_id foreign key (produk_id)
-- references produk(id) on update cascade on delete cascade;
-- 
-- alter table produk_category
-- add constraint fk_produk_kategori_categori_id foreign key (categori_id)
-- references categories(id) on update cascade on delete cascade;
