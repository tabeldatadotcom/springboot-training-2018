/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tabeldata.training.springbootdemo.dao;

import com.tabeldata.training.springbootdemo.entity.Produk;
import com.tabeldata.training.springbootdemo.repository.ProdukRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author dimasm93
 */
@Repository
public class ProdukJpaDao {
    
    @Autowired
    private ProdukRepository repo;
    
    public List<Produk> findAll(){
        return repo.findAll();
    }
    
    public Produk save(Produk produk){
        return repo.save(produk);
    }
    
    public Optional<Produk> findById(String id){
        return repo.findById(id);
    }
    
    public void deleteById(String id){
        repo.deleteById(id);
    }
    
}
