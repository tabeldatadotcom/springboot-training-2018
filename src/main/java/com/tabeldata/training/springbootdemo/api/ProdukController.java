/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tabeldata.training.springbootdemo.api;

import com.tabeldata.training.springbootdemo.dao.ProdukJpaDao;
import com.tabeldata.training.springbootdemo.entity.Produk;
import java.util.List;
import java.util.NoSuchElementException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author dimasm93
 */
@RestController
@RequestMapping("/api/produk")
public class ProdukController {

    @Autowired
    private ProdukJpaDao dao;

    @GetMapping("/{kode}/findById")
    public ResponseEntity<Produk> findById(@PathVariable("kode") String id) {
        try {
            Produk produk = dao.findById(id).get();
            return ResponseEntity.ok(produk);
        } catch (NoSuchElementException erdae) {
            return ResponseEntity.noContent().build();
        }
    }
    
    @GetMapping("/list")
    public List<Produk> findAll(){
        return dao.findAll();
    }
    
     @GetMapping("/page")
    public Page<Produk> findAllByPage(Pageable page){
        return dao.findAllPegination(page);
    }
    
    @PostMapping("/")
    public ResponseEntity<Produk> save(@RequestBody Produk produk){
        produk = this.dao.save(produk);
        return ResponseEntity.ok(produk);
    }
    
    @PutMapping("/")
    public ResponseEntity<Produk> update(@RequestBody Produk produk){
        produk = this.dao.save(produk);
        return ResponseEntity.ok(produk);
    }
    
    @DeleteMapping("/{kode}")
    public ResponseEntity<Produk> delete(@PathVariable("kode") String kode){
        this.dao.deleteById(kode);
        return ResponseEntity.ok().build();
    }

}
