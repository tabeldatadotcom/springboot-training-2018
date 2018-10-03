/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tabeldata.training.springbootdemo.controller;

import com.tabeldata.training.springbootdemo.dao.ProdukDao;
import com.tabeldata.training.springbootdemo.entity.Produk;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
    private ProdukDao dao;

    @GetMapping("/{kode}/findById")
    public ResponseEntity<Produk> findById(@PathVariable("kode") String id) {
        try {
            Produk produk = dao.findById(id);
            return ResponseEntity.ok(produk);

        } catch (EmptyResultDataAccessException erdae) {
            return ResponseEntity.noContent().build();
        }
    }
    
    @GetMapping("/list")
    public List<Produk> findAll(){
        return dao.findAll();
    }

}
