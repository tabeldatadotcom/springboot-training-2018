/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tabeldata.training.springbootdemo.repository;

import com.tabeldata.training.springbootdemo.entity.ProdukSpec;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author dimasm93
 */
public interface ProdukSpekRepository extends CrudRepository<ProdukSpec, Long>{
    
}
