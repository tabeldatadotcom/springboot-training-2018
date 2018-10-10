/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tabeldata.training.springbootdemo.repository;

import com.tabeldata.training.springbootdemo.entity.Produk;
import java.util.List;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 *
 * @author dimasm93
 */
public interface ProdukRepository extends PagingAndSortingRepository<Produk, String>{
    @Override
    List<Produk> findAll();
}
