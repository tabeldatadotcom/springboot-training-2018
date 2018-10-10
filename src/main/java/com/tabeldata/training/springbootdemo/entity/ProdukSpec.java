/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tabeldata.training.springbootdemo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author dimasm93
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "produk_spec")
public class ProdukSpec {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "spek_id", nullable = false, unique = true)
    private Long id;
    
    @Column(name = "description")
    private String description;
    
}
