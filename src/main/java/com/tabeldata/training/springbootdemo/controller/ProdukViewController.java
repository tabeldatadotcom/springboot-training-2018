/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tabeldata.training.springbootdemo.controller;

import com.tabeldata.training.springbootdemo.dao.ProdukDao;
import com.tabeldata.training.springbootdemo.dao.ProdukJpaDao;
import com.tabeldata.training.springbootdemo.entity.Produk;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author dimasm93
 */
@Controller
@RequestMapping("/produk")
public class ProdukViewController {
    
    @Autowired
    private ProdukJpaDao dao;
    
    @GetMapping("/list")
    public ModelAndView listProduk(ModelAndView view){
        view.setViewName("/produk/list-produk");
        List<Produk> list = dao.findAll();
        view.addObject("products", list);
        return view;
    }
    
}
