/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * Author:  dimasm93
 * Created: Oct 10, 2018
 */

alter table produk
add column spek_id bigint default null;

create table produk_spec(
    spek_id bigint not null primary key auto_increment,
    description varchar(255)
) engine = InnoDB;