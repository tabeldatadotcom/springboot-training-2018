/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tabeldata.training.springbootdemo.entity;

import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;

/**
 *
 * @author dimasm93
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "produk")
public class Produk {
    
    @Id
    @GenericGenerator(name = "string_generator", strategy = "uuid2")
    @GeneratedValue(generator = "string_generator")
    @Column(name = "id", length = 36, nullable = false, unique = true)
    private String id;
    @Column(name = "kode", length = 50, nullable = false, unique = true)
    private String kode;
    @Column(name = "nama", length = 100, nullable = false)
    private String nama;
   
    private BigDecimal harga;
    private Integer qty;
    
}
