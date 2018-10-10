/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tabeldata.training.springbootdemo.repository;

import com.tabeldata.training.springbootdemo.entity.Kategori;
import java.util.List;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 *
 * @author dimasm93
 */
public interface KategoriRepository extends PagingAndSortingRepository<Kategori, String>{
    
//    List<Kategori> saveAll(List<Kategori> list);
    
}
