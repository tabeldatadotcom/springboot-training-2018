/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tabeldata.training.springbootdemo.dao;

import com.tabeldata.training.springbootdemo.entity.ProdukSpec;
import com.tabeldata.training.springbootdemo.repository.ProdukSpekRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author dimasm93
 */
@Repository
public class ProdukSpekDao {
    
    @Autowired
    private ProdukSpekRepository repository;
    
    public ProdukSpec save(ProdukSpec spec){
        return this.repository.save(spec);
    }
    
}
