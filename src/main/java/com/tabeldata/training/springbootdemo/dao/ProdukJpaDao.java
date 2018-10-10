/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tabeldata.training.springbootdemo.dao;

import com.tabeldata.training.springbootdemo.entity.Kategori;
import com.tabeldata.training.springbootdemo.entity.Produk;
import com.tabeldata.training.springbootdemo.entity.ProdukSpec;
import com.tabeldata.training.springbootdemo.repository.KategoriRepository;
import com.tabeldata.training.springbootdemo.repository.ProdukRepository;
import com.tabeldata.training.springbootdemo.repository.ProdukSpekRepository;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Repository;

/**
 *
 * @author dimasm93
 */
@Repository
public class ProdukJpaDao {
    
    @Autowired
    private ProdukRepository repo;
    
    @Autowired
    private ProdukSpekRepository repoSpek;
    
    @Autowired
    private KategoriRepository repoKategori;
    
    public List<Produk> findAll(){
        return repo.findAll();
    }
    
    public Page<Produk> findAllPegination(Pageable page){
        return repo.findAll(page);
    }
    
    public Produk save(Produk produk){
        ProdukSpec spek = repoSpek.save(produk.getSpek());
        produk.setSpek(spek);
        Iterable<Kategori> categories = repoKategori.saveAll(produk.getCategories());
        List<Kategori> listCategories = new ArrayList<>();
        categories.forEach(data -> {
            listCategories.add(data);
        });
        produk.setCategories(listCategories);
        return repo.save(produk);
    }
    
    public Optional<Produk> findById(String id){
        return repo.findById(id);
    }
    
    public void deleteById(String id){
        repo.deleteById(id);
    }
    
}
